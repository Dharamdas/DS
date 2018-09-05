package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list= new ArrayList(25);
        list.add(10);
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(4,30);
        System.out.println(list);
       list.remove(3);
        System.out.println(list);


    }
}
