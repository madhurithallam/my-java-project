package main.java.string.concepts;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String strOutput = str.substring(start,end);
        System.out.println(strOutput);
        in.close();
    }
}
