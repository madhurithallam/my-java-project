package main.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyLocale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inputCurrency =  input.nextDouble();
        NumberFormat usNf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaNf = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat chinaNf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceNf = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US Format = " +usNf.format(inputCurrency));
        System.out.println("India Format = " +indiaNf.format(inputCurrency));
        System.out.println("China Format = " +chinaNf.format(inputCurrency));
        System.out.println("France Format = " +franceNf.format(inputCurrency));
        input.close();
    }
}
