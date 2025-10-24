package ParkingManagementSystem;

import java.util.Arrays;
import java.util.List;

public class ParkingManagement { public static void main(String[] args) {
    List<ParkingSlot> slots1 = Arrays.asList(
            new ParkingSlot("S1", VehicleType.CAR),
            new ParkingSlot("S2", VehicleType.BIKE)
    );

    List<ParkingSlot> slots2 = Arrays.asList(
            new ParkingSlot("S3", VehicleType.CAR),
            new ParkingSlot("S4", VehicleType.TRUCK)
    );

    ParkingFloor f1 = new ParkingFloor("F1", slots1);
    ParkingFloor f2 = new ParkingFloor("F2", slots2);

    ParkingLot lot = new ParkingLot("CityLot", Arrays.asList(f1, f2));

    Vehicle car = new Vehicle("TN01AB1234", VehicleType.CAR) {};
    Ticket t = lot.parkVehicle(car);
    lot.unparkVehicle(t.getTicketId());
}

}
