package lesson4.task5;
/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/
public class Main {
    public static void main(String[] args) {
        Horse plotva = new Horse("Плотва", 4, 4);
        Pegasus pushistik = new Pegasus("Пушистик", 2, 4, 2);
        plotva.run();
        pushistik.fly();
    }
}

abstract class Animal {
    private String name;
    private int age;
    private int leg;

    public Animal(String name, int age, int leg) {
        this.name = name;
        this.age = age;
        this.leg = leg;
    }
}

class Horse extends Animal {
    public Horse(String name, int age, int leg) {
        super(name, age, leg);
    }

    public void run(){
        System.out.println("Игого, я поскакал(а)");}
}

class Pegasus extends Horse {
    private int wing;
    public Pegasus(String name, int age, int leg, int wing) {
        super(name, age, leg);
        this.wing = wing;
    }

    public void fly(){
        System.out.println("Игого, я полетел(а)"); }
}