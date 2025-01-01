import java.util.Scanner;

public class TicketBookingSystem {

    static String[] events = {"Concert", "Movie", "Theater"};
    static int[] availableSeats = {50, 100, 30};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Ticket Booking System!");
        System.out.println("Available Events:");
        
        for (int i = 0; i < events.length; i++) {
            System.out.println((i + 1) + ". " + events[i] + " (Available seats: " + availableSeats[i] + ")");
        }

        System.out.print("Enter the number of the event you want to book a ticket for: ");
        int eventChoice = scanner.nextInt();

        if (eventChoice < 1 || eventChoice > events.length) {
            System.out.println("Invalid choice. Exiting system.");
            return;
        }

        int eventIndex = eventChoice - 1;

        System.out.println("You selected: " + events[eventIndex]);
        System.out.print("Enter the number of tickets you want to book: ");
        int ticketsToBook = scanner.nextInt();

        if (ticketsToBook <= 0 || ticketsToBook > availableSeats[eventIndex]) {
            System.out.println("Invalid number of tickets. Exiting system.");
        } else {
            availableSeats[eventIndex] -= ticketsToBook;
            System.out.println("Booking successful! You booked " + ticketsToBook + " ticket(s) for " + events[eventIndex] + ".");
            System.out.println("Remaining seats: " + availableSeats[eventIndex]);
        }

        scanner.close();
    }
}

