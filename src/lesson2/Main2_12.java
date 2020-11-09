package lesson2;

import java.util.Scanner;

/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/
public class Main2_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int x : array) {
            System.out.print(x + " ;");
        }

        int count = 0;
        int number = 0;
        for (int i = 0; i < array.length-1; i++) {
            number = array[i];
            if (number == array[i+1]) {
                count++;
                System.out.println(count);
            }
        }
        System.out.println("Самая длинная последовательность " + count);
    }
}
