package java8features.streamapi.creatingstream.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapStream {
    public static void main(String[] args) {
        List<Item> items;
        items = new ArrayList<>();

        items.add(new Item("ONE"));
        items.add(new Item("TWO"));
        items.add(new Item("THREE"));
        final int i=1;

        Map<String, Item> map = items.stream().collect(
                Collectors.toMap(Item::getKey, item -> item));

        System.out.println(map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)));
    }

}

class Item {

    String key;

    public Item(String key) {
        super();
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
