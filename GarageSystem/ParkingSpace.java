class ParkingSpace {
    private Vehicle vehicle;

    public boolean isAvailable() {
        return vehicle == null;
    }

    public void occupy(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}
