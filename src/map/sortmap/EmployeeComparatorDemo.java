package map.sortmap;

import java.util.*;

public class EmployeeComparatorDemo {
    public static void main(String[] args) {

        Employee emp1=new Employee("sam","4");
        Employee emp2=new Employee("amy","2");
        Employee emp3=new Employee("brad","1");

        Map<Employee,Integer> map = new HashMap<>();

        map.put(emp1,1);
        map.put(emp2,1);
        map.put(emp3,1);

        Set<Map.Entry<Employee,Integer>> set = map.entrySet();

        List<Map.Entry<Employee,Integer>> list = new ArrayList<>(set);

        System.out.println("Map of List before Sorting: "+list);
        Collections.sort(list,new EmployeeComparator());
        System.out.println("Map After Sorting: "+ list);
    }
}
