package main.java.oops.concepts;

public class Mango extends Fruits{
    public void taste(){
        System.out.println("Sweet");
    }
    public static void main(String[] args) {
     Fruits obj = new Mango();
     obj.taste();
    }
}
