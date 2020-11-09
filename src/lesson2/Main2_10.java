package lesson2;

import java.util.Random;

/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
public class Main2_10 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] array = new int [100];
        for (int i = 0; i <array.length; i++) {
            array[i] = random.nextInt(20);
        }

        for (int a : array) {
            System.out.print(a + " ;");
        }

        int number = 0;
        for (int i = 0; i < array.length-1; i++) {
            number = array[i];
            if (array[i+1] == number) {
                System.out.println("Да: " + number);
            }
        }
    }
}
