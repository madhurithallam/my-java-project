package main.java;

import java.util.Scanner;

public class DataTypes {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        String strVal = null;
        try {
            for (int i = 0; i < count; i++) {
                strVal = input.next();
                long value = Long.parseLong(strVal);
                if (value == (byte) value) {
                    System.out.println(value + " can be fitted in:");
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (value == (short) value) {
                    System.out.println(value + " can be fitted in:");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (value == (int) value) {
                    System.out.println(value + " can be fitted in:");
                    System.out.println("* int");
                    System.out.println("* long");
                } else {
                    System.out.println(value + " can be fitted in:");
                    System.out.println("* long");
                }
            }

        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(strVal + " can't be fitted anywhere.");
        }

    }
}
