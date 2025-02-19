package org.example.Predicate;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        Predicate<String> checkLength = s -> s.length()>=5;
        System.out.println("The Lenght of String is greater than 5: "+checkLength.test("CodeTrail"));

        Predicate<String> checkEvenLength = s -> s.length()%2==0;
        System.out.println("The Lenght of String is even: "+checkEvenLength.test("CodeTrail"));

        //It can be joined with and
        System.out.println("After Mergig with and: "
                +checkLength.and(checkEvenLength).test("CodeTrail"));
        //It can be joined with or
        System.out.println("After Mergig with or: "
                +checkLength.or(checkEvenLength).test("CodeTrail"));
        //It can be joined with negate
        System.out.println("After Mergig with negate: "
                +checkLength.negate().test("CodeTrail"));
    }
}
