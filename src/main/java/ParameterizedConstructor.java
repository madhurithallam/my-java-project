package main.java;

class Detail {
    String name;
    int number;

    Detail(String inputName, int inputNumber){
        this.name   = inputName;
        this.number = inputNumber;
    }
}

public class ParameterizedConstructor {

    public static void main(String[] args) {
        Detail detail = new Detail("Madhu",23);
        System.out.println(detail.name + "  " + detail.number);
    }
}
