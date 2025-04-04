class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Bike extends Vehicle {
    int engineCapacity;

    Bike(String brand, int speed, int engineCapacity) {
        super(brand, speed);
        this.engineCapacity = engineCapacity;
    }

    void showBikeDetails() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(String brand, int speed, int loadCapacity) {
        super(brand, speed);
        this.loadCapacity = loadCapacity;
    }

    void showTruckDetails() {
        System.out.println("Truck Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

public class automobile  {
    public static void main(String[] args) {
        Bike myBike = new Bike("Yamaha", 120, 150);
        Truck myTruck = new Truck("Volvo", 80, 20);

        myBike.showBikeDetails();
        myTruck.showTruckDetails();
    }
}
