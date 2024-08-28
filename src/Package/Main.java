import animals.Animal;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.travel();
    }
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void travel() {
        System.out.println("Dog travels");
    }
}
