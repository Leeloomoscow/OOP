package OOP;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Cat cat = new Cat();
        cat.eat();
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        cat.sleep();
        dog.showName();
        cat.showName();
    }
}
