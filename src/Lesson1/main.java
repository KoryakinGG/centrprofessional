package Lesson1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//*************************************************
        String name;
        int age;
        String city;
//*************************************************
        int a = 3;
        int b = 2;

//        System.out.print("два");
        System.out.print(b);
        System.out.print(" плюс ");
//        System.out.print(" минус ");
        System.out.print(a);
//        System.out.print("три");
        System.out.print(" равно ");
//        System.out.print(" будет ");
//        System.out.print("пять");
        System.out.print(a + b);
//*************************************************
        int x = 10;
        int y = 15;
        String s = "Hello World";
//*************************************************
        int number = 25;
        System.out.println();
        System.out.println("Квадрат из " + number + " равен " + number*number);
//*************************************************
        Scanner scanner = new Scanner(System.in);
        int TC = scanner.nextInt();
        float TF =  (float) (9 / 5.0) * TC + 32;
        System.out.println(TF);
//*************************************************
        Scanner scanner1 = new Scanner(System.in);
        double quantity = scanner1.nextDouble();
        System.out.println(quantity * 0.15);
//*************************************************
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Введите глубину: ");
        int depth = scanner2.nextInt();
        System.out.println("Введите ширину: ");
        int width = scanner3.nextInt();
        System.out.println("Введите длинну: ");
        int length = scanner4.nextInt();
        System.out.println("Объем бассейна равен: " + (depth*width*length) * 1000);
    }
}
