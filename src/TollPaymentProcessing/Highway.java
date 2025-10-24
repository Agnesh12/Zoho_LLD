package TollPaymentProcessing;

import java.util.*;

public class Highway {
    private List<Toll> tollPoints;
    private Map<String, Vehicle> vehicles = new HashMap<>();

    public Highway(List<Toll> tollPoints) {
        this.tollPoints = tollPoints;
    }

    // Regular (straight path) toll calculation
    public int calculateRegularTollForRoute(int start, int end, String vehicleType, boolean isVIP) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            Toll toll = tollPoints.get(i);
            int rate = toll.getRate(vehicleType.toLowerCase());
            if (isVIP) rate = 0; // VIP exemption
            total += rate;
        }
        return total;
    }

    // Process a journey
    public void processJourney(String vehicleNumber, String vehicleType, boolean isVIP, String start, String end, List<Integer> route) {
        Vehicle vehicle = vehicles.getOrDefault(vehicleNumber, new Vehicle(vehicleNumber, vehicleType, isVIP));
        vehicle.addJourney(route);
        vehicles.put(vehicleNumber, vehicle);
        System.out.println("Journey Processed for Vehicle: " + vehicleNumber);
    }

    // Display toll details
    public void displayTollDetails() {
        for (Toll toll : tollPoints) {
            toll.displayDetails();
        }
    }

    // Display vehicle details
    public void displayVehicleDetails() {
        for (Vehicle v : vehicles.values()) {
            v.displayDetails();
        }
    }

    // Find circular route (example: choose smaller path clockwise or anticlockwise)
    public List<Integer> findCircularRoute(int start, int end) {
        List<Integer> forward = new ArrayList<>();
        for (int i = start; i <= end; i++) forward.add(i);

        List<Integer> backward = new ArrayList<>();
        for (int i = start; i >= 0; i--) backward.add(i);
        for (int i = tollPoints.size() - 1; i >= end; i--) backward.add(i);

        return (forward.size() <= backward.size()) ? forward : backward;
    }

    // Calculate toll for a given route
    public int calculateTollForRoute(List<Integer>  route, String vehicleType, boolean isVIP) {
        int total = 0;
        for (int i : route) {
            Toll toll = tollPoints.get(i);
            int rate = toll.getRate(vehicleType.toLowerCase());
            if (isVIP) rate = 0;
            total += rate;
        }
        return total;
    }
}
