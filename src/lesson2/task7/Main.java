package lesson2.task7;
/*
Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы.
То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30. Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/
public class Main {
    public static void main(String[] args) {
        int x = 31;

        if (x % 31 == 0 && x % 1 == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}