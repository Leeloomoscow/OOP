package OOP_incapsulation;

public class Person {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Какое-то имя");
        human1.setAge(-1);
        human1.getName();
        System.out.println("Выводим имя на экран: " + human1.getName());
        human1.getAge();
        System.out.println("Выводим возраст на экран: " + human1.getAge());
    }
}

class Human {
    private String name; //доступно в пределах этого класса
    private int age; //доступно в пределах этого класса

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст должен быть положительным!");
        } else
            this.age = age;
    }

}