package com.design.pattern.puralstream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.DoubleSummaryStatistics;
import java.util.Objects;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        String lineForNewYork = "1; New York; New York; 8 336 817;780,9";
        ToDoubleFunction<String> lineToDensity =
                line -> {
                    String[] split = line.split(";");

                    String populationAsString = split[3];
                    populationAsString = populationAsString.replace(" ", "");
                    int population = Integer.parseInt(populationAsString);

                    String landAreaAsString = split[4];
                    landAreaAsString = landAreaAsString.replace(" ", "")
                            .replace(',', '.');
                    double landArea = Double.parseDouble(landAreaAsString);

                    return population / landArea;
                };
        double density = lineToDensity.applyAsDouble(lineForNewYork);
        System.out.println("Density of New York = " + density);

        try {
            Path path = Path.of(Objects.requireNonNull(StreamDemo.class.getClassLoader().getResource("data/cities.csv")).toURI());

            try (Stream<String> lines = Files.lines(path, StandardCharsets.ISO_8859_1);
                 Stream<String> strLines = Files.lines(path, StandardCharsets.ISO_8859_1);
                 Stream<String> strBLines = Files.lines(path, StandardCharsets.ISO_8859_1);
            ) {

                DoubleSummaryStatistics stats = strBLines.skip(2)
                        .mapToDouble(lineToDensity)
                        .summaryStatistics();

                double max = lines.skip(2)
                        .mapToDouble(lineToDensity)
                        .max()
                        .orElseThrow();

                double min = strLines.skip(2)
                        .mapToDouble(lineToDensity)
                        .min()
                        .orElseThrow();

                System.out.println("Stats = " + stats);
                System.out.println("Max = " + max);
                System.out.println("Min = " + min);
            }
        } catch (NullPointerException e) {
            System.err.println("File not found in the resources folder: "+ e.getMessage());
        } catch (URISyntaxException e) {
            System.err.println("Invalid URI syntax: "+ e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading the file: "+ e.getMessage());
        }
    }
}
