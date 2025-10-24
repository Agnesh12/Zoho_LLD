package RailwayReservationSystem;

class Passenger {
    static int idCounter = 1;
    int id;
    String name;
    int age;
    String gender;
    String coachType;
    String status;

    public Passenger(String name, int age, String gender, String coachType, String status) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.coachType = coachType;
        this.status = status;
    }

    // Corrected method name: toString() not tostring()
    @Override
    public String toString() {
        return String.format("%-5d %-10s %-3d %-6s %-10s %-10s",
                id, name, age, gender, coachType, status);
    }
}

