package ParkingSystemLLD;

import java.util.ArrayList;

public class ParkingLot {

    ArrayList<ArrayList<ParkingSlot>> parkingLevels = new ArrayList<>();
    public void ViewParkingStatus() {
        for(int index = 0; index < 3; index++) {
            parkingLevels.add(new ArrayList<>());
            System.out.println("Level" + index + ":" + (3 - parkingLevels.get(index).size()));
        }
    }
    public void ParkVehicle(String VehicleNumber, String VehicleColor, String vehicleType) {
        VehicleType type;
        if(vehicleType.equalsIgnoreCase("CAR")) {
            type = VehicleType.CAR;
        }
        else if(vehicleType.equalsIgnoreCase("BIKE")) {
            type = VehicleType.BIKE;
        }
        else {
            type = VehicleType.TRUCK;
        }
        /*for(ArrayList<ParkingSlot> parkingSlot : parkingLevels) {
            if(parkingSlot.size() < 3) {
               parkingSlot.add(new Vehicle(VehicleNumber, VehicleColor, type));
            }
        }*/
    }

}
