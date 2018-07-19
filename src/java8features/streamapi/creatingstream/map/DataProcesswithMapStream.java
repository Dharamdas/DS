package java8features.streamapi.creatingstream.map;
import com.sun.tools.javac.util.List;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataProcesswithMapStream {

    public static void main(String[] args) {

        Stream<String> words = Stream.of("Java", "Magazine", "is",
                "the", "best");

        Map<String, Long> letterToCount =
                words.map(w -> w.split(""))
                        .flatMap(Arrays::stream)
                        .collect(Collectors.groupingBy(identity(), counting()));

        System.out.println("Map: "+letterToCount);



        List<Integer> numbers = List.of(1, 2, 3, 5, 5);

        Map<Integer, Long> result = numbers.stream()
                .filter(val -> val > 0)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println("Count of duplicate: "+result);

        List<Integer> number = List.of(1, 2, 3, 5, 5);
        Map<Integer,Long> n = number.stream().collect(groupingBy(n1->n1,counting()));
        n.forEach((k,v)-> System.out.println(k+" = "+v));

        List<String> wordsCount = List.of("Java", "Magazine", "is","Java","is","best",
                "the", "best");
        Map<String,Long> resultWordCount = wordsCount.stream().collect(groupingBy(name->name,counting()));
        resultWordCount.forEach((k,v)-> System.out.println(k+" = "+v));

    }
}
