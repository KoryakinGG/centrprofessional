package lesson3;
/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/
public class Main3_3 {

    public static boolean equality (int a, int b) {
        return a==b;
    }

    public static void main(String[] args) {
        int first = 6;
        int second = 5;

        System.out.println(equality(first,second));
    }
}
