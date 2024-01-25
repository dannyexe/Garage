abstract class Vehicle {
    private String licensePlate;
    private String arrivalTime;

    public String getLicensePlate() {
        return licensePlate;
    }
    
    public Vehicle(String licensePlate, String arrivalTime) {
        this.licensePlate = licensePlate;
        this.arrivalTime = arrivalTime;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public abstract String getParkingInstructions();
}
