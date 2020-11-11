package lesson3.task1;
/* Написать функцию, которая вычисляет минимум из трёх чисел.
Требования:
•	Программа должна выводить текст на экран.
•	Метод min не должен выводить текст на экран.
•	Метод main должен вызвать метод min четыре раза.
•	Метод main должен выводить на экран результат работы метода min. Каждый раз с новой строки.
•	Метод min должен возвращать минимальное значение из чисел a, b и с.
*/
public class Main {
       public static void main(String[] args) {
            System.out.println(min(1, 2, 3));
            System.out.println(min(-1, -2, -3));
            System.out.println(min(3, 5, 3));
            System.out.println(min(5, 5, 10));
            System.out.println(min(1, 5, 10));
            System.out.println(min(5, 1, -10));
            System.out.println(min(10, 5, 1));
            System.out.println(min(5, 10, -1));
        }

//    public static int min(int a, int b, int c) {
//        return a>b?(c>b?b:c):a;
//    }

    public static int min(int a, int b, int c) {
        int x  = Math.min(a, b);
        int y = Math.min(b, c);
        return Math.min(x, y);
    }
}



