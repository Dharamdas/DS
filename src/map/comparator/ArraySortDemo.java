package map.comparator;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        Integer intArray[]={2,3,1};

        System.out.print("Array before sorting : ");
        for(int i: intArray){
            System.out.print(i+" ");
        }



        Arrays.sort(intArray,new ArraySortDescending());

        System.out.print("Array After sorting : ");

        for(int i: intArray){
            System.out.print(i+" ");
        }

    }
}
