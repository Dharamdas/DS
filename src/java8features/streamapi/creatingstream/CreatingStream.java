package java8features.streamapi.creatingstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,6,7,89);
        Stream<Integer> stream1 = Stream.of(new Integer[]{10,3,4,03,67,90});
       // Stream<Integer> streamPrimitive = Stream.of(new int[]{10,3,4,03,67,90}); // compile time error
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<100;i++)
            list.add(i);
        Stream<Integer> stream2 = list.stream();
        Stream<Integer> stream3 = list.parallelStream();



    }
}
