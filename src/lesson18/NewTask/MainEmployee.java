package lesson18.NewTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        try (FileReader fileReader = new FileReader("src/resources/res18/Employee.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] word = line.trim().split(",");
                if (word.length == 3) {
                    String name = word[0].trim();
                    String department = word[1].trim();
                    int salary = Integer.parseInt(word[2].trim());
                    employees.add(new Employee(name, department, salary));
                }
            }
        } catch (IOException e) {
            System.out.println("что то пошло не так! " + e.getMessage());
        }
//        1. Фильтрация и преобразование списка сотрудников
//        Дан список сотрудников List<Employee> employees.
//        Нужно получить список имен сотрудников из отдела "Security", у которых зарплата выше 100_000.
//        Ожидаемый результат: List<String> — имена подходящих сотрудников.
        System.out.println(employees);
        List<String> filter = employees.stream()
                .filter(employee -> employee.department.equals("Security"))
                .filter(employee -> employee.salary > 100000)
                .map(employee -> employee.name)
                .collect(Collectors.toList());
        System.out.println(filter);
    }
}
