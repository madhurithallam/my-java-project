package main.java.oops.concepts;

import main.java.Condition;

public class DefaultAccessModifier extends Condition{

    public static void main(String[] args) {
       DefaultAccessModifier number = new DefaultAccessModifier();
        /**
         * Uncommenting line12 will not let the class to compile as
         * data member 'rollNo' has default access modifier
         */
       //System.out.println(number.rollNo);
    }
}
