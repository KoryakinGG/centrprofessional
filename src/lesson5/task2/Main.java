package lesson5.task2;

/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите названия городов: ");
        List<String> listOfCities = new ArrayList<>();
        while (true) {
            String cities = scanner.nextLine();
            if (cities.isEmpty()) {
                break;
            }
            listOfCities.add(cities);
        }
        System.out.println("Введите фамилии семей: ");
        List<String> listOfLastnames = new ArrayList<>();
        while (true) {
            String family = scanner.nextLine();
            if (family.isEmpty()) {
                break;
            }
            listOfLastnames.add(family);
        }
        System.out.println("Введите город для поиска: ");
        String namesOfCities = scanner.nextLine();

        if (listOfCities.contains(namesOfCities)) {
            for (int i = 0; i < listOfCities.size(); i++) {
                if(listOfCities.get(i).equals(namesOfCities)) {
                    System.out.println(listOfLastnames.get(i));
                }
            }
        }
        else {
            System.out.println("Такого города нет в списке");
        }

        // Тут, я думаю, лучше использовать Map, но так как мы вместе еще его не проходили, то пришлось создавать 2 аррейлист. другие варианты придумывать лень.

        // Read the house number
//        int houseNumber = scanner.nextInt();
//
//        if (0 <= houseNumber && houseNumber < list.size()) {
//            String familyName = list.get(houseNumber);
//            System.out.println(familyName);
//        }
    }
}
