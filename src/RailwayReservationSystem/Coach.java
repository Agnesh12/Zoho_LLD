package RailwayReservationSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Coach {
    String coachType;
    List<Passenger> confirmed = new ArrayList<>();
    Queue<Passenger> waiting = new LinkedList<>(); //waiting one by one
    final int max_confirmed = 3;
    final int wait_confirmed = 2;

    Coach(String coachType) {
        this.coachType = coachType;
    }

    void bookTicket(String name, int age, String gender) {
        if (confirmed.size() < max_confirmed) {
            Passenger p = new Passenger(name, age, gender, coachType, "Confirmed");
            confirmed.add(p);
            System.out.println("Ticket Booked SuccessFully");
        } else if (waiting.size() < wait_confirmed) {
            Passenger p = new Passenger(name, age, gender, coachType, "Confirmed");
            waiting.add(p);
            System.out.println("Ticked Booked SuccessFully (waiting)");
        } else {
            System.out.println("Sorry No Seat Available" + coachType);
        }
    }

    void cancelTicket(int id) {
        boolean found = false;
        Iterator<Passenger> it = confirmed.iterator();
        while (it.hasNext()) {
            Passenger p = it.next();
            if (p.id == id) {
                it.remove();
                System.out.println("Ticket Canceled.....!");
                found = true;
                if (!waiting.isEmpty()) {
                    Passenger promoted = waiting.poll();
                    promoted.status = "Confirmed";
                    confirmed.add(promoted);
                    System.out.println("Waiting promoted into confirmed...!" + promoted.name);
                }
                break;
            }
        }
        if (!found) {
            Iterator<Passenger> it2 = waiting.iterator();
            while (it2.hasNext()) {
                Passenger p = it2.next();
                if (p.id == id) {
                    it2.remove();
                    System.out.println("Waiting Ticket Canceled.....!" + p.id);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Passenger Id Not Found!");
        }
    }
    void showAvailability(){
        System.out.println(coachType + "-Available: " + (max_confirmed-confirmed.size())+ "| waiting " +(wait_confirmed-waiting.size()));
    }
    void showChart() {
        System.out.println("\n==============  " + coachType + " COACH CHART ==============");
        System.out.printf("%-5s %-10s %-3s %-6s %-10s %-10s%n",
                "ID", "Name", "Age", "Gender", "Coach", "Status");
        for (Passenger p : confirmed) System.out.println(p);
        for (Passenger p : waiting) System.out.println(p);
    }
}

