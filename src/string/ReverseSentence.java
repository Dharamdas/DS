package string;

import java.util.StringTokenizer;

public class ReverseSentence {
    public static void main(String[] args) {

        String line = "my name is Khan";
        String reverseLine="";
        StringTokenizer tokenizer = new StringTokenizer(line," ");
        while (tokenizer.hasMoreTokens())
        {
            String t = ReverseString.reverse(tokenizer.nextToken());

            reverseLine = t+" "+reverseLine;
        }
        System.out.println(reverseLine);


    }
}
