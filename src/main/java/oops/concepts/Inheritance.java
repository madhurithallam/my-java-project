package main.java.oops.concepts;

public class Inheritance extends Teacher {
    int rank = 1;

    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        System.out.println(obj.rank);
        System.out.println(obj.designation);
        System.out.println(obj.getCollegeName());
    }
}
