public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("MAH-169", 3);

        System.out.println("Bus Number: MAH-169");
	System.out.println();
        System.out.println("Initial Seating Arrangement:");
        bus.displaySeats();

	System.out.println();
        System.out.println("Available Seats: " + bus.countAvailableSeats());

        bus.reserveSeat(5);
        bus.reserveSeat(9);
        bus.reserveSeat(12);
        bus.reserveSeat(5);

	System.out.println();
        System.out.println("Updated Seating Arrangement:");
        bus.displaySeats();

	System.out.println();
        System.out.println("Available Seats: " + bus.countAvailableSeats());

    }
}
