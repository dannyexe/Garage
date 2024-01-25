public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(10); 
        Car car1 = new Car("ABC123", "Sedan", null);
        Motorcycle bike1 = new Motorcycle("XYZ789", null, 2);

        garage.parkVehicle(car1);
        garage.parkVehicle(bike1);
    }
}
