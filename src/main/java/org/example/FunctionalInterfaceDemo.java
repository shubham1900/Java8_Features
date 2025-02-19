package org.example;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

     void abstractMethod();

    default void something(){
        System.out.println("something");
    }
    default void something2(){
        System.out.println("something");
    }
}
