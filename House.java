// Abstract class
abstract class Building {
    String owner;
    String address;

    // Constructor
    Building(String owner, String address) {
        this.owner = owner;
        this.address = address;
    }

    // Abstract method
    abstract void build();
}

// House class inherits Building
class House extends Building {
    // Private variables for encapsulation
    private int rooms;
    private int floors;

    // Static variable
    static String country = "India";

    // Constructor overloading
    House(String owner, String address, int rooms, int floors) {
        super(owner, address);
        this.rooms = rooms;
        this.floors = floors;
    }

    House(String address, int rooms) {
        super("Rasiha", address);
        this.rooms = rooms;
        this.floors = 1;
    }

    // Getter & Setter methods
    public int getRooms() {
        return rooms;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    // Method overloading renovate()
    void renovate(String feature) {
        System.out.println("Renovating house with: " + feature);
    }

    void renovate(String feature, int cost) {
        System.out.println("Renovating house with: " + feature + " costing ₹" + cost);
    }

    // Override build()
    @Override
    void build() {
        System.out.println("Building a beautiful house with " + rooms + " rooms in " + address);
    }

    // showDetails()
    void showDetails() {
        System.out.println("House owned by: " + owner + " | Rooms: " + rooms + " | Floors: " + floors
                + " | Address: " + address + " | Country: " + country);
    }
}

// Villa class inherits House
class Villa extends House {
    boolean hasSwimmingPool;

    // Constructor
    Villa(String owner, String address, int rooms, int floors, boolean hasSwimmingPool) {
        super(owner, address, rooms, floors);
        this.hasSwimmingPool = hasSwimmingPool;
    }

    // Override build()
    @Override
    void build() {
        System.out.println("Building a luxurious villa with swimming pool in " + super.address);
    }

    // Override showDetails()
    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Swimming Pool: " + (hasSwimmingPool ? "Yes" : "No"));
    }
}

// Main class
public class OOPHouse{
    public static void main(String[] args) {
        // House 1
        House h1 = new House("Tamil", "Pudukkottai", 3, 2);
        h1.build();
        h1.showDetails();

        System.out.println();

        // House 2
        House h2 = new House("Trichy", 2);
        h2.build();
        h2.showDetails();
        System.out.println();
        h1.renovate("Garden");
        h1.renovate("Balcony", 50000);

        System.out.println();

        // Villa
        Villa v1 = new Villa("Thanishka", "ECR, Chennai", 5, 3, true);
        v1.build();
        v1.showDetails();
    }
}
