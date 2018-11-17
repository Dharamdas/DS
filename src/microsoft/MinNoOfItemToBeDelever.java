package microsoft;

import java.util.Arrays;

public class MinNoOfItemToBeDelever {
    public static void main(String[] args) {
       int n = 10;
       int[] a = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        int[] a1= { 1, 3, 5, 7, 9 };
        int k = 50;

        System.out.println("Minimum no of Items to be Delivered: "+getMin(a,n,k));
    }

    static int getMin(int a[],int n,int k){

        int maxNum = Arrays.stream(a).max().getAsInt();
        int []b=new int[11];
        System.out.println(maxNum);
        int tours=0;
        int i=0;
        int t=0;
        int j=0;
        for(i=1;i<n;i++)
        {
                tours=0;
                if(a[j]%i==0)
                    tours=tours+a[j]/i;
                else{
                    tours=tours+(a[j]/i)+1;
                }
                b[t++]=tours;
            j++;
        }
        System.out.println(Arrays.toString(b));
        for(int num:b)
        {
            tours=tours+num;
        }
        if(tours<=k)
            return i-1;
    return -1;
    }
}
