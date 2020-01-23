package main.java;
import java.util.Scanner;

public class LoopTwo {

    public static int getValue(int a , int b ,int n){
        int result = a*b*n;
        return result;
    }

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int j = input.nextInt();
        
        for(int i =0; i<j; i++){
            int a= input.nextInt();
            int b= input.nextInt();
            int n= input.nextInt();
            System.out.println(getValue(a,b,n));
        }




    }
}
