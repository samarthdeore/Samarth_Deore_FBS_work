package classwork;

import java.util.Scanner;

public class MovieTicket {
	String movieName;
	int noOfTickets;
	static int seats;
	static double ticketPrice;
	static {
		seats = 30;
		ticketPrice = 100;
	}

	MovieTicket(String movieName, int noOfTickets) {
		this.movieName = movieName;
		this.noOfTickets=noOfTickets;
	}

	String getMovieName() {
		return movieName;
	}

	void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	int getNoOfTickets() {
		return noOfTickets;
	}

	void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	static int getSeats() {
		return seats;
	}

	static void setSeats(int seats) {
		MovieTicket.seats = seats;
	}

	static double getTicketPrice() {
		return ticketPrice;
	}

	static void setTicketPrice(double ticketPrice) {
		MovieTicket.ticketPrice = ticketPrice;
	}

	void display() {
		System.out.println("Name of the Movie is:" + this.movieName);
		System.out.println("No of tickets are " + this.noOfTickets);
		System.out.println("Amount is " + ticketPrice * this.noOfTickets);
	}

	void bookTickets() throws InvalidTicketNumberException, TicketsSoldOutException {
        if (noOfTickets <= 0) {
            throw new InvalidTicketNumberException();
        }
        if (noOfTickets > seats) {
            throw new TicketsSoldOutException();
        }

        // Deduct seats
        seats -= noOfTickets;
    }
}

class TestMovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            while (MovieTicket.seats > 0) {
                System.out.println("Enter the number of tickets you want:");
                int not = sc.nextInt();

                MovieTicket a1 = new MovieTicket("Duniyadari", not);

                a1.bookTickets();
                a1.display();

                System.out.println("Remaining seats: " + MovieTicket.seats);
                System.out.println("---------------------------");
            }

            System.out.println("All tickets sold out!");

        } catch (InvalidTicketNumberException | TicketsSoldOutException e) {
            System.out.println(e);
        } 
    }
}

