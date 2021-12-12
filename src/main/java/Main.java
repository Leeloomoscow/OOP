import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя для man:");
        String name1 = scan.nextLine();
        System.out.println("Введите ваш возраст:");
        int age1 = scan.nextInt();

        Human man = new Human(age1, name1);
        name1 = scan.nextLine();
        System.out.println("Введите ваше имя для woman:");
        name1 = scan.nextLine();
        System.out.println("Введите ваш возраст:");
        age1 = scan.nextInt();
        Human woman = new Human(age1, name1);
        System.out.println(woman.name+" - "+woman.age);
        man.sayHello(woman.name);
        woman.sayHello(man.name);
    }
}

