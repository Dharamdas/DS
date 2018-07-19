package java8features.streamapi.creatingstream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {

    public static void main(String[] args) {

        //Stream reduce() example it multiply all the numbers in the stream
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        Optional<Integer> integerOptional =numbers.reduce((i,j)->{return i*j;});
        if(integerOptional.isPresent())
            System.out.println(integerOptional.get());

        Stream<Integer> countnumbers = Stream.of(1,2,3,4,5);
        System.out.println("Total Count: "+countnumbers.count());


        //Stream forEach() example
        Stream<Integer> numbers2 = Stream.of(1,2,3,4,5);
        numbers2.forEach(i-> System.out.print(i+" "));


        //Stream match() examples

        Stream<Integer> numbers3 = Stream.of(1,2,3,4,5);
        System.out.println(numbers3.anyMatch(i-> i>3));

        Stream<Integer> numbers4 = Stream.of(1,2,3,4,5);
        System.out.println(numbers4.allMatch(i->i<5));

        Stream<Integer> numbers5 = Stream.of(1,2,3,4,5);
        System.out.println(numbers5.noneMatch(i->i==10));

        //Stream findFirst() example

        Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Lisa");
        Optional<String> firstNameWithD = names4.filter(i->i.startsWith("D")).findFirst();
        if(firstNameWithD.isPresent())
            System.out.println("Name Wtih D is present: "+firstNameWithD.get());

        Stream<String> names5 = Stream.of("Pankaj","Amit","David", "Lisa");
        List<String> nameList = names5.filter(i->i.contains("a")).collect(Collectors.toList());
        System.out.println("Name List containg char a "+nameList);



    }
}
