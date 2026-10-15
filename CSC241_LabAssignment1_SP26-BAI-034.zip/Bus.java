public class Bus{

    private static final int SEATS_PER_ROW = 4;
    private String busNumber;
    private Seat[][] seats;

    public Bus() {
        this("BUS-DEFAULT", 2);
    }

    public Bus(String busNumber, int rows) {
        if (rows < 1) {
            System.out.println("A bus must have at least 1 row,got" + rows);
        }
        this.busNumber = busNumber;
        this.seats = new Seat[rows][SEATS_PER_ROW];

        int nextSeatNumber = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < SEATS_PER_ROW; j++) {
                seats[i][j] = new Seat(nextSeatNumber);
                nextSeatNumber++;
            }
        }
    }

    public void displaySeats() {
        for (int i = 0; i < seats.length; i++) {
            StringBuilder line = new StringBuilder();
            line.append("Row ").append(i + 1).append(": ");
            for (int j = 0; j < SEATS_PER_ROW; j++) {
                if (j == 2) {
                    line.append("|| ");
                }
                line.append(formatSeat(seats[i][j]));
                if (j != SEATS_PER_ROW - 1) {
                    line.append(" ");
                }
            }
            System.out.println(line);
        }
    }

    private String formatSeat(Seat seat) {
        String status = seat.isReserved() ? "X" : "O";
        return String.format("%02d:%s", seat.getSeatNumber(), status);
    }

    public void reserveSeat(int seatNumber) {
        Seat seat = findSeat(seatNumber);
        if (seat == null) {
            System.out.println("Reserving Seat " + seatNumber + ": Seat does not exist.");
        } else if (seat.reserve()) {
            System.out.println("Reserving Seat " + seatNumber + ": Successfully Added.");
        } else {
            System.out.println("Reserving Seat " + seatNumber + ": Already Reserved.");
        }
    }

    private Seat findSeat(int seatNumber) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < SEATS_PER_ROW; j++) {
                if (seats[i][j].getSeatNumber() == seatNumber) {
                    return seats[i][j];
                }
            }
        }
        return null;
    }

    public int countAvailableSeats() {
        int available = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < SEATS_PER_ROW; j++) {
                if (!seats[i][j].isReserved()) {
                    available++;
                }
            }
        }
        return available;
    }
}