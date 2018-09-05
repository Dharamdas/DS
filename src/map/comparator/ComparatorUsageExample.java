package map.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorUsageExample {
    public static void main(String[] args) {

        ComparatorEmployee emp1=new ComparatorEmployee("sam","4");
        ComparatorEmployee emp2=new ComparatorEmployee("amy","2");
        ComparatorEmployee emp3=new ComparatorEmployee("brad","1");

        ArrayList<ComparatorEmployee> list=new ArrayList<ComparatorEmployee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("list Before sorting : \n"+list);


        Collections.sort(list,new ComparatorEmployee());

        System.out.println("\nlist after sorting on basis of name(ascending order) : \n"+list);
    }
}
