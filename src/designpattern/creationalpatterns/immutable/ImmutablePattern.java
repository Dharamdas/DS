package designpattern.creationalpatterns.immutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutablePattern {


    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        map.put("TEst",123);
        User user = new User("k.dharamdas","testing123","Dharam","Kushwaha","k.dharamdas@gmail.com",map);

        System.out.println(user.getEmail());
        HashMap<String,Integer> map1 = user.getMap();
        map1.put("Raj",89988);
        System.out.println("Local Map: "+map.hashCode()+ " User Map "+map1.hashCode());
        System.out.println(map+" --- "+map1);




    }

}
