package java8features.streamapi.creatingstream.usecasestudent;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Student {

    private final String name;
    private final int age;
    private final Country country;
    private final int score;

    Student(String name,int age,Country country,int score){
        this.name=name;
        this.age=age;
        this.country=country;
        this.score=score;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Country getCountry() {
        return country;
    }

    public int getScore() {
        return score;
    }
}
