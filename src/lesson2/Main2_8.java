package lesson2;
/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/
public class Main2_8 {
    public static void main(String[] args) {
        int [] array = {2,3,4,5};

        int sum = 0;
        for (int i = 0; i <array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
