import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class NestedMapper {
    public static void main(String[] args) {

        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("slamalsdfj", 1231);
        HashMap<Object, Object> value = new HashMap<>();
        value.put("haha", 2343);

        objectObjectHashMap.put("filter", value);

        Map.Entry<String,Object> entry =
                new AbstractMap.SimpleEntry<>("filter/data/isRefill", 42);
        putNestedEntry(objectObjectHashMap, entry);


        System.out.println(objectObjectHashMap);


    }

    private static void putNestedEntry(Map<String, Object> map, Map.Entry<String, Object> entry) {
        putEntry(map, entry.getKey().split("/"), 0, entry.getValue());
    }

    private static void putEntry(Map<String, Object> map, String[] split, int i, Object val) {
        if (i == split.length - 1) {
            map.put(split[i], val);
            return;
        }
        Object o = map.computeIfAbsent(split[i], k -> new HashMap<>());
        putEntry((Map<String, Object>) o, split, ++i, val);
    }
}