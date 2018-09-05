package map.comparator;

import java.util.Comparator;

public class ComparatorEmployee implements Comparator<ComparatorEmployee> {
    String name;
    String id;


    public ComparatorEmployee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    ComparatorEmployee(){

    }


   /* @Override
    public int compare(ComparatorEmployee obj1, ComparatorEmployee obj2) {
        //sort Employee on basis of name(ascending order)
        return obj1.name.compareTo(obj2.name);
    }*/

    @Override
    public int compare(ComparatorEmployee obj1, ComparatorEmployee obj2) {
        //sort Employee on basis of name(ascending order)
        return obj1.id.compareTo(obj2.id);
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }
}
