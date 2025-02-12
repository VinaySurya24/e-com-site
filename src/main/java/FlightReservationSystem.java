import java.util.*;

public class FlightReservationSystem {
    // List to store available flights
    private static List<Flight> flights = new ArrayList<>();
    // List to store reservations
    private static List<Reservation> reservations = new ArrayList<>();
    // Scanner for user input
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Add some initial flights
        initializeFlights();

        while (true) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    displayAvailableFlights();
                    break;
                case 2:
                    makeReservation();
                    break;
                case 3:
                    viewReservations();
                    break;
                case 4:
                    System.out.println("Thank you for using Flight Reservation System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Initialize some sample flights
    private static void initializeFlights() {
        flights.add(new Flight(1, "Mumbai", "Delhi", 50, 2500.00));
        flights.add(new Flight(2, "Bangalore", "Chennai", 40, 1800.00));
        flights.add(new Flight(3, "Kolkata", "Hyderabad", 30, 2200.00));
    }

    // Display main menu
    private static void displayMenu() {
        System.out.println("\n--- Flight Reservation System ---");
        System.out.println("1. View Available Flights");
        System.out.println("2. Make a Reservation");
        System.out.println("3. View My Reservations");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Get user choice
    private static int getUserChoice() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Clear the invalid input
            return -1;
        }
    }

    // Display available flights
    private static void displayAvailableFlights() {
        System.out.println("\n--- Available Flights ---");
        for (Flight flight : flights) {
            System.out.printf("Flight %d: %s to %s | Seats: %d | Price: ₹%.2f%n", 
                flight.getId(), flight.getOrigin(), flight.getDestination(), 
                flight.getAvailableSeats(), flight.getPrice());
        }
    }

    // Make a reservation
    private static void makeReservation() {
        displayAvailableFlights();
        
        System.out.print("\nEnter Flight ID to book: ");
        int flightId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Flight selectedFlight = findFlightById(flightId);
        if (selectedFlight == null) {
            System.out.println("Invalid Flight ID!");
            return;
        }

        if (selectedFlight.getAvailableSeats() <= 0) {
            System.out.println("Sorry, no seats available on this flight!");
            return;
        }

        System.out.print("Enter Passenger Name: ");
        String passengerName = scanner.nextLine();

        // Create reservation
        Reservation reservation = new Reservation(
            reservations.size() + 1, 
            selectedFlight, 
            passengerName
        );

        // Update flight seats
        selectedFlight.setAvailableSeats(selectedFlight.getAvailableSeats() - 1);

        // Add reservation
        reservations.add(reservation);

        System.out.println("Reservation Successful!");
        System.out.printf("Reservation ID: %d | Flight: %s to %s | Passenger: %s%n", 
            reservation.getId(), 
            selectedFlight.getOrigin(), 
            selectedFlight.getDestination(), 
            passengerName
        );
    }

    // View reservations
    private static void viewReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
            return;
        }

        System.out.println("\n--- My Reservations ---");
        for (Reservation reservation : reservations) {
            System.out.printf("Reservation ID: %d | Flight: %s to %s | Passenger: %s%n", 
                reservation.getId(), 
                reservation.getFlight().getOrigin(), 
                reservation.getFlight().getDestination(), 
                reservation.getPassengerName()
            );
        }
    }

    // Find flight by ID
    private static Flight findFlightById(int id) {
        for (Flight flight : flights) {
            if (flight.getId() == id) {
                return flight;
            }
        }
        return null;
    }

    // Flight class
    static class Flight {
        private int id;
        private String origin;
        private String destination;
        private int availableSeats;
        private double price;

        public Flight(int id, String origin, String destination, int availableSeats, double price) {
            this.id = id;
            this.origin = origin;
            this.destination = destination;
            this.availableSeats = availableSeats;
            this.price = price;
        }

        // Getters and Setters
        public int getId() { return id; }
        public String getOrigin() { return origin; }
        public String getDestination() { return destination; }
        public int getAvailableSeats() { return availableSeats; }
        public void setAvailableSeats(int availableSeats) { this.availableSeats = availableSeats; }
        public double getPrice() { return price; }
    }

    // Reservation class
    static class Reservation {
        private int id;
        private Flight flight;
        private String passengerName;

        public Reservation(int id, Flight flight, String passengerName) {
            this.id = id;
            this.flight = flight;
            this.passengerName = passengerName;
        }

        // Getters
        public int getId() { return id; }
        public Flight getFlight() { return flight; }
        public String getPassengerName() { return passengerName; }
    }
}
