package MovieReservationSystem;

public class Ticket {
    private int seat_Id;
    private String movieName;
    private boolean isAvailable;
    public Ticket(int seat_Id, String movieName, boolean isAvailable) {
        this.seat_Id = seat_Id;
        this.movieName = movieName;
        this.isAvailable = isAvailable;
    }
    public void setSeat_Id() {
        this.seat_Id = seat_Id;
    }
    public int getSeat_Id() {
        return seat_Id;
    }
    public void setMovieName() {
        this.movieName = movieName;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setAvailable() {
        this.isAvailable = isAvailable;
    }
    public boolean isAvailable() {
        return isAvailable;
    }


}
