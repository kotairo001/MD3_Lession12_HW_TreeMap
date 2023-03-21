import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("John",31);
        hashMap.put("Jack",22);
        hashMap.put("Ken",22);
        System.out.println("Display entire in Hashmap");
        System.out.println(hashMap + "\n");

        Map<String,Integer> treemap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treemap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75F,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}
