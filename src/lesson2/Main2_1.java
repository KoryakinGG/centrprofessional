package lesson2;
/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */
public class Main2_1 {
    public static void main(String[] args) {

        String [] array1 = {"Мама","Мыла","Раму"};
        String [] array2 = {"Мыла","Мама","Раму"};
        String [] array3 = {"Раму","Мыла","Мама"};
        String [] array4 = {"Раму","Мама","Мыла"};
        String [] array5 = {"Мама","Раму","Мыла"};
        String [] array6 = {"Мыла","Раму","Мама"};


        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
        }
        System.out.println();
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i]);
        }
        System.out.println();
        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i]);
        }
        System.out.println();
        for (int i = 0; i < array6.length; i++) {
            System.out.print(array6[i]);
        }

    }
}
