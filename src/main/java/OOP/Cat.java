package OOP;

public class Cat extends Animal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("cat is eating");
    }
    public void showName(){ //метод для поля String в Animal
        System.out.println(name1);
    }
}




