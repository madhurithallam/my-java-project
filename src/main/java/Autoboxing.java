package main.java;

import java.util.ArrayList;

public class Autoboxing {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1;i<=100;i++){
            numbers.add(i);
        }

        for(Integer number:numbers){
            System.out.println(number);
        }

    }
}
