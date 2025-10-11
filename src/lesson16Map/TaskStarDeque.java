package lesson16Map;

import java.util.ArrayDeque;

public class TaskStarDeque {
    //    Задача *:
//    Задана строка, которая может иметь внутри себя скобки. Скобкой считается
//    любой из следующих символов — «(«, «)», «[«, «]», «{«, «}». Проверить
//    сбалансированность расстановки скобок в этой строке. Набор скобок считается
//    сбалансированной парой, если открывающая скобка "(", "[" и "{" стоит слева от
//    соответствующей закрывающей скобки ")", "]" и "} ", соответственно. Строка,
//    содержащая пары скобок, не сбалансирована, если набор заключенных в нее
//    скобок не совпадает .
//            Например, если ввод «{[(])}», пара квадратных скобок «[]» заключает в себя
//    одну несбалансированную открывающую круглую скобку «(». Аналогично, пара
//    круглых скобок «() ", заключает в себя одну несбалансированную
//    закрывающую квадратную скобку "]". Таким образом, входная строка "{[(])}"
//    несбалансированная.
//      Пример
//() - сбалансирована
//[()] - сбалансирована
//{[()]} - сбалансирована
//([{{[(())]}}]) - сбалансирована
//{{[]()}}}} - не сбалансирована
//{[(])} - не сбалансирована
    public static void main(String[] args) {
        String[] texts = {
                "()",
                "[()]",
                "{[()]}",
                "([{{[(())]}}])",
                "{{[]()}}}}",
                "{[(])}"};
        for (String string: texts){
            System.out.println(ballance(string));
        }
        System.out.println("проверка " + ballance(texts[0]));

    }

    public static boolean ballance(String string) {
        ArrayDeque<Character> stringArrayDeque = new ArrayDeque<>();
        for (char element : string.toCharArray())
            if (element == '(' || element == '[' || element == '{') {
                stringArrayDeque.push(element);
            } else if (element == ')' || element == ']' || element == '}') {
                if (stringArrayDeque.isEmpty()) {
                    return false;
                }
                char deleteElement = stringArrayDeque.pop();
                if ((element == ')' && deleteElement != '(' ||
                        element == ']' && deleteElement != '[' ||
                        element == '}' && deleteElement != '{')){
                return false;}
            }


        return stringArrayDeque.isEmpty();
    }
}

