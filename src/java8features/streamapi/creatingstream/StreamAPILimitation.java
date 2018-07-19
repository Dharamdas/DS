package java8features.streamapi.creatingstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
* Stateless lambda expressions: If you are using parallel stream and lambda expressions are stateful,
* it can result in random responses
*
* If we run above program, you will get different results because it depends on the way stream is getting iterated
* and we don’t have any order defined for parallel processing.
 * If we use sequential stream, then this problem will not arise.
* */
public class StreamAPILimitation {

    public static void main(String[] args) {
        List<Integer> ss = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        List<Integer> result = new ArrayList<Integer>();

        Stream<Integer> stream = ss.parallelStream();

        stream.map(s->{
            synchronized (result)
            {
                if(result.size()<8)
                    result.add(s);
            }
            return result;
        }).forEach(e->{});
        System.out.println("Final Result: "+result);

    }

}
