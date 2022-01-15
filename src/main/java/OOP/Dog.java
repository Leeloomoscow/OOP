package OOP;

public class Dog extends Animal {
    public void bark(){
        System.out.println("dog barking");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog is eating");
    }
    public void showName(){ //метод для поля String в Animal
        System.out.println(name);
    }
}

