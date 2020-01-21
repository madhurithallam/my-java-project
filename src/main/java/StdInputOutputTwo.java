package main.java;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class StdInputOutputTwo {
    public static void main(String [] args){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        int number = input1.nextInt();
        double dNumber = input2.nextDouble();
        String string = input3.nextLine();

        System.out.println(string);
        System.out.println(dNumber);
        System.out.println(number);
    }

}
