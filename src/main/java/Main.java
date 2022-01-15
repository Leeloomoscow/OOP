import OPP_abstract.Human;
import OPP_abstract.Man;
import OPP_abstract.Woman;

public class Main {
    public static void main(String[] args) {
//        Human human = new Human(); ошибка так как это абстрактный класс, не нужно создавать объект
        Man man = new Man();
        Woman woman = new Woman();
        woman.makeSound();
        man.makeSound();
        man.eat();

    }
}