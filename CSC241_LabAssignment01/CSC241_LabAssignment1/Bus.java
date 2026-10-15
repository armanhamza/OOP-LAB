public class Bus {
    private String busNumber;
    private Seat[][] seats;

    public Bus() {
        this("DEFAULT", 2);
    }

    public Bus(String busNumber, int rows) {
        if (rows <= 0) {
            System.out.println("Number of rows must be greater than zero.");
        }
        this.busNumber = busNumber;
        this.seats = new Seat[rows][4];

        int seatNumber = 1;
        for (int row = 0; row < seats.length; row++) {
            for (int column = 0; column < seats[row].length; column++) {
                seats[row][column] = new Seat(seatNumber);
                seatNumber++;
            }
        }
    }

    public void displaySeats() {
        for (int row = 0; row < seats.length; row++) {
            System.out.println("Row " + (row + 1) + ": ");
            for (int column = 0; column < seats[row].length; column++) {
                Seat seat = seats[row][column];
                String status = seat.isReserved() ? "X" : "O";
                System.out.printf("%02d:%s", seat.getSeatNumber(), status);

                if (column == 1) {
                    System.out.print(" || ");
                } else if (column < seats[row].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void reserveSeat(int seatNumber) {
        Seat seat = findSeat(seatNumber);
        if (seat == null) {
            System.out.println("Reserving Seat " + seatNumber + ": Invalid Seat Number");
        } else if (seat.reserve()) {
            System.out.println("Reserving Seat " + seatNumber + ": Successful");
        } else {
            System.out.println("Reserving Seat " + seatNumber + ": Already Reserved");
        }
    }

    public int countAvailableSeats() {
        int available = 0;
        for (int row = 0; row < seats.length; row++) {
            for (int column = 0; column < seats[row].length; column++) {
                if (!seats[row][column].isReserved()) {
                    available++;
                }
            }
        }
        return available;
    }

    private Seat findSeat(int seatNumber) {
        for (int row = 0; row < seats.length; row++) {
            for (int column = 0; column < seats[row].length; column++) {
                if (seats[row][column].getSeatNumber() == seatNumber) {
                    return seats[row][column];
                }
            }
        }
        return null;
    }
}
