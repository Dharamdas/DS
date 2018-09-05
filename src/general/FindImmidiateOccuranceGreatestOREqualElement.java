package general;

import java.util.HashMap;
import java.util.Map;

public class FindImmidiateOccuranceGreatestOREqualElement {

    public static void main(String[] args) {

        int arr[]={2,6,0,1,9,4,10,9};

        System.out.println(arr);
        Map map = new HashMap<>();
        int len=arr.length-1;
        for(int i=0;i<len;i++)
        {
            int j=i+1;

            while(j<=len){

                if(arr[j]>=arr[i])
                {
                    map.put(arr[i],arr[j]);
                    break;
                }

                if(j==len)
                {
                    map.put(arr[i],"Not Found");
                    break;
                }
                j++;
            }

        }

        System.out.println("Result: "+map);

    }
}
