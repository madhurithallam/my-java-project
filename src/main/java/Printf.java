package main.java;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Printf {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("=============================================================");
        for(int i=0; i<3; i++) {
             String name = input.next();
             int number = input.nextInt();
            System.out.printf("%-15s%03d%n", name, number);
        }
        System.out.println("=============================================================");
    }
}
