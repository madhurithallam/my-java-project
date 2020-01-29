package main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayFinder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int day = obj.nextInt();
        int month = obj.nextInt();
        int year = obj.nextInt();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String stringDay = String.format("%02d",day);
        String stringMonth = String.format("%02d",month);
        LocalDate localDate = LocalDate.parse(stringDay+"/"+stringMonth+"/"+year, formatter);
        System.out.println(localDate.getDayOfWeek().name());
    }

}
