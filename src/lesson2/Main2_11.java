package lesson2;

import java.util.Random;

/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/
public class Main2_11 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int [20];
        for (int i = 0; i <array.length; i++) {
            array[i] = random.nextInt(4);
        }

        for (int x: array) {
            System.out.print(x + " ;");
        }
        System.out.println();

        int count = 0;
        int sum = 0;
        for (int i = 0; i <array.length-1; i++) {
            sum += array[i];
            count++;
            if (sum >= 10) {
                System.out.println("Количество элементов: " + count);
                break;
            }
        }
    }
}
