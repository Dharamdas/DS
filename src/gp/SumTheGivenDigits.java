package gp;

public class SumTheGivenDigits {
    public static void main(String[] args) {
        System.out.println("Using Loop: "+getNumberInSingleDigit(1234));
        System.out.println("Using Recursion: "+getNumberInSingleDigitUsingRecurision(1234));

/*

 */
    }

    public static int getNumberInSingleDigitUsingRecurision(int number)
    {
        int sum=number%10;
        if(number==0)
            return 0;
        return   sum + getNumberInSingleDigitUsingRecurision(number/10);
    }

    public static int getNumberInSingleDigit(int number)
    {
        int sum=0;
        while(true)
        {
            while(number>0)
            {
                int r = number%10;
                sum = sum+r;
                number=number/10;
            }

            if(sum/10!=0)
            {
                number=sum;
                sum=0;
            }else{
                break;
            }
        }
        return sum;
    }
}
