class Building {
    String address;
    int constructionYear;

    Building(Strcing address, int constructionYear) {
        this.address = address;
        this.constructionYear = constructionYear;
    }
}

class House extends Building {
    int numRooms;
    boolean hasGarage;

    House(String address, int constructionYear, int numRooms, boolean hasGarage) {
        super(address, constructionYear);
        this.numRooms = numRooms;
        this.hasGarage = hasGarage;
    }
}

class Villa extends House {
    double swimmingPoolSize;

    Villa(String address, int constructionYear, int numRooms, boolean hasGarage, double swimmingPoolSize) {
        super(address, constructionYear, numRooms, hasGarage);
        this.swimmingPoolSize = swimmingPoolSize;
    }

    void showVillaDetails() {
        System.out.println("Address: " + address);
        System.out.println("Construction Year: " + constructionYear);
        System.out.println("Number of Rooms: " + numRooms);
        System.out.println("Has Garage: " + (hasGarage ? "Yes" : "No"));
        System.out.println("Swimming Pool Size: " + swimmingPoolSize + " meters");
    }
}

public class Plot {
    public static void main(String[] args) {
        Villa myVilla = new Villa("123 Beach Road", 2015, 5, true, 30.5);
        myVilla.showVillaDetails();
    }
}
