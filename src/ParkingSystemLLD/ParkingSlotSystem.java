package ParkingSystemLLD;

import java.util.*;

public class ParkingSlotSystem {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Scanner tempScan = new Scanner(System.in);
        while(true) {
            System.out.println("================Welcome To Parking Slot System======================");
            System.out.println("1.Park Vehicle");
            System.out.println("2. UnPark Vehicle");
            System.out.println("3. View Parking Status");
            System.out.println("4. View Active Tickets");
            System.out.println("5. Search Vehicle");
            System.out.println("6. Exit");
            System.out.println("Enter The User Task");
            int userChoice = tempScan.nextInt();
            switch(userChoice) {
                case 1:
                    System.out.println("Enter The Vehicle Number");
                    String VehicleNumber = tempScan.next();
                    System.out.println("Enter The Vehicle Color");
                    String VehicleColor = tempScan.next();
                    System.out.println("Enter The Vehicle Type");
                    String VehicleType = tempScan.next();
                   parkingLot.ParkVehicle(VehicleNumber, VehicleColor, VehicleType);
                    break;
                case 2:
                   // UnParkVehicle();
                    break;
                case 3:
                    parkingLot.ViewParkingStatus();
                    break;
                case 4:
                  //  parkingLot.ViewActiveTickets();
                    break;
                case 5:
                   // SearchVehicle();
                    break;
                case 6:
                    System.out.println("Exiting......");
                    System.exit(0);
                    break;
            }
        }
    }
}
