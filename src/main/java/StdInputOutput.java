package main.java;

import java.util.Scanner;

public class StdInputOutput {
    public static void main(String [] args){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        int inputNumber1 = input1.nextInt();
        int inputNumber2 = input2.nextInt();
        int inputNumber3 = input3.nextInt();

        input1.close();
        input2.close();
        input3.close();

        System.out.println(inputNumber1);
        System.out.println(inputNumber2);
        System.out.println(inputNumber3);
    }
}
