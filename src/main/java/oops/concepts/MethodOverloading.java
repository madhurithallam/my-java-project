package main.java.oops.concepts;

import java.util.Scanner;

/**
 * Polymorphism in Java
 */

public class MethodOverloading {

    public int area(int length , int breadth){
        return length*breadth;
    }

    public int area(int length , int breadth,int height){
        return length*breadth*height;
    }

    public double area(double length , float breadth){
        return length*breadth;
    }
    public static void main(String[] args) {
        MethodOverloading calculate = new MethodOverloading();
        System.out.println("Area :" + calculate.area(10,20));
        System.out.println("Area :" + calculate.area(20,10,20));
        System.out.println("Area :" + calculate.area(9.8,10.2f));
    }
}
