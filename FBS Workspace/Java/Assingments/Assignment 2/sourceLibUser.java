import java.util.*;

class LibraryUser {
	int userId;
	String name;
	int daysLate;
	static double finePerDay;

	static {
		finePerDay = 2.5;
	}

	LibraryUser() {
		this.userId = 1001;
		this.name = "Baburao";
		this.daysLate = 0;
	}

	LibraryUser(int id, String n, int days) {
		this.userId = id;
		this.name = n;
		this.daysLate = days;
	}

	void setUserId(int id) {
		this.userId = id;
	}

	void setName(String n) {
		this.name = n;
	}

	void setDaysLate(int d) {
		this.daysLate = d;
	}

	static void setFinePerDay(double fine) {
		finePerDay = fine;
	}

	int getUserId() {
		return this.userId;
	}

	String getName() {
		return this.name;
	}

	int getDaysLate() {
		return this.daysLate;
	}

	double getFinePerDay() {
		return this.finePerDay;
	}

	double calculateFine() {
		return this.daysLate * finePerDay;
	}

	void display() {
		System.out.println("\nUser ID: " + this.userId);
		System.out.println("User Name: " + this.name);
		System.out.println("Days Late: " + this.daysLate);
		System.out.println("Fine Per Day: " + finePerDay);
		System.out.println("Total Fine: " + calculateFine());
	}
}
//class LibraryUser ends here


class TestLibraryUser{

	public static void main(String[] args) {

		LibraryUser u1 = new LibraryUser(101, "Annasaheb", 5);
		u1.display();

		LibraryUser u2 = new LibraryUser(102, "Ganpatrao", 10);
		u2.display();

		LibraryUser u3 = new LibraryUser(103, "Sudhakar", 2);
		u3.display();

		LibraryUser u4 = new LibraryUser();
		u4.display();

		LibraryUser.setFinePerDay(3);
		System.out.println("");
		u1.display();
		u2.display();
		u3.display();
		u4.display();
	}
	//main ends here
}
//class TestLibraryUser ends here
