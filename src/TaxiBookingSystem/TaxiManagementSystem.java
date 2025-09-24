package TaxiBookingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class TaxiManagementSystem {
    public static void main(String[] args) {
        ArrayList<Taxi> taxis = new ArrayList<>();
        Scanner tempScan = new Scanner(System.in);
        System.out.println("Enter The Number of Taxi");
        int taxiNumber = tempScan.nextInt();
        TaxiManagement management = new TaxiManagement(taxiNumber);

        while(true) {
            System.out.println("==============Taxi Management System==========");
            System.out.println("1.Book Taxi");
            System.out.println("2.UnBook Taxi");
            System.out.println("3. Show Bookings");
            System.out.println("4.Exit");
            System.out.println("Enter The User Choice");
            int userChoice = tempScan.nextInt();
            switch(userChoice) {
                case 1:
                    System.out.println("Enter The Customer Id");
                    int customer_Id = tempScan.nextInt();
                    System.out.println("Enter PickUp Point (A-F)");
                    char pickUp = tempScan.next().charAt(0);
                    System.out.println("Enter The DropPoint (A-F)");
                    char drop = tempScan.next().charAt(0);
                    System.out.println("Enter The PickUp Time(1-24)");
                    int pickUpTime = tempScan.nextInt();
                    management.BookTaxi(customer_Id, pickUp, drop, pickUpTime);
                    break;
                case 2:
                    System.out.println("Enter The Booking_Id");
                    int booking_id = tempScan.nextInt();
                    management.UnBookTaxi(booking_id);
                    break;
                case 3:
                    management.ShowRecords();
                    break;
                case 4:
                    System.out.println("Exiting......");
                    System.exit(0);
            }
        }
    }
}
