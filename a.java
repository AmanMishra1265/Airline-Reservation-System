import java.util.Scanner;
import java.util.ArrayList;

class Flight {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private boolean[] seats;

    public Flight(String flightNumber, String destination, String departureTime, int numberOfSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.seats = new boolean[numberOfSeats]; // all seats are initially unbooked
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public boolean isSeatAvailable(int seatNumber) {
        return !seats[seatNumber];
    }

    public void bookSeat(int seatNumber) {
        seats[seatNumber] = true;
    }

    public void displayFlightDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Available Seats: ");
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }
}

class AirlineReservationSystem {
    private ArrayList<Flight> flights;
    private Scanner scanner;

    public AirlineReservationSystem() {
        flights = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addFlight(String flightNumber, String destination, String departureTime, int numberOfSeats) {
        Flight flight = new Flight(flightNumber, destination, departureTime, numberOfSeats);
        flights.add(flight);
    }

    public void displayAvailableFlights() {
        if (flights.isEmpty()) {
            System.out.println("No flights available.");
            return;
        }
        for (Flight flight : flights) {
            flight.displayFlightDetails();
        }
    }

    public void bookSeat() {
        displayAvailableFlights();
        System.out.print("Enter flight number to book: ");
        String flightNumber = scanner.nextLine();
        Flight selectedFlight = null;
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                selectedFlight = flight;
                break;
            }
        }
        if (selectedFlight == null) {
            System.out.println("Flight not found!");
            return;
        }

        System.out.print("Enter seat number to book: ");
        int seatNumber = scanner.nextInt() - 1;  // Convert to 0-based index
        scanner.nextLine();  // Consume the newline character

        if (seatNumber < 0 || seatNumber >= selectedFlight.seats.length) {
            System.out.println("Invalid seat number!");
            return;
        }

        if (selectedFlight.isSeatAvailable(seatNumber)) {
            selectedFlight.bookSeat(seatNumber);
            System.out.println("Seat booked successfully!");
        } else {
            System.out.println("Seat is already booked.");
        }
    }

    public void run() {
        while (true) {
            System.out.println("\n--- Airline Reservation System ---");
            System.out.println("1. Display available flights");
            System.out.println("2. Book a seat");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    displayAvailableFlights();
                    break;
                case 2:
                    bookSeat();
                    break;
                case 3:
                    System.out.println("Thank you for using the Airline Reservation System!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AirlineReservationSystem system = new AirlineReservationSystem();

        // Adding some example flights
        system.addFlight("AI101", "New York", "2024-12-10 10:00", 10);
        system.addFlight("AI102", "London", "2024-12-11 14:00", 5);
        system.addFlight("AI103", "Tokyo", "2024-12-12 18:00", 8);

        system.run();
    }
}
