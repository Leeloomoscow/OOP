public class Human {
    int age = 20;
    String name = "Oleg";
    Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
    }
