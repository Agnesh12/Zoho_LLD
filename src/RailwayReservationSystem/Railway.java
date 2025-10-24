package RailwayReservationSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Railway {
    static Scanner sc = new Scanner(System.in);
    static Map<String, Coach> coaches = new HashMap<>();

    static {
        coaches.put("AC", new Coach("AC"));
        coaches.put("NON-AC", new Coach("NON-AC"));
        coaches.put("SEATER", new Coach("SEATER"));
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== 🚆 RAILWAY RESERVATION SYSTEM ===");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Availability");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Prepare Chart");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> bookTicket();
                case 2 -> checkAvailability();
                case 3 -> cancelTicket();
                case 4 -> prepareChart();
                case 5 -> {
                    System.out.println("👋 Exiting System. Thank you!");
                    return;
                }
                default -> System.out.println("❌ Invalid Choice!");
            }
        }
    }

    static void bookTicket() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Gender (M/F): ");
        String gender = sc.nextLine();
        System.out.print("Enter Coach Type (AC/NON-AC/SEATER): ");
        String coachType = sc.nextLine().toUpperCase();

        if (coaches.containsKey(coachType)) {
            coaches.get(coachType).bookTicket(name, age, gender);
        } else {
            System.out.println("❌ Invalid Coach Type!");
        }
    }

    static void checkAvailability() {
        for (Coach c : coaches.values()) c.showAvailability();
    }

    static void cancelTicket() {
        System.out.print("Enter Passenger ID to Cancel: ");
        int id = sc.nextInt();
        for (Coach c : coaches.values()) {
            c.cancelTicket(id);
        }
    }

    static void prepareChart() {
        for (Coach c : coaches.values()) c.showChart();
}
}
