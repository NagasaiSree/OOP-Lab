class Appliance {
    String brand;
    int powerConsumption;

    Appliance(String brand, int powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
    }
}

class WashingMachine extends Appliance {
    int capacity;
    String washModes;

    WashingMachine(String brand, int powerConsumption, int capacity, String washModes) {
        super(brand, powerConsumption);
        this.capacity = capacity;
        this.washModes = washModes;
    }

    void showWashingMachineInfo() {
        System.out.println("Washing Machine Brand: " + brand);
        System.out.println("Power Consumption: " + powerConsumption + " watts");
        System.out.println("Capacity: " + capacity + " kg");
        System.out.println("Wash Modes: " + washModes);
    }
}

public class Homeappliance {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("LG", 500, 7, "Quick, Normal, Heavy");
        wm.showWashingMachineInfo();
    }
}
