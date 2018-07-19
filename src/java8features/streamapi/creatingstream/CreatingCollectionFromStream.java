package java8features.streamapi.creatingstream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingCollectionFromStream {
    public static void main(String[] args) {


        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,6,7,89);
        List<Integer> list = stream.collect(Collectors.toList());
        System.out.println("List: "+list);

        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,89);

        Map<Integer,Integer> map = stream1.collect(Collectors.toMap(i->i, i->i+1));
        System.out.println(map);


        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,89);
        Integer [] arr = stream2.toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));


    }
}
