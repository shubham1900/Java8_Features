package org.example.Function;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = i -> 2 * i;
        System.out.println("Double Function " + doubleIt.apply(2));
        Function<Integer, Integer> cubeMe = i -> i * i * i;
        System.out.println("Cube Function " + cubeMe.apply(2));

        System.out.println("First Doubling using apply " + doubleIt.andThen(cubeMe).apply(2));
        System.out.println("First cubing using compose " + doubleIt.compose(cubeMe).apply(2));
        System.out.println("First cubing using compose -- for commit  ");



    }


}
