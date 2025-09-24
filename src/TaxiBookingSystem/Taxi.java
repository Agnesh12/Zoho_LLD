package TaxiBookingSystem;

import java.util.ArrayList;

public class Taxi {

     private int taxi_id;
     private char startingPoint = 'A';
     private int totalEarnings = 0;
     private char endingPoint;
     private int freeTime;

    Taxi(int taxi_id, char startingPoint, int totalEarnings, char endingPoint, int freeTime) {
     this.taxi_id = taxi_id;
     this.startingPoint = startingPoint;
     this.totalEarnings = totalEarnings;
     this.endingPoint = endingPoint;
     this.freeTime = freeTime;
    }

    public int getTaxi_id() {
        return taxi_id;
    }

    public void setTaxi_id(int taxi_id) {
        this.taxi_id = taxi_id;
    }

    public int getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(int freeTime) {
        this.freeTime = freeTime;
    }

    public char getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(char startingPoint) {
        this.startingPoint = startingPoint;
    }

    public int getTotalEarnings() {
        return totalEarnings;
    }

    public void setTotalEarnings(int totalEarnings) {
        this.totalEarnings += totalEarnings;
    }

    public char getEndingPoint() {
        return endingPoint;
    }

    public void setEndingPoint(char endingPoint) {
        this.endingPoint = endingPoint;
    }
}
