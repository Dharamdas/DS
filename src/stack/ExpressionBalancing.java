package stack;

public class ExpressionBalancing {
    public static void main(String[] args) {
        CustomStack<String> stack = new CustomStack<>();
        String exp = "[{()}]";
        String exp1 = "[{(}}]";
        int len = exp.length();
        System.out.println("PArenthesis "+areParenthesisBalanced(exp1,len));
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
