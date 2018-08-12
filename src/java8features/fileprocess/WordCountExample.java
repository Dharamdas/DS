package java8features.fileprocess;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public class WordCountExample {

    public static void main(String[] args) throws IOException,Exception {
        Path path = Paths.get("/Users/z001yb4/Documents/git-Dharamdas/DS/src/java8features/fileprocess/book.txt");
        //wordCountSolution1(path);
       // wordCountSolution2(path);
        wordCountSolution3(path);

        }

        public static void wordCountSolution1(Path path)throws Exception{

            Map<String, Integer> wordCount = Files.lines(path)
                    .flatMap(line -> Arrays.stream(line.trim().split(" ")))
                    .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
                    .filter(word -> word.length() > 0)
                    .map(word -> new AbstractMap.SimpleEntry<>(word, 1))
                    .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                    .reduce(new LinkedHashMap<>(), (acc, entry) -> {
                        acc.put(entry.getKey(), acc.compute(entry.getKey(), (k, v) -> v == null ? 1 : v + 1));
                        return acc;
                    }, (m1, m2) -> m1);

            wordCount.forEach((k, v) -> System.out.println(String.format("%s ==>> %d", k, v)));
        }

    public static void wordCountSolution2(Path path)throws Exception{

        Map<String, Integer> wordCount = Files.lines(path)
                .flatMap(line -> Arrays.stream(line.trim().split(" ")))
                .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
                .filter(word -> word.length() > 0)
                .map(word -> new AbstractMap.SimpleEntry<>(word, 1))
                .collect(toMap(e -> e.getKey(), e -> e.getValue(), (v1, v2) -> v1 + v2));

        wordCount.forEach((k, v) -> System.out.println(String.format("%s ==>> %d", k, v)));

    }
    public static void wordCountSolution3(Path path)throws Exception{

        Map<String, Long> wordCount = Files.lines(path).flatMap(line -> Arrays.stream(line.trim().split(" ")))
                .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
                .filter(word -> word.length() > 0)
                .map(word -> new AbstractMap.SimpleEntry<>(word, 1))
                .collect(groupingBy(AbstractMap.SimpleEntry::getKey, counting()));

        wordCount.forEach((k, v) -> System.out.println(String.format("%s ==>> %d", k, v)));

        //finding max word count from MAP ===
        Comparator<? super Map.Entry<String, Long>> maxValueComparator =
                (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue());

        Optional<Map.Entry<String, Long>> maxValue = wordCount.entrySet()
                .stream().max(maxValueComparator);

        System.out.println("Max word Count: "+maxValue);

    }
}
