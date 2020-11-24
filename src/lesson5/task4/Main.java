package lesson5.task4;

/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        //        C://temp/array.txt
        System.out.println("Введите путь к файлу: ");
        // Считываем с консоли путь к файлу
        Scanner scanner = new Scanner(System.in);
        // Оборачиваем в файл
        File file = new File(scanner.nextLine());
        //  тема ниже, а именно: Scanner(file), взята от сюда https://hr-vector.com/java/class-scanner и с JavaRush
        // (я там 20 лвл, но не все запомнил, что там проходил, проходил где-то полгода назад)
//        Scanner scanner1 = null;
        ArrayList<Integer> arrayNumbers = new ArrayList<>();
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                arrayNumbers.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        scanner1.close();
        scanner.close();
        System.out.print("Выводим числа в массиве: " + arrayNumbers);
        System.out.println();
//        сортируем массив, уже лень писать свой метод сортировки
        Collections.sort(arrayNumbers);
        System.out.print("Массив отсортирован "+arrayNumbers);
//        Выясняем, какое число является четным с помощью метода, решил, что метод нужно отдельно сделать.
        for (int i = 0; i < arrayNumbers.size(); i++) {
            if (!(evenNumber(arrayNumbers.get(i)))) {
                arrayNumbers.remove(i);
                i--;
            }
        }
        // Вопрос, нужно ли было выводить обязательно по вертикали ? =)
        System.out.println();
        System.out.println("Ответ: ");
        for (int i = 0; i < arrayNumbers.size(); i++) {
            System.out.println(arrayNumbers.get(i));
        }

    }

    static boolean evenNumber (int i) {
        int x = Math.abs(i);
        return x % 2 == 0;
    }
}
