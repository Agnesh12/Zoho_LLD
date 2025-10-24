package ParkingManagementSystem;

import java.util.*;

class ParkingLot {
    private String name;
    private List<ParkingFloor> floors;
    private Map<String, Ticket> activeTickets = new HashMap<>();

    public ParkingLot(String name, List<ParkingFloor> floors) {
        this.name = name;
        this.floors = floors;
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : floors) {
            ParkingSlot slot = floor.getAvailableSlot(vehicle.getType());
            if (slot != null) {
                slot.park(vehicle);
                String ticketId = UUID.randomUUID().toString();
                Ticket ticket = new Ticket(ticketId, vehicle, slot);
                activeTickets.put(ticketId, ticket);
                System.out.println("Vehicle parked. Ticket ID: " + ticketId);
                return ticket;
            }
        }
        System.out.println("No available slots for " + vehicle.getType());
        return null;
    }

    public void unparkVehicle(String ticketId) {
        Ticket ticket = activeTickets.get(ticketId);
        if (ticket == null) {
            System.out.println("Invalid Ticket!");
            return;
        }
        ticket.getSlot().unpark();
        activeTickets.remove(ticketId);
        System.out.println("Vehicle " + ticket.getVehicle().getVehicleNumber() + " unparked.");
    }
}

