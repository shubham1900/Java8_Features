package org.example;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        FunctionalInterfaceDemo functionalInterfaceDemo = Test::testImplementation;
        functionalInterfaceDemo.abstractMethod();

        /*If no parameter is passed, the method reference can be passed as a lambda expression
        functionalInterfaceDemo f = () -> System.out.println("Implementation of SAM interface");
        f.singleAbstractMethod();*/

    }
    class Test{
        public static void testImplementation(){
            System.out.println("testImplementation");

        }
    }
}
