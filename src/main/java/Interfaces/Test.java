package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Eva");
        animal.sleep();
        person.sayHello();
        animal.showInfo();
        person.showInfo();
        outputInfo(animal); //полиморфизм
        outputInfo(person); //полиморфизм

        //Interface
        Info info1 = new Animal(1);
        Info info2 = new Person("Oleg");
        info1.showInfo(); //вызывается только такой метод, так как он объявлен в Интерфейсе
        info2.showInfo(); //вызывается только такой метод, так как он объявлен в Интерфейсе
    }

    public static void outputInfo(Info info){
        info.showInfo(); //реализация метода с помощью Интерфейса. Вызов конкретных объектов
    }

}

