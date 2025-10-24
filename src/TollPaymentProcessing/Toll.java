package TollPaymentProcessing;

import java.util.Map;

public class Toll {
    private int id;
    private Map<String, Integer> tollRates;

    public Toll(int id, Map<String, Integer> tollRates) {
        this.id = id;
        this.tollRates = tollRates;
    }

    public int getId() {
        return id;
    }

    public int getRate(String vehicleType) {
        return tollRates.getOrDefault(vehicleType.toLowerCase(), 0);
    }

    public void displayDetails() {
        System.out.println("Toll Point " + id + " Rates: " + tollRates);
    }
}
