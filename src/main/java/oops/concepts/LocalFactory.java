package main.java.oops.concepts;

public class LocalFactory implements Factory{

    public void production(){
        System.out.println("Steel");
    }
    public void state(){
        System.out.println("Missuori");
    }
    public static void main(String[] args) {
        Factory obj = new LocalFactory();
        obj.state();
        obj.production();
    }
}
