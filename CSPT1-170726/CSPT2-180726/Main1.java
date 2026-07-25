class Vehicle {
    public void drive() {
        System.out.println("Repairing a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive(); 
    }
}
