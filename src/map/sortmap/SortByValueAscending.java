package map.sortmap;

import java.util.Comparator;
import java.util.Map;

public class SortByValueAscending implements Comparator<Map.Entry<Integer,Integer>> {

    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return o1.getKey().compareTo(o2.getKey());
    }
}
