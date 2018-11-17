package stack;


import java.util.Stack;

public class ExpressionBalancing {
    public static void main(String[] args) {


        CustomStack<String> stack = new CustomStack<>();
        String arr[] = {"[{()}]","[{(}}]"};
        String exp = "[{()}]";
        String exp1 = "[{(}}]";
        int len = exp.length();
        System.out.println("Parenthesis "+areParenthesisBalanced(exp1,len));
        System.out.println();
        String s[] = areParenthesisBalanced(arr);
        for(String s1:s)
        System.out.println(s1);


    }

    private static String[] areParenthesisBalanced(String[] values){

        Stack stack = new Stack();
        String result[] = new String[values.length];
        for(int j=0;j<values.length;j++){

            int len = values[j].length();

            for(int i=0;i<len;i++)
            {
                if(values[j].charAt(i)== '{' || values[j].charAt(i)== '(' || values[j].charAt(i)== '[')
                    stack.push(values[j].charAt(i));
                if(values[j].charAt(i)== '}' || values[j].charAt(i)== ')' || values[j].charAt(i)==']' )
                {
                    if(stack.isEmpty())
                    {
                        break;
                    }
                    else if(!isMatchingPair((char)stack.pop(),values[j].charAt(i)))
                        break;
                }
            }
            if(stack.isEmpty())
                result[j]="YES";  //balanced
            else
                result[j]="NO";
        }

        return result;

    }

    private static boolean areParenthesisBalanced(String exp,int len){

        CustomStack stack = new CustomStack();

        for(int i=0;i<len;i++)
        {
            if(exp.charAt(i)== '{' || exp.charAt(i)== '(' || exp.charAt(i)== '[')
                stack.push(exp.charAt(i));
            if(exp.charAt(i)== '}' || exp.charAt(i)== ')' || exp.charAt(i)==']' )
            {
                if(stack.isEmpty())
                    return false;
                else if(!isMatchingPair((char)stack.pop(),exp.charAt(i)))
                    return false;
            }
        }
        if(stack.isEmpty())
            return true;  //balanced
        else
            return false;

    }
    private static boolean isMatchingPair(char c1, char c2)
    {
        if(c1=='[' && c2==']')
            return true;
        if(c1=='{' && c2=='}')
            return true;
         if(c1=='(' && c2==')')
             return true;
        return false;
    }
}
