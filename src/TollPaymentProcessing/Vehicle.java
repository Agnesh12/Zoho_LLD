package TollPaymentProcessing;


import java.util.*;

public class Vehicle {
    private String number;
    private String type;
    private boolean isVIP;
    private List<List<Integer>> journeys = new ArrayList<>();

    public Vehicle(String number, String type, boolean isVIP) {
        this.number = number;
        this.type = type.toLowerCase();
        this.isVIP = isVIP;
    }

    public void addJourney(List<Integer> route) {
        journeys.add(route);
    }

    public void displayDetails() {
        System.out.println("Vehicle: " + number + " | Type: " + type + " | VIP: " + isVIP);
        System.out.println("Journeys: " + journeys);
    }
}
