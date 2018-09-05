package map.sortmap;

import java.util.Comparator;
import java.util.Map;

public class SortByKeyAscending implements Comparator<Map.Entry<Integer,Integer>>{

    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {

        Integer val1 = o1.getKey();
        Integer val2=o2.getKey();

        return val1.compareTo(val2);
    }
}
