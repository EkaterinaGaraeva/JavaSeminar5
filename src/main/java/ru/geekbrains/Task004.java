// Взять набор строк, например, Мороз и солнце день чудесный
// Еще ты дремлешь друг прелестный Пора красавица проснись.
// Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
// Строки с одинаковой длиной не должны “потеряться”.


package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Task004 {
    public static void main(String[] args) {
        System.out.println(verse("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись."));
    }

    public static TreeMap<Integer, List<String>> verse (String str) {
        TreeMap<Integer, List<String>> stringIntegerTreeMap = new TreeMap<>();
        String[] strArray = str.replaceAll("[,.]", "").split(" ");
        for (int i = 0; i < strArray.length; i++) {
            int length = strArray[i].length();
            if (stringIntegerTreeMap.containsKey(length)) {
                stringIntegerTreeMap.get(length).add(strArray[i]);
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(strArray[i]);
                stringIntegerTreeMap.put(length, temp);
            }
        }
        return stringIntegerTreeMap;
    }
}
