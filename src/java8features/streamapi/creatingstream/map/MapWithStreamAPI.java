package java8features.streamapi.creatingstream.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapWithStreamAPI {

    public static <K,V> Stream<Map.Entry<K,V>> mapToStream(Map<K,V> map){
        return map.entrySet().stream();

    }

    public static <K,V> Stream<K> mapToStreamKey(Map<K,V> map){
        return map.keySet().stream();
    }
    public static <K,V> Stream<V> mapToStreamValue(Map<K,V> map)
    {
        return map.values().stream();
    }
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> mapnames = new HashMap<>();

        map.put("A",1234);
        map.put("C",34);
        map.put("D",24);
        map.put("B",14);
        map.put("Z",12);

        mapnames.put("Ravi",123);
        mapnames.put("ram",5343);
        mapnames.put("zzz",9898);
        mapnames.put("retert",909999);
        mapnames.put("manoj",0);

        Stream<Map.Entry<String,Integer>> stream = mapToStream(map);
        Stream<String> mapKeyStream = mapToStreamKey(map);
        Stream<Integer> mapValueStream = mapToStreamValue(map);
        System.out.println(Arrays.toString(stream.toArray()));
        mapKeyStream.forEach(i-> System.out.println(i));
        mapValueStream.forEach(integer -> System.out.println(integer));

        Stream<Map.Entry<String,Integer>> mStream = mapToStream(mapnames);
        //System.out.println(mStream.filter(name->name.getKey().contains("a")).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)));

        Map<String,Integer> m = mStream.filter(name->name.getKey().contains("a")).collect(Collectors.toMap(name->name.getKey(),name->name.getValue()));
        System.out.println("Filtered Map: "+m);
    }
}
