class Motorcycle extends Vehicle {
    private int numberOfWheels;
    
    public Motorcycle(String licensePlate, String arrivalTime, int numberOfWheels) {
        super(licensePlate, arrivalTime);  
        this.numberOfWheels = numberOfWheels;
    }
    
    @Override
    public String getParkingInstructions() {
        return "Park in a designated motorcycle space. Use kickstand for stability.";
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    
}
