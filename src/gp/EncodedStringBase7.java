package gp;

import java.util.Scanner;

public class EncodedStringBase7 {

    public static void main(String[] args) {
        System.out.println(convert(7792875));

    }

    public static String convert(long input) {

        char [] base7={'0','a', 't', 'l', 's', 'i', 'n'};
        StringBuffer target=new StringBuffer();

        for (long i=input; i>0; i /=7){
            target.append(base7[(int)i%7]);
        }

        target= target.reverse();
        return target.toString();
    }


    /*

Let's define a function "LookAndSay" as follow: read off the digits of the input, counting the number of digits in groups of same digit. Here are some examples of this function

LookAndSay(1) = 11                        because 1 is read off as "one 1" or 11.
LookAndSay(11) = 21                      because 11 is read off as "two 1s" or 21.
LookAndSay(21) =  1211               because 21 is read off as "one 2, then one 1" or 1211.
LookAndSay(1211) =  111221      because 1211 is read off as "one 1, then one 2, then two 1s" or 111221.
LookAndSay(111221) =  312211 because 111221 is read off as "three 1s, then two 2s, then one 1" or 312211.
*/


}
