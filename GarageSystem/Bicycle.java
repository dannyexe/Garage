class Bicycle extends Vehicle {
	
	public Bicycle(String licensePlate, String arrivalTime) {
        super(licensePlate, arrivalTime);
    }
    @Override
    public String getParkingInstructions() {
        return "Store your bike in the designated rack. Lock it securely.";
    }
}
