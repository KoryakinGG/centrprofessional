package lesson3.task5;

import java.util.Arrays;

/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/
public class Main {
    public static void main(String[] args) {
        int num[] = {4,2,6,2,65};
        print(num,0);
    }

    public static void print(int[] list, int index) {
        if (index < list.length) {
            System.out.println(list[index]);
            print(list, index+1);
        }
    }
}
