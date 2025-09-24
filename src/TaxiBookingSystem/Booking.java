package TaxiBookingSystem;

import java.util.ArrayList;

public class Booking {
    private int booking_Id;
    private int customer_Id;
    private char startingPoint;
    private char endingPoint;
    private int fare;
    private Taxi assignedTaxi;

    public Booking(int booking_Id, int customer_Id, char startingPoint, char endingPoint, int fare, Taxi assignedTaxi, int pickupTime, int dropTime) {
        this.booking_Id = booking_Id;
        this.customer_Id = customer_Id;
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
        this.fare = fare;
        this.assignedTaxi = assignedTaxi;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
    }

    public int getBooking_Id() {
        return booking_Id;
    }

    public void setBooking_Id(int booking_Id) {
        this.booking_Id = booking_Id;
    }

    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public char getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(char startingPoint) {
        this.startingPoint = startingPoint;
    }

    public char getEndingPoint() {
        return endingPoint;
    }

    public void setEndingPoint(char endingPoint) {
        this.endingPoint = endingPoint;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public Taxi getAssignedTaxi() {
        return assignedTaxi;
    }

    public void setAssignedTaxi(Taxi assignedTaxi) {
        this.assignedTaxi = assignedTaxi;
    }

    public int getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(int pickupTime) {
        this.pickupTime = pickupTime;
    }

    public int getDropTime() {
        return dropTime;
    }

    public void setDropTime(int dropTime) {
        this.dropTime = dropTime;
    }

    private int pickupTime;
    private int dropTime;


}
