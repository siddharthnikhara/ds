import java.util.HashMap;
import java.util.Map;


public class Test {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("key1", "val1");
        map1.put("key2", "val2");
        map1.put("key3", "val3");

        map2.put("key2", "val2");
        map2.put("key3", "new val3");
        map2.put("key4", "val4");
        compareHashMap(map1, map2);
    }

    static void compareHashMap(Map<String, String> map1, Map<String, String> map2) {
        for (String s : map1.keySet()) {
            if (!map2.containsKey(s)) {
                System.out.println(s);
            }
        }
        for (String s : map2.keySet()) {
            if (!map1.containsKey(s)) {
                System.out.println(s);
            }
        }

        for (Map.Entry<String, String> entry : map1.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if(map2.containsKey(key)){
                String value1 = map2.get(key);
                if(value.equals(value1)){
                    System.out.println(key +"  "+value);
                }
            }
        }

        for (Map.Entry<String, String> entry : map1.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if(map2.containsKey(key)){
                String value1 = map2.get(key);
                if(!value.equals(value1)){
                    System.out.println(key +"  "+value);
                }
            }
        }

    }
}
