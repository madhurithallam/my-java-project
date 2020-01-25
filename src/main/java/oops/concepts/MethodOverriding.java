package main.java.oops.concepts;

public class MethodOverriding  extends Teacher{
    @Override
    public String getCollegeName(){
        return "hello";
    }
    public static void main(String[] args) {
        MethodOverriding object = new MethodOverriding();
        System.out.println(object.getCollegeName());
        System.out.println(object.yearsOfFoundation);

        /**If you uncomment the below it will throw compile time error as we
         * declared 'rollNum' as private access specifier which can be accessed only in that class
         */

        //System.out.println(object.rollNum);
    }
}
