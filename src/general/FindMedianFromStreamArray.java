package general;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class FindMedianFromStreamArray {
    public static void main(String[] args) {

        //findMedianForOddSets();
        findMedianForEvenSets();
    }

    public static void findMedianForOddSets(){

        Integer arr[]={102, 56, 34, 99, 89, 101, 10,40,60};
        List<Integer> list = new ArrayList<>(new TreeSet<>(Arrays.asList(arr)));
        System.out.println("Sorted Array: "+list);
        int median = (list.size())/2;
        System.out.println("Median Value for List is "+list.get(median));

    }

    public static void findMedianForEvenSets(){
        Integer arr[]={102, 56, 34, 99, 89, 101, 10, 54};
        List<Integer> list = new ArrayList<>(new TreeSet<>(Arrays.asList(arr)));
        System.out.println("Sorted Array: "+list);
        int median=(list.get((list.size())/2)+list.get((list.size()/2)-1))/2;
        System.out.println("Median for Even Set of Element: "+median);

    }
}
