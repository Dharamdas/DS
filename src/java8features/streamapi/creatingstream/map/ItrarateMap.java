package java8features.streamapi.creatingstream.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ItrarateMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        System.out.println(map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)));

        Map<String,Integer> mapnames = new HashMap<>();

        mapnames.put("Ravi",123);
        mapnames.put("ram",5343);
        mapnames.put("zzz",9898);
        mapnames.put("retert",909999);
        mapnames.put("manoj",0);

        //Map<String, Integer> m = mapnames.entrySet().stream().filter(m)


    }
}
