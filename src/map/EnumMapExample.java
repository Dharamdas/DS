package map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class EnumMapExample {
    public enum Days{
        MONDAY,TU,WED,SUNDAY;
    }

    public static void main(String[] args) {
        System.out.println("\n--------1. Create daysEnumMap -----------");
        Map<Days,String> days = new EnumMap<Days,String>(Days.class);
        System.out.println("Enum Map: "+days);
        days.put(Days.MONDAY,"WeekDay");
        days.put(Days.WED,"WeekDay");
        days.put(Days.SUNDAY,"WeekEnd");
        System.out.println("Added Enum Value: "+ days);

        Hashtable hashtable = new Hashtable();

        HashMap<Integer,Integer> map = new HashMap<>();
        map.putIfAbsent(10,20);


    }
}
