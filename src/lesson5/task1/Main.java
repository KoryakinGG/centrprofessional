package lesson5.task1;
/*
 * Дана коллекция имён.
 * 1) удалить все повторяющиеся имена из коллекции
 * 2) вывести коллекцию на экран
 * */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");// удалить
        names.add("Павел");
        names.add("Руслан"); // удалить

//        ArrayList<String> newNames = removeTheSameValues(names);
//        System.out.println(newNames);

        for (int i = 0; i < names.size(); i++) {
            for (int j = i+1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))) {
                    names.remove(j);
                    j--;
                }
            }
        }
        System.out.println(names);
    }
    // Короче, скажу честно, я не очень люблю работать с fori, потому, что мне трудно придумывать комбинации, поэтому
    // я сам написал метод removeTheSameValues, но я подглядел на Стаковерфлоу (int j = i+1; j < names.size(); j++) вот эту строчку, до int j = i+1 не додумался
    // так же узнал, что можно перегнать все в Set и обратно и таким образом избавиться от дубликатов.
    public static ArrayList<String> removeTheSameValues(ArrayList<String> array) {
        ArrayList<String> copyArray = new ArrayList<>();
        for (String element : array) {
            if (!copyArray.contains(element)) {
                copyArray.add(element);
            }
        }
        return copyArray;
    }
}
