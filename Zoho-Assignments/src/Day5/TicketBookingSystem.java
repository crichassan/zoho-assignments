package Day5;

import java.util.Scanner;

//Base class or Interface (could also be abstract class)
abstract class Ticket {
 protected String source;
 protected String destination;

 public void inputRoute(Scanner scanner) {
     System.out.print("Enter Source: ");
     source = scanner.nextLine();
     System.out.print("Enter Destination: ");
     destination = scanner.nextLine();
 }

 // Common method to be implemented differently
 public abstract void bookTicket();
}

//Subclass: Bus Ticket
class BusTicket extends Ticket {
 private int seatNumber;

 public void inputDetails(Scanner scanner) {
     inputRoute(scanner);
     System.out.print("Enter Seat Number: ");
     seatNumber = Integer.parseInt(scanner.nextLine());
 }

 @Override
 public void bookTicket() {
     System.out.println("\n Bus Ticket Booked");
     System.out.println("From: " + source);
     System.out.println("To: " + destination);
     System.out.println("Seat Number: " + seatNumber);
 }
}

//Subclass: Train Ticket
class TrainTicket extends Ticket {
 private String coachClass;

 public void inputDetails(Scanner scanner) {
     inputRoute(scanner);
     System.out.print("Enter Coach Class (e.g., AC1, Sleeper): ");
     coachClass = scanner.nextLine();
 }

 @Override
 public void bookTicket() {
     System.out.println("\n Train Ticket Booked");
     System.out.println("From: " + source);
     System.out.println("To: " + destination);
     System.out.println("Coach Class: " + coachClass);
 }
}

//Subclass: Flight Ticket
class FlightTicket extends Ticket {
 private String airline;
 private String seatClass;

 public void inputDetails(Scanner scanner) {
     inputRoute(scanner);
     System.out.print("Enter Airline: ");
     airline = scanner.nextLine();
     System.out.print("Enter Seat Class (Economy/Business): ");
     seatClass = scanner.nextLine();
 }

 @Override
 public void bookTicket() {
     System.out.println("\n Flight Ticket Booked");
     System.out.println("Airline: " + airline);
     System.out.println("From: " + source);
     System.out.println("To: " + destination);
     System.out.println("Seat Class: " + seatClass);
 }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = null;

        System.out.println("==== Ticket Booking System ====");
        System.out.print("Choose transport (Bus / Train / Flight): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        switch (choice) {
            case "bus":
                ticket = new BusTicket();
                ((BusTicket) ticket).inputDetails(scanner);
                break;

            case "train":
                ticket = new TrainTicket();
                ((TrainTicket) ticket).inputDetails(scanner);
                break;

            case "flight":
                ticket = new FlightTicket();
                ((FlightTicket) ticket).inputDetails(scanner);
                break;

            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        // Demonstrating Polymorphism
        ticket.bookTicket();

        scanner.close();
    }
}
