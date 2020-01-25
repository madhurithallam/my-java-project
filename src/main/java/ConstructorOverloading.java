package main.java;

class Info{

    Info(String name){
        System.out.println("Hi "+ name);
    }
    Info(String greet1,String greet2){
        System.out.println( greet1 + "  " + greet2);
    }
    Info(int number){
        System.out.println("Roll no "+ number);
    }
}
public class ConstructorOverloading{
    public static void main(String[] args) {
        Info info = new Info(1);
        Info info1 = new Info("Madhu !");
        Info info2 = new Info("Good Morning" , "Have a great day!");

        /**If you don't make this as a sub class(extends Teacher) then you cannot access protected variable of
         * the 'Teacher' class of other package here.

        //import main.java.oops.concepts.Teacher;
        //ConstructorOverloading objn = new ConstructorOverloading();
       // System.out.println(objn.yearsOfFoundation);

         * */
    }

}

