package map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHM {
    public static void main(String[] args) {

        Map<String,Integer> map1 = new HashMap<>();
        map1.put(new String("abc"),20);
        map1.put(new String("xyz"),30);
        map1.put(new String("abc"),20);

        System.out.println("HM--> "+map1);

        IdentityHashMap<String,Integer> map = new IdentityHashMap<>();
        map.put(new String("abc"),20);
        map.put(new String("xyz"),30);
        map.put(new String("abc"),20);
        System.out.println("Identity HM -->  "+map);


        Map<Emp,String> identityHashMap=new IdentityHashMap<Emp,String>();
        identityHashMap.put(new Emp("a"), "audi");
        identityHashMap.put(new Emp("a"), "bmw");

        System.out.println("Identity HM: --> "+identityHashMap);
        System.out.println(identityHashMap.size());


    }
}

class Emp{
    String name;
    Emp(String name){
        this.name=name;
    }

    @Override
    public int hashCode(){
        System.out.println("in hashCode()");
        return (this.name==null ? 0: this.name.hashCode() );
    }

    @Override
    public boolean equals(Object obj){
        System.out.println("in equals()");
        Emp emp=(Emp)obj;
        return (emp.name==this.name || emp.name.equals(this.name));
    }

}
