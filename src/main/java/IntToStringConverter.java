package main.java;

import java.util.Scanner;

public class IntToStringConverter {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Integer.toString(input.nextInt());
            System.out.println("Good Job");g
        }catch (Exception e){
            System.out.println("Wrong Answer");
        }

    }
}
