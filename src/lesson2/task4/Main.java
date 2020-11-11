package lesson2.task4;

import java.util.Scanner;

/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float summa = scanner.nextFloat();
        System.out.print("Введите процент: ");
        float percent = scanner.nextInt();

        System.out.println("Ваш вклад на 5 лет составит: ");
        for (int i = 1; i < 6; i++) {
            summa += summa*(percent/100);
            System.out.println("год "+ i + " = " + summa);
        }
    }
}
