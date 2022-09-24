// Создать структуру для хранения Номеров паспортов и
// Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

package ru.geekbrains;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task001 {

    public static Map<Integer, String> passp = Map.of(123456, "Иванов",
            321456, "Васильев",
            234561, "Петрова",
            234432, "Иванов",
            654321, "Петрова",
            345678, "Иванов");

    public static Map<String, List<Integer>> surnameMap = Map.of(
            "Иванов", List.of(123456, 234432, 345678),
            "Васильев", List.of(321456),
            "Петрова", List.of(234561, 654321));
    
    public static void main(String[] args) {
        passportNumberBySurname1("Иванов");
        passportNumberBySurname2("Иванов");
    }

    public static void passportNumberBySurname1(String surnane) {
        var entries = passp.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            if (entry.getValue().equals(surnane)) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void passportNumberBySurname2(String surnane) {
        System.out.println(surnameMap.get(surnane));
    }
}
