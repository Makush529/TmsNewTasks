package lesson18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskStar {
    public static void main(String[] args) {
//        Задача *:
//        Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
//        этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
//        Среди отобранных значений отобрать только те, которые имеют нечетное количество
//        букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
        Map<Integer, String> user = new HashMap<>();
        List<String> userList = new ArrayList<>();
        int maxNumNames = 20;
        try (FileReader fileReader = new FileReader("src/resources/nemes.txt")
             ; BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int id = 1;
            String line;
            while ((line = bufferedReader.readLine()) != null && id <= maxNumNames) {
                user.put(id, line.trim());
                id++;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println(user);
        user.entrySet().stream()
                .filter(u->u.getKey()==1||u.getKey()==2||u.getKey()==5||u.getKey()==8||u.getKey()==9||u.getKey()==13)
                .filter(u->u.getValue().length()%2!=0)
                .map(u->new StringBuffer (u.getValue()).reverse().toString())
                .forEach(u->userList.add(u));
        System.out.println(userList);
    }
}
