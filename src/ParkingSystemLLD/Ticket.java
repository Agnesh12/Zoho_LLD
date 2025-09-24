package ParkingSystemLLD;

public class Ticket {
    private int AllocatedId;
    private Vehicle vehicle;

    public Ticket(int AllocatedId, Vehicle vehicle) {
        this.AllocatedId = AllocatedId;
        this.vehicle = vehicle;
    }
    public void setAllocatedId(int AllocatedId) {
        this.AllocatedId = AllocatedId;
    }
    public int getAllocatedId() {
        return AllocatedId;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
}
