package lesson16Map;

import java.util.HashMap;

public class Task2HashMap {
    public static void main(String[] args) {
        //        Задача 2:
//        На вход поступает массив непустых строк, создайте и верните Map<String,
//                String> следующим образом: для каждой строки добавьте ее первый символ в
//        качестве ключа с последним символом в качестве значения. Пример:
//        pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//        pairs(["man", "moon", "main"]) → {"m": "n"}
//        pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

        String[] paris1 = {"code", "bug"};
        String[] paris2 = {"man", "moon", "main"};
        String[] pairs3 = {"man", "moon", "good", "night"};

        System.out.println(paris(paris1));
        System.out.println(paris(paris2));
        System.out.println(paris(pairs3));

    }
    public static HashMap<String,String>paris(String[] strings){
        HashMap<String, String> stringHashMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char[] newStrings = strings[i].toCharArray();
            stringHashMap.put(String.valueOf(newStrings[0]), String.valueOf(newStrings[newStrings.length - 1]));
        }
        return stringHashMap;
    }
}
