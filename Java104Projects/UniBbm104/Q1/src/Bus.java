public class Bus {
    /*
    Has three attributes:
    plate,
    seatCount,
    seats: a list contains seats
     */

    private String plate;
    private int seatCount;
    private Seat[] seats;

    Bus(String plate, int seatCount) {
        setPlate(plate);
        setSeatCount(seatCount);
        setSeats(new Seat[42]);
        for (int i = 0; i < seatCount; i++) {
            seats[i] = new Seat(i + 1, true);
            // Creating empty seats
        }
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public Seat[] getSeats() {
        return seats;
    }

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }
}
