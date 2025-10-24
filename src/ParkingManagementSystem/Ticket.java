package ParkingManagementSystem;

import java.time.LocalDateTime;

class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSlot slot;
    private LocalDateTime entryTime;

    public Ticket(String ticketId, Vehicle vehicle, ParkingSlot slot) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.slot = slot;
        this.entryTime = LocalDateTime.now();
    }

    public String getTicketId() {
        return ticketId;
    }

    public LocalDateTime getEntryTime() { return entryTime; }
    public ParkingSlot getSlot() { return slot; }
    public Vehicle getVehicle() { return vehicle; }
}

