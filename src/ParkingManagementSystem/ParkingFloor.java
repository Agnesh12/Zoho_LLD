package ParkingManagementSystem;

import java.util.*;

class ParkingFloor {
    private String floorNumber;
    private List<ParkingSlot> slots;

    public ParkingFloor(String floorNumber, List<ParkingSlot> slots) {
        this.floorNumber = floorNumber;
        this.slots = slots;
    }

    public ParkingSlot getAvailableSlot(VehicleType type) {
        for (ParkingSlot slot : slots) {
            if (slot.isFree() && slot.getSlotType() == type) {
                return slot;
            }
        }
        return null;
    }
}

