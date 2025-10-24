package ParkingManagementSystem;

class ParkingSlot {
    private String id;
    private VehicleType slotType;
    private boolean isFree;
    private Vehicle parkedVehicle;

    public ParkingSlot(String id, VehicleType type) {
        this.id = id;
        this.slotType = type;
        this.isFree = true;
    }

    public boolean isFree() { return isFree; }
    public VehicleType getSlotType() { return slotType; }

    public void park(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.isFree = false;
    }

    public void unpark() {
        this.parkedVehicle = null;
        this.isFree = true;
    }
}

