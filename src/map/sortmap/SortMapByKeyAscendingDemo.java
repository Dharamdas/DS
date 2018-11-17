package map.sortmap;

import java.util.*;

public class SortMapByKeyAscendingDemo {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        map.put(4, 1);
        map.put(2, 1);
        map.put(3, 1);
        map.put(5, 1);

        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(set);
        System.out.println("Map Before Sorting......"+list);
            Collections.sort(list,new SortByKeyAscending());
        System.out.println("Map After Sorting: "+list);

    }
}
