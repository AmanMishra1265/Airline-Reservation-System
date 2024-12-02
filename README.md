# Airline Reservation System

## Overview
The **Airline Reservation System** is a Java-based application that allows users to book and manage flight reservations. It includes features for flight scheduling, seat selection, and a user-friendly console interface. The system simulates a simple flight booking process, allowing users to view available flights and book seats.

## Features
- **Flight Scheduling**: Users can view the flight details such as flight number, destination, and departure time.
- **Seat Selection**: Users can check the availability of seats and select a seat for booking.
- **User-Friendly Console Interface**: The system provides a simple menu for users to interact with the application.

## Requirements
- Java 8 or higher
- IDE or text editor to run Java programs (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code)
- Basic understanding of Java and object-oriented programming concepts

## Installation Instructions
1. Clone the repository or download the source code.
2. Open the project in your preferred IDE or editor.
3. Compile and run the `Main.java` file.
4. The application will start in the console with a menu for interacting with the reservation system.

## How to Use
### Menu Options:
- **Display Available Flights**: Lists all the available flights with flight number, destination, departure time, and available seats.
- **Book a Seat**: Select a flight and a seat number to book a seat. If the seat is already taken, it will notify you.
- **Exit**: Close the application.

### Example Workflow:
1. Run the application.
2. Select option 1 to view the available flights.
3. Choose a flight and then select a seat to book.
4. The system will confirm the seat booking or notify you if the seat is already booked.
5. You can exit the application anytime by selecting option 3.

## Sample Output
```
--- Airline Reservation System ---
1. Display available flights
2. Book a seat
3. Exit
Choose an option: 1

Flight Number: AI101
Destination: New York
Departure Time: 2024-12-10 10:00
Available Seats: 1 2 3 4 5 6 7 8 9 10

Flight Number: AI102
Destination: London
Departure Time: 2024-12-11 14:00
Available Seats: 1 2 3 4 5

Flight Number: AI103
Destination: Tokyo
Departure Time: 2024-12-12 18:00
Available Seats: 1 2 3 4 5 6 7 8
```

---

```
Enter flight number to book: AI101
Enter seat number to book: 1
Seat booked successfully!
```

## Code Structure
- **Flight.java**: Contains the details of a flight (flight number, destination, departure time) and the seat availability.
- **AirlineReservationSystem.java**: Contains the logic for displaying flights, booking seats, and handling user input.
- **Main.java**: The entry point of the program, where the system is initialized and executed.

## Improvements & Future Enhancements
- **User Authentication**: Add user login and registration functionality for personalized bookings.
- **Database Integration**: Store flight and reservation data in a database (e.g., MySQL, SQLite).
- **Graphical User Interface (GUI)**: Implement a GUI using JavaFX or Swing for better user experience.
- **Advanced Features**: Include functionalities like different flight classes (Economy, Business) and payment processing.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements
- The flight reservation system is a simplified simulation and may not cover all real-world scenarios.
- Special thanks to the Java community for providing resources and support for learning and development.

---
