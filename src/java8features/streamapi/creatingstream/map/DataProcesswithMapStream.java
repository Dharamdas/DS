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

        //Count duplicate characters
        Map<String, Long> letterToCount =
                words.map(w -> w.split(""))
                        .flatMap(Arrays::stream)
                        .collect(Collectors.groupingBy(identity(), counting()));

        System.out.println("Map: "+letterToCount);



        //Count whose duplicate is greater than 0
        List<Integer> numbers = List.of(1, 2, 3, 5, 5);
        Map<Integer, Long> result = numbers.stream()
                .filter(val -> val > 0)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println("Count of duplicate: "+result);

        //Count duplicate Digits
        List<Integer> number = List.of(1, 2, 3, 5, 5);
        Map<Integer,Long> n = number.stream().collect(groupingBy(n1->n1,counting()));
        n.forEach((k,v)-> System.out.println(k+" = "+v));

        //remove duplciate value from List
        List<Integer> duplicateList = List.of(1, 2, 3, 5, 5);
        java.util.List<Integer> uniqueList = duplicateList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Uniqe Value"+uniqueList);

        //Count no of duplicate word
        List<String> wordsCount = List.of("Java", "Magazine", "is","Java","is","best",
                "the", "best");
        Map<String,Long> resultWordCount = wordsCount.stream().collect(groupingBy(name->name,counting()));
        resultWordCount.forEach((k,v)-> System.out.println(k+" = "+v));

        //Remove Duplicate Words
        java.util.List<String> uniquewords = wordsCount.stream().distinct().collect(Collectors.toList());
        System.out.println("Uniqe words"+uniquewords);

    }
}
