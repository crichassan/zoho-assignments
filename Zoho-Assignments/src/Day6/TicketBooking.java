/*Design a travel booking system using two packages:
 travel.booking – includes a class Ticket with ticket ID, destination, and fare.
 travel.user – includes a class User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class.*/
package Day6;

import Day6.User;

public class TicketBooking {
    public static void main(String[] args) {
        User user = new User();

        user.bookTicket();
    }
}
