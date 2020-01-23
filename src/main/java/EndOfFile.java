package main.java;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        while (true) {
            String strValue = input.nextLine();
            if (!strValue.isEmpty()) {
                System.out.println(count + " " + strValue);
                count++;
                continue;
            } else {
                break;
            }
        }
    }
}
