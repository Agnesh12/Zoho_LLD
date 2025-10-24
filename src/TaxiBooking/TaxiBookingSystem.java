package TaxiBooking;
import java.util.*;
public class TaxiBookingSystem {
    static List<Taxi> taxis = new ArrayList<>();
    static Scanner tempScan = new Scanner(System.in);
    static int customerCounter = 1;
    public static void initializeTaxis(int n) {
        for(int i = 1; i <= n; i++) {
            taxis.add(new Taxi(i));
        }
    }

    public static void bookTaxi() {
        int customerId = customerCounter++;
        System.out.println("Enter Pickup Point (A-F): ");
        char pickup = tempScan.next().toUpperCase().charAt(0);
        System.out.println("Enter Drop Point (A-F): ");
        char drop = tempScan.next().toUpperCase().charAt(0);
        System.out.println("Enter PickUp Time(in hours): ");
        int pickupTime = tempScan.nextInt();

        Taxi selectedTaxi = null;
        int minDistance = Integer.MAX_VALUE;
        for(Taxi taxi : taxis) {
            if(taxi.isAvailable(pickupTime)) {
                int distance = Math.abs(taxi.currentPoint - pickup);
                if(distance < minDistance || (distance == minDistance && taxi.totalEarnings < selectedTaxi.totalEarnings)) {
                    selectedTaxi = taxi;
                    minDistance = distance;
                }
            }
        }
        if(selectedTaxi == null) {
            System.out.println("Booking Rejected. No Taxis Available");
            return;
        }
        int dropTime = pickupTime + Math.abs(drop - pickup);
        int amount = selectedTaxi.calculateEarnings(pickup, drop);
        int bookingId = selectedTaxi.bookings.size() + 1;
        Booking booking = new Booking(bookingId, customerId, pickupTime, dropTime, amount, pickup, drop);
        selectedTaxi.addBooking(booking);
        System.out.println("Taxi-" + selectedTaxi.id + " is Allocated");

    }
    public static void displayTaxiDetails() {
        for(Taxi taxi : taxis) {
            System.out.println("Taxi-" + taxi.id + "Total Earnings: Rs. " + taxi.totalEarnings);
            System.out.printf("%-10s %-10s %-5s %-5s %-12s %-9s %-6s%n", "BookingId", "CustomerId", "From", "To", "PickupTime", "DropTime", "Amount");
            for(Booking booking : taxi.bookings) {
                System.out.printf("%-10d %-10d %-5c %-5c %-12d %-9d %-6d%n", booking.bookingId, booking.customerId, booking.from, booking.to, booking.pickupTime, booking.dropTime, booking.amount);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter The Number Of Taxis:");
        int numTaxis = tempScan.nextInt();
        initializeTaxis(numTaxis);
        while(true) {
            System.out.println("1. Book Taxi");
            System.out.println("2. Display Taxi Details");
            System.out.println("3. Exit");
            System.out.println("Enter The User Choice");
            int userChoice = tempScan.nextInt();
            switch (userChoice){
                case 1:
                    bookTaxi();
                    break;
                case 2:
                    displayTaxiDetails();
                    break;
                case 3:
                    System.out.println("Exiting......");
                    return;
                default:
                    System.out.println("Invalid Choice. Try Again");
            }
        }

    }
}
