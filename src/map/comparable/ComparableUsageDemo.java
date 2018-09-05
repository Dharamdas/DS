package map.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableUsageDemo {

    public static void main(String[] args) {

        ComparableEmployee emp1=new ComparableEmployee("sam","4");
        ComparableEmployee emp2=new ComparableEmployee("amy","2");
        ComparableEmployee emp3=new ComparableEmployee("brad","1");


        ArrayList<ComparableEmployee> list=new ArrayList<ComparableEmployee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);


        System.out.println("list Before sorting : \n"+list);

        Collections.sort(list);

        System.out.println("\nlist after sorting on basis of name(ascending order) : \n"+list);

    }
}
