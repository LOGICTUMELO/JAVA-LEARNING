// Car class with encapsulation
class Car {
    private String brand;
    private int speed;

    // Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to accelerate
    public void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " is now going at " + speed + " km/h.");
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }
}

// Main class
public class Main1{
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 50);
        myCar.accelerate(20); // Output: Toyota is now going at 70 km/h.
        System.out.println("Current Speed: " + myCar.getSpeed() + " km/h");
    }
}
