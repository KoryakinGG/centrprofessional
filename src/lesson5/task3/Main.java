package lesson5.task3;

/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList <Integer> firstCollection = new ArrayList<>(100);
        ArrayList <Integer> secondCollection = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            firstCollection.add(random.nextInt(100));
        }
        System.out.println(firstCollection);

        for (int i = 0; i < firstCollection.size(); i++) {
            if (firstCollection.get(i) > 0 && firstCollection.get(i) < 10 ) {
                secondCollection.add(firstCollection.get(i));
            }
        }
        System.out.println(secondCollection);
     }
}
