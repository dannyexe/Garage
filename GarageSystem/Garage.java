import java.util.ArrayList;
import java.util.List;

class Garage {
    private List<ParkingSpace> ParkingSpaces;
    
    public boolean parkVehicle(Vehicle vehicle) {
        if (!isFull()) {
            ParkingSpace space = getAvailableSpace(vehicle);
            space.occupy(vehicle);
            System.out.println("Vehicle parked successfully! " + vehicle.getParkingInstructions());
            return true;
        } else {
            System.out.println("Garage is full.");
            return false;
        }
    }
    
    public Garage(int numberOfSpaces) {
        ParkingSpaces = new ArrayList<>(numberOfSpaces);
        for (int i = 0; i < numberOfSpaces; i++) {
            ParkingSpaces.add(new ParkingSpace()); 
        }
    }

    public boolean isFull() {
        return ParkingSpaces.stream().noneMatch(ParkingSpace::isAvailable);
    }

    public ParkingSpace getAvailableSpace(Vehicle vehicle) {
        
        return ParkingSpaces.stream().filter(ParkingSpace::isAvailable).findFirst().orElse(null);
    }

}
