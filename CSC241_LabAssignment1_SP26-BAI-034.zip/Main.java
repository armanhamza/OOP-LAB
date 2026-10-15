public class Main{

    public static void main(String[] args) {

        Bus bus = new Bus("MAH-1609", 3);
	System.out.println();
        System.out.println("Bus Number: MAH-1609");
	System.out.println();
        System.out.println("Initial Seating Arrangement:");
        bus.displaySeats();

        System.out.println("Available Seats: " + bus.countAvailableSeats());
	System.out.println();

        bus.reserveSeat(8);
        bus.reserveSeat(3);
        bus.reserveSeat(8);
        bus.reserveSeat(10);

	System.out.println();
        System.out.println("Updated Seating Arrangement:");

        bus.displaySeats();

        System.out.println("Available Seats: " + bus.countAvailableSeats());

        Bus defaultBus = new Bus();

	System.out.println();
        System.out.println("Default Bus:");
        defaultBus.displaySeats();

        System.out.println("Available Seats: " + defaultBus.countAvailableSeats());
    }
}