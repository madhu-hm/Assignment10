package assignment10;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting...");
    }

    void stop() {
        System.out.println("Car is stopping...");
    }
}

class Bike extends Vehicle {
   
    void start() {
        System.out.println("Bike is starting...");
    }

    void stop() {
        System.out.println("Bike is stopping...");
    }
}

public class VehicleDemo {
	public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.stop();

        myBike.start();
        myBike.stop();
    }
}
