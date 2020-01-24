package main.java;

import java.util.Scanner;

class Parallelogram{
    static int breadth;
    static int height;
    static {
        breadth = 10;
        height  = 20;
        System.out.println(breadth * height);
    }
}
public class StaticInitialization {
    public static void main(String[] args) {
        //int area = Parallelogram.breadth * Parallelogram.height;
        Parallelogram area = new Parallelogram();
    }
}
