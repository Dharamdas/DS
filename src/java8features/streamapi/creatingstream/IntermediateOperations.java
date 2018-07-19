package java8features.streamapi.creatingstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++)
            myList.add(i);

        Stream<Integer> stream = myList.stream();

        //printing  number greater than 80 and iterating stream
        Stream<Integer> stream1 = stream.filter(p->p>80);
        stream1.forEach(p-> System.out.print(p+" "));


        Stream<String> stream2 = Stream.of("aBc","XYx","pqrs");
        System.out.println(stream2.map(s ->{return s.toUpperCase();}).collect(Collectors.toList()));

        //stream sorted
        Stream<String> names1 = Stream.of("aBc", "d", "ef", "123456");
        List<String> name1List = names1.sorted().collect(Collectors.toList());
        System.out.println("String List with Sorted  Order"+name1List);

        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        List<String> stringList = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("String List with Sorted Reverse Order: "+stringList);

       // Stream flatMap() example
        Stream<List<String>> namesOriginalList = Stream.of(
                Arrays.asList("Pankaj"),
                Arrays.asList("David", "Lisa"),
                Arrays.asList("Amit","Ravi","Manoj","Asendra"));
        //flat the stream from list to String stream
        Stream<String> flatSteam = namesOriginalList.flatMap(nameList->nameList.stream());
        flatSteam.forEach(System.out::println);


    }
}
