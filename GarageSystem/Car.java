class Car extends Vehicle {
    private String engineType;

    public Car(String licensePlate, String arrivalTime, String engineType) {
        super(licensePlate, arrivalTime);  
        this.engineType = engineType;
    }
    
    @Override
    public String getParkingInstructions() {
        return "Park in a standard space. Turn off engine and engage parking brake.";
    }
    
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    
}
