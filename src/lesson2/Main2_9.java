package lesson2;

import java.util.Random;

/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
public class Main2_9 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int [100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int count = 0;
        for (int a: array) {
//            System.out.print(a + " ;");
            if (a == 5) {
                System.out.println("Да");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Нет");
        }
        System.out.println("Число " + 5 + " встречается " + count + " раз");
    }
}
