package lesson2.task5;

import java.util.Scanner;

/*
Задание: Запросить у пользователя ввод числа и сохранить это число в переменную a.Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        if (a == 10 ) {
            System.out.println("Вы ввели верное число!");
        }else {
            System.out.println("Вы ввели не верное число! Муахахахаха!");
        }
    }
}
