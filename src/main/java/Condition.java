package main.java;

import java.util.Scanner;

public class Condition {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number%2 != 0){
            System.out.println("Wierd");
        }else if(number>2 && number<5){
            System.out.println("Not Wierd");
        }else if(number>6 && number<20){
            System.out.println("Wierd Even");
        }else if(number>20) {
            System.out.println("Not Wierd Even");
        }
    }
}
