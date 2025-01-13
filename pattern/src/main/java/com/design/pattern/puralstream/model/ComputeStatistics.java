package com.design.pattern.puralstream.model;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComputeStatistics {
    public static void main(String[] args) {

        Function<String, City> lineToCity =
                line -> {
                    String[] split = line.split(";");

                    String cityName = split[1].trim();

                    String state = split[2].trim();

                    String populationAsString = split[3];
                    populationAsString = populationAsString.replace(" ", "");
                    int population = Integer.parseInt(populationAsString);

                    String landAreaAsString = split[4];
                    landAreaAsString = landAreaAsString.replace(" ", "").replace(',', '.');
                    double landArea = Double.parseDouble(landAreaAsString);

                    return new City(cityName, state, population, landArea);
                };
        Set<City> cities = null;
        ClassLoader classLoader = ComputeStatistics.class.getClassLoader();
        try {
            Path path = Path.of(Objects.requireNonNull(classLoader.getResource("data/cities.csv")).toURI());

            try (Stream<String> lines = Files.lines(path, StandardCharsets.ISO_8859_1);) {
                cities = lines.skip(2)
                        .map(lineToCity)
                        .collect(Collectors.toSet());
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch (URISyntaxException e) {
            System.out.println("URISyntaxException: " + e.getMessage());
        }
        System.out.println("# cities = "+ cities.size());

        Map<String, List<City>> cityPerState = cities.stream()
                .collect(Collectors.groupingBy(city -> city.getState()));
        //System.out.println("city per state =" + cityPerState.size());
        List<City> utah = cityPerState.get("Utah");
        //System.out.println(" Cities of Utah:: ");
        //System.out.println(utah);

        Map<String, Long> cityPerStateCount = cities.stream()
                .collect(Collectors.groupingBy(city -> city.getState(), Collectors.counting()));
        //System.out.println("Cities in Utah: "+ cityPerStateCount.get("Utah"));
        Map.Entry<String, Long> stateWithMostCities = cityPerStateCount.entrySet().stream()
                //.max(Comparator.comparing(e -> e.getValue())).orElseThrow();
                //.max(Comparator.comparing(Map.Entry::getValue)).orElseThrow();
                .max(Map.Entry.comparingByValue()).orElseThrow();
        //System.out.println(stateWithMostCities);
        int utah1 = cityPerState.get("Utah").stream().mapToInt(city -> city.getPopulation()).sum();
        //System.out.println(utah1);
        Integer utah2 = cityPerState.get("Utah").stream()
                .collect(Collectors.summingInt(city -> city.getPopulation()));
        System.out.println(utah2);

        Map<String, Integer> cityMap = cities.stream()
                .collect(Collectors.groupingBy(city -> city.getState(),
                        Collectors.summingInt(city -> city.getPopulation())));
        System.out.println("Population of Utah = " + cityMap.get("Utah"));
    }
}
