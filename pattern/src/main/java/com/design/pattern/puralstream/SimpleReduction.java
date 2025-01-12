package com.design.pattern.puralstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SimpleReduction {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 1, 1, 1, 1);
        //List<Integer> ints = List.of();
        //Optional<Integer> reduce = ints.stream().reduce((i1, i2) -> i1 + i2);
        Integer sum = ints.stream().reduce(0, (i1, i2) -> i1 + i2);
        System.out.println("reduce = "+sum);

        //reduce.get();
        //Integer sum = reduce.orElseThrow();
        //System.out.println("Sum = " + sum);
    }
}
