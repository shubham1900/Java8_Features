package org.example.DefaultMethod;

public class DiamondProblemDemo implements DiamondInterface1, DiamondInterface2{
    public void m1(){
        DiamondInterface2.super.m1();
    }
    public static void main(String[] args) {
DiamondProblemDemo diamondProblemDemo = new DiamondProblemDemo();
        diamondProblemDemo.m1();
    }
}
