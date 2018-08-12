package java8features.streamapi.creatingstream.sampletest;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.generate(() -> {return "abc";});

        //stream1.forEach(t-> System.out.println(t));
        Stream<String> stream2 = Stream.iterate("abc", (i) -> i);
        stream2.forEach(v-> System.out.println(v));

        LongStream is = Arrays.stream(new long[]{1,2,3,4});
        IntStream is2 = "abc".chars();

    }
}
