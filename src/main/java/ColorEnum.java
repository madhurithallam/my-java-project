package main.java;

public class ColorEnum {

    enum Color {
        RED, GREEN, BLUE, BLACK;
    }

    public static void main(String[] args) {
        Color arr[] = Color.values();
        for (Color color : arr){
            System.out.println(color);
        }
    }
}
