package org.example.DefaultMethod;

public interface InterfaceDemo {
  //  void printNameABS();    //earlier Java 8 we preferred abstract method

    default void printName(){
        System.out.println("Welcome to Code Trail aur InterfaceDemoImplementation2 chala hai bhai!!");
    }
}
