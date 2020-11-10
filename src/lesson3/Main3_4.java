package lesson3;
/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/
public class Main3_4 {

    public static boolean sum (int a, int b) {
        return a+b>10;
    }

    public static void main(String[] args) {
        int first = 5;
        int second = 6;

        System.out.println(sum(first,second));
    }
}
