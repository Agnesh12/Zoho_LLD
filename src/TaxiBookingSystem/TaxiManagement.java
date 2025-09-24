package TaxiBookingSystem;

import java.util.ArrayList;

public class TaxiManagement {

    ArrayList<Taxi> taxis = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();
    private int bookingCounter = 1;
        public TaxiManagement(int taxiCount) {
            for (int i = 1; i <= taxiCount; i++) {
                taxis.add(new Taxi(i, 'A', 0, 'A', 0));
            }
        }
    public void BookTaxi(int customer_Id, char pickUp, char Drop_Point, int pickUpTime) {
        Taxi pickingTaxi = PickingTaxi(pickUp, pickUpTime);
        if(pickingTaxi == null) {
            System.out.println("No Taxi Available");
            return;
        }
        int distance = Math.abs(Drop_Point - pickUp) * 15;
        int fare = distance * 10;
        int dropTime = pickUpTime + (distance / 15);
        Booking booking = new Booking(bookingCounter++, customer_Id, pickUp, Drop_Point, fare, pickingTaxi, pickUpTime, dropTime);
        bookings.add(booking);
        pickingTaxi.setFreeTime(dropTime);
        pickingTaxi.setTotalEarnings(fare);
        pickingTaxi.setStartingPoint(Drop_Point);
        System.out.println("Taxi Booked Successfully");
    }
    public void UnBookTaxi(int bookingId) {
            Booking chosenBooking = null;
            for(Booking booking : bookings) {
                if(booking.getBooking_Id() == bookingId) {
                    chosenBooking = booking;
                }
            }
            int fare = chosenBooking.getFare();


    }
    public void ShowRecords() {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "Booking_Id", "Customer_Id", "Taxi_Id", "Starting Point", "Ending Point", "Cost");
        System.out.println("--------------------------------------------------------------------------------------------------");
        for(Booking booking : bookings) {
            System.out.printf("%-15d %-15d %-15d %-15c %-15c %-15d\n", booking.getBooking_Id(), booking.getCustomer_Id(), booking.getAssignedTaxi().getTaxi_id(), booking.getStartingPoint(), booking.getEndingPoint(), booking.getFare());
        }
        System.out.println("--------------------------------------------------------------------------------------------------");
    }
    public Taxi PickingTaxi(char pickUp, int PickUpTime) {
        Taxi chosen = null;
        int minDistanceTaxi = Integer.MAX_VALUE;
        for(Taxi taxi : taxis) {
            if(taxi.getFreeTime() <= PickUpTime) {
                int DistanceTaxi = Math.abs(pickUp - taxi.getEndingPoint()) * 15;
                if(DistanceTaxi < minDistanceTaxi) {
                    minDistanceTaxi = DistanceTaxi;
                    chosen = taxi;
                }
                else if(minDistanceTaxi == DistanceTaxi) {
                    if(chosen.getTotalEarnings() < taxi.getTotalEarnings()) {
                        chosen = taxi;
                    }
                }
            }
        }
        return chosen;

    }
}
