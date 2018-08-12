package java8features.streamapi.creatingstream.usecasestudent;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ProcessStudentData {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                /*          NAME       AGE COUNTRY          SCORE */
                new Student("Jan",     13, Country.POLAND,  92),
                new Student("Anna",    15, Country.POLAND,  95),
                new Student("Helga",   14, Country.GERMANY, 93),
                new Student("Leon",    14, Country.GERMANY, 97),
                new Student("Michael", 14, Country.UK,      90),
                new Student("Tim",     15, Country.UK,      91),
                new Student("George",  14, Country.UK,      98)
        );
        //grouping students by country, this is fairly simple:

        Map<Country,List<Student>> groupingByCountry=students.stream().collect(groupingBy(Student::getCountry));
        //System.out.println("Grouping by Country: "+groupingByCountry);

        groupingByCountry.forEach((k,v)-> {
            System.out.println("\n"+k+" = ");
            v.forEach(student -> System.out.print("Name: "+student.getName()+", Age: "+student.getAge()+" "));
        });

        //count number of students per country
        Map<Country, Long> numberOfStudentsByCountry = students.stream().collect(groupingBy(Student::getCountry, counting()));
        System.out.println("Number of Student by Country: "+numberOfStudentsByCountry);

        //Avg Score by Country
        Map<Country,Double> avgScoreByCountry = students.stream().collect(groupingBy(Student::getCountry,averagingDouble(Student::getScore)));
        System.out.println("Avg Score by Country: "+avgScoreByCountry);

        //compute max student age per country:
        Map<Country,Optional<Integer>> maxAgeByCountry = students.stream().collect(groupingBy(Student::getCountry,mapping(Student::getAge,maxBy(Integer::compare))));
        System.out.println("Max Age By Country: "+maxAgeByCountry);

       // group students by country and age:

        Map<Country,Map<Integer,List<Student>>> studentByCountryByAge=students.stream().collect(groupingBy(Student::getCountry,groupingBy(Student::getAge)));
        //System.out.println("studentByCountryByAge: "+studentByCountryByAge);
        studentByCountryByAge.forEach((k,v)->{
            System.out.println("\n Country: "+k+" ");
            v.forEach((j,l)->{
                System.out.print(" "+j+" ");
                l.forEach(m-> System.out.print(m.getName()+" "));
            });
        });
    }
}
