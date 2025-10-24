package TollPaymentProcessing;

import java.util.*;

public class TollPaymentSystem {
    private static Map<String, Integer> createTollRates(int car, int bike, int truck) {
        Map<String, Integer> map = new HashMap<>();
        map.put("car", car);
        map.put("bike", bike);
        map.put("truck", truck);
        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Toll> tollPoints = new ArrayList<>();
        tollPoints.add(new Toll(0, createTollRates(50, 20, 100)));
        tollPoints.add(new Toll(1, createTollRates(60, 30, 120)));
        tollPoints.add(new Toll(2, createTollRates(70, 40, 150)));

        Highway highway = new Highway(tollPoints);

        while (true) {
            System.out.println("\n--- Toll Payment Menu ---");
            System.out.println("1. Process Journey");
            System.out.println("2. Display Toll Details");
            System.out.println("3. Display Vehicle Details");
            System.out.println("4. Find Shortest Route and Calculate Toll");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Vehicle Number: ");
                    String vehicleNumber = sc.next();
                    System.out.print("Enter Vehicle Type (car/bike/truck): ");
                    String vehicleType = sc.next();
                    System.out.print("Are You a VIP? (true/false): ");
                    boolean isVIP = sc.nextBoolean();
                    System.out.print("Enter Start Point (0-" + (tollPoints.size() - 1) + "): ");
                    int start = sc.nextInt();
                    System.out.print("Enter End Point (0-" + (tollPoints.size() - 1) + "): ");
                    int end = sc.nextInt();

                    int regularToll = highway.calculateRegularTollForRoute(start, end, vehicleType, isVIP);
                    System.out.println("Total Toll Paid: " + regularToll);

                    List<Integer> tollRoute = new ArrayList<>();
                    for (int i = start; i <= end; i++) {
                        tollRoute.add(i);
                    }
                    highway.processJourney(vehicleNumber, vehicleType, isVIP, String.valueOf(start), String.valueOf(end), tollRoute);
                    break;

                case 2:
                    highway.displayTollDetails();

                    break;

                case 3:
                    highway.displayVehicleDetails();
                    break;

                case 4:
                    System.out.print("Enter Start Point: ");
                    start = sc.nextInt();
                    System.out.print("Enter End Point: ");
                    end = sc.nextInt();
                    if (start > end) {
                        int temp = start;
                        start = end;
                        end = temp;
                    }
                    List<Integer> tollRouteCircular = highway.findCircularRoute(start, end);
                    System.out.println("Shortest Route Tolls: " + tollRouteCircular);

                    System.out.print("Enter Vehicle Type (car/bike/truck): ");
                    vehicleType = sc.next();
                    System.out.print("Are You a VIP? (true/false): ");
                    isVIP = sc.nextBoolean();

                    int totalCostCircular = highway.calculateTollForRoute(tollRouteCircular, vehicleType, isVIP);
                    System.out.println("Total Toll Cost For Circular Route: " + totalCostCircular);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
        }
    }
}
