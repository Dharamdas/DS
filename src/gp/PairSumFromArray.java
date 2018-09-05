package gp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PairSumFromArray {

    public static void main(String[] args) {
        int arr[]={1,3,5,3,6,0,4,2,0};
        int sum=6;
        System.out.println("All Pairs");
        getAllPairs(arr,sum);
        System.out.println("Unique Pair");
        getUniquePairs(arr,sum);
    }

    public static void getAllPairs(int arr[],int sum){

        int len=arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<len;i++)
        {
            int tmp=sum-arr[i];

            if(tmp>=0 && set.contains(tmp))
            {
                System.out.println("Sum of Pair "+sum+" "+"("+arr[i]+","+tmp+")");
            }
            set.add(arr[i]);
        }
    }
    public static void getUniquePairs(int arr[],int sum){

        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int i : arr) {
            int j = sum-i;
           if(map.containsKey(j) && !map.get(j))
           {

               if(i==j || !map.containsKey(i))
               {
                  map.put(i,true);
                  map.put(j,true);
                   System.out.println("Sum of Pair "+sum+" "+"("+i+","+j+")");
               }

           }else{
               map.put(i,false);
           }

        }
    }

    public static void createSumOfSeries(){
        int arr[]={1,4};

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(arr[0],arr[1]);
        for(int i=1;i<5;i++)
        {
            //map.put()
        }
    }
}
