package org.example.Function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> squareMe =i->i * i;
        System.out.println(squareMe.apply(1234567890));
    }
}
