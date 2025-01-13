package com.design.pattern.puralstream;


import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Optional.empty;

class ComputeStatistics {
    public static void main(String[] args) {

        Function<String, String> lineToName =
                line -> line.split(";")[1];
// https://en.wikipedia.org/wiki/List_of_United_States_cities_by_population
        Set<String> cities = null;
        ClassLoader classLoader = ComputeStatistics.class.getClassLoader();
        try {
            Path path = Path.of(Objects.requireNonNull(classLoader.getResource("data/cities.csv")).toURI());

            try (Stream<String> lines = Files.lines(path, StandardCharsets.ISO_8859_1);) {
                cities = lines.skip(2)
                        .map(lineToName)
                        .collect(Collectors.toSet());
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch (URISyntaxException e) {
            System.out.println("URISyntaxException: " + e.getMessage());
        }
        //System.out.println(cities.size());

        List<String> citiesWithA = cities
                .stream().filter(city -> city.startsWith("A"))
                .collect(Collectors.toList());
        //System.out.println(citiesWithA);

        String[] array = cities.stream().toArray(String[]::new);
        //System.out.println("# array = " + array.length);

        String joined = cities.stream()
                .filter(name -> name.length()==4)
                .collect(Collectors.joining(", ","[","]"));
        System.out.println(joined);
        String collect = Stream.<String>empty()
                .collect(Collectors.joining(",","[","]"));
        String collect1 = Stream.<String>of("one")
                .collect(Collectors.joining(",","[","]"));
        System.out.println("Collecting an empty stream: " + collect);
        System.out.println("Collecting an empty stream: " + collect1);
    }
}