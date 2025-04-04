import java.util.Scanner;

class Device {
    String brand, model;

    Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}

class SmartDevice extends Device {
    int batteryLife;
    String connectivityType;

    SmartDevice(String brand, String model, int batteryLife, String connectivityType) {
        super(brand, model);
        this.batteryLife = batteryLife;
        this.connectivityType = connectivityType;
    }
}

class Smartphone extends SmartDevice {
    int cameraResolution;

    Smartphone(String brand, String model, int batteryLife, String connectivityType, int cameraResolution) {
        super(brand, model, batteryLife, connectivityType);
        this.cameraResolution = cameraResolution;
    }

    void showSpecifications() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("Connectivity: " + connectivityType);
        System.out.println("Camera Resolution: " + cameraResolution + " MP");
    }
}

public class Mobile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter brand:");
        String brand = input.nextLine();
        System.out.print("Enter model:");
        String model = input.nextLine();
        System.out.print("Enter required battery life:");
        int batteryLife = input.nextInt();
        input.nextLine();
        System.out.print("Enter connectivity type");
        String connectivityType = input.nextLine();
        System.out.println("Enter required camera resolution");
        int cameraResolution = input.nextInt();
        input.nextLine();
        Smartphone phone = new Smartphone(brand, model, batteryLife, connectivityType, cameraResolution);
        phone.showSpecifications();
        input.close();
    }
}
