package com.design.pattern.puralstream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFromTextFile {
    public static void main(String[] args) {

        Class<?> clazz = ArrayList.class;
        clazz.getSuperclass();
        Stream.<Class<?>>iterate(clazz, c -> c.getSuperclass())
                //.filter(c -> c != null)
                .takeWhile(c -> c != null)
                .forEach(System.out::println);

        /*IntStream.range(1, 31).skip(10).limit(10)
                .forEach(i -> System.out.print(i+" "));
        System.out.println();*/

        String sentence = "the quick brown fox jumps over the lazy dog";
        /*sentence.chars().mapToObj(ch -> Character.toString((char) ch))
                .filter(ch -> !ch.equals(" "))
                .distinct().sorted()
                .forEach(System.out::print);*/
        // More efficient since not using array of stream here.
        Pattern pattern = Pattern.compile("\\s");
        long count2 = pattern.splitAsStream(sentence).count();
        //System.out.println("words count: " + count2);

        long count1 = Arrays.stream(sentence.split("\\s")).count();
        //System.out.println("words count: " + count1);

        Path path = null;
        try {
            path = Path.of(StreamFromTextFile.class.getClassLoader()
                    .getResource("data/first-name.txt").toURI());

            try (Stream<String> lines = Files.lines(path);) {
                //lines.skip(20).limit(10).forEach(System.out::println);
                //long count = lines.count();
                //System.out.println(count);
            }

        } catch (URISyntaxException | NullPointerException | IOException e) {
            System.err.println("Error loading or reading the file: " + e.getMessage());
        }
    }
}
