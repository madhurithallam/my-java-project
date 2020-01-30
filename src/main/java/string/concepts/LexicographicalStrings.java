package main.java.string.concepts;

public class LexicographicalStrings {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";
        int length = str1.length()+ str2.length();
        System.out.println(length);
        int value = str1.compareTo(str2);
        if(value < 0){
            System.out.println("NO");
        }
        String upperCaseStr1 = str1.substring(0,1).toUpperCase() + str1.substring(1);
        String upperCaseStr2 = str2.substring(0,1).toUpperCase() + str2.substring(1);
        System.out.println(upperCaseStr1 + " " +upperCaseStr2);

    }
}
