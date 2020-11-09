package lesson2;

import java.util.Scanner;

/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления,
иначе выведите 'Делится с остатком' и остаток от деления.
*/
public class Main2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а: ");
        float a = scanner.nextFloat();
        System.out.print("Введите число b: ");
        float b = scanner.nextFloat();

        if (a % b == 0 ) {
            System.out.println("Делится. Результат: " + a / b);
        }
        else if (a % b != 0) {
            System.out.println("Делится c остатком. Остаток: " +  a % b);
        }
        else {
            System.out.println("Введите число");
        }
    }
}
