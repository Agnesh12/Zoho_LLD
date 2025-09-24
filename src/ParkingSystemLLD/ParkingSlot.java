package ParkingSystemLLD;

public class ParkingSlot {
    private int slotId;
    private VehicleType vehicleType;


    public ParkingSlot(int slotId, VehicleType vehicleType, int parkingSlotSize) {
        this.slotId = slotId;
        this.vehicleType = vehicleType;

    }


    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }
    public int getSlotId() {
        return slotId;
    }
    public void setVehicleType(VehicleType vehicleType){
        this.vehicleType = vehicleType;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }

}
