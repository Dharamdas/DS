package java8features.methodreference;

import java.util.Arrays;

public class Example3 {

    public static void main(String[] args) {
        String[] strArray = {"Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
        Arrays.sort(strArray,String::compareToIgnoreCase);
        for(String str:strArray)
        System.out.println(str);
    }
}
