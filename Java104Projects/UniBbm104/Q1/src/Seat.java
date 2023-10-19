public class Seat {
    /*
    Has three attributes:
    SeatID,
    status: true, if the seat is empty,
    Passenger,
     */

    private int seatID;
    private boolean status;
    private Passenger passenger;

    Seat(int seatID, boolean status) {
        setSeatID(seatID);
        setStatus(status);
    }

    void display() {
        String statusName;
        if (status) {
            statusName = "Available";
        } else {
            statusName = "Reserved";
        }
        System.out.println(String.format("Seat: %d Status: %s", seatID, statusName));
    }

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
