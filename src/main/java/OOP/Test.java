package OOP;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Cat cat = new Cat();
        cat.eat();
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        dog.showName();
        cat.showName();

        //Вызов полиморфизма
        testPolimorfizm(dog);
        testPolimorfizm(cat);
        testPolimorfizm(animal);
    }
    public static void testPolimorfizm(Animal animal){ //Полиморфизм
        animal.sleep();
    }
}
