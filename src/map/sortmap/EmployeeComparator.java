package map.sortmap;

import java.util.Comparator;
import java.util.Map;

public class EmployeeComparator implements Comparator<Map.Entry<Employee,Integer>> {

    @Override
    public int compare(Map.Entry<Employee, Integer> o1, Map.Entry<Employee, Integer> o2) {
        return o1.getKey().name.compareTo(o2.getKey().name);
    }
}
