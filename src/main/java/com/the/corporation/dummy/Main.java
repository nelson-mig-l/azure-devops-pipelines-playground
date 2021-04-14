package com.the.corporation.dummy;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("+=======+");
        System.out.println("| Hello |");
        System.out.println("+=======+");
        System.out.println();
        Stream.of(args).forEach(System.out::println);
    }
}
