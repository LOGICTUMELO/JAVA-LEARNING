
    class Animal {
        String name;

        public void makeSound() {
            System.out.println("Some generic animal sound...");
        }
    }

    // Child class (inherits from Animal)
    class Dog extends Animal {
        public void makeSound() {
            System.out.println("Woof! Woof!");
        }
    }

    // Main class
    public class main2{
        public static void main(String[] args) {
            Dog myDog = new Dog();
            myDog.name = "Buddy";
            System.out.println("Dog name: " + myDog.name);
            myDog.makeSound(); // Outputs: Woof! Woof!
        }
    }
