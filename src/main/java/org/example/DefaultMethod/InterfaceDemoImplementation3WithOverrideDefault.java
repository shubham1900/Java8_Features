package org.example.DefaultMethod;

public class InterfaceDemoImplementation3WithOverrideDefault implements InterfaceDemo{

    public void printName(){
        System.out.println("Welcome to Code Trail aur ye InterfaceDemoImplementation3WithOverrideDefault overriden method chala hai bhai!!");
    }
    public static void main(String[] args) {
        InterfaceDemoImplementation3WithOverrideDefault demoImplementation3WithOverrideDefault = new InterfaceDemoImplementation3WithOverrideDefault();
        demoImplementation3WithOverrideDefault.printName();
    }
}
