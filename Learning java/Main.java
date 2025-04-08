interface Animal{
    void makeSound();
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound(); // Outputs: Meow! Meow!
    }
}
