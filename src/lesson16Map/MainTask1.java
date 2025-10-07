package lesson16Map;

import java.util.HashMap;
import java.util.Map;

public class MainTask1 {
    public static void main(String[] args) {
        String[] strings1 = {"a", "b", "a", "c", "b"};
        String[] strings2 = {"c", "b", "a"};
        String[] strings3 = {"c", "c", "c", "c"};

        System.out.println(hashMap(strings1));
        System.out.println(hashMap(strings2));
        System.out.println(hashMap(strings3));

    }

    public static HashMap<String, Boolean> hashMap(String[] array) {
        HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
        HashMap<String, Boolean> hashMap2 = new HashMap<String, Boolean>();
        for (String str : array) {
            hashMap1.put(str, hashMap1.getOrDefault(str, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : hashMap1.entrySet()) {
            hashMap2.put(entry.getKey(), entry.getValue() >= 2);
        }
        return hashMap2;
    }
}

