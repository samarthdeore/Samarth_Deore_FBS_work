package Assignment3;

import java.util.Scanner;

abstract class ElectricityBill {

	int units;
	String customerName;

	ElectricityBill() {
		customerName = "not given";
		units = 0;
	}

	ElectricityBill(String customerName, int units) {
		this.customerName = customerName;
		this.units = units;
	}

	void showUsage() {
		System.out.println("\nCustomer Name : " + customerName);
		System.out.println("Units Consumed: " + units);
	}

	abstract double calculateBill();

	final void generateBill() {
		showUsage();

		double baseAmount = calculateBill();
		double tax = baseAmount * 0.05;
		double fixedCharge = 50;
		double finalBill = baseAmount + tax + fixedCharge;

		System.out.println("Base Bill     : Rs. " + baseAmount);
		System.out.println("5% Tax        : Rs. " + tax);
		System.out.println("Fixed Charge  : Rs. " + fixedCharge);
		System.out.println("---------------------------------");
		System.out.println("FINAL BILL    : Rs. " + finalBill);
	}

	public String toString() {
		return "\nElectricity Bill Details:\nCustomer Name : " + customerName + "\nUnits         : " + units + "\n";
	}
}
// class ElectricityBill ends here

class ResidentialBill extends ElectricityBill {

	ResidentialBill() {
		super();
	}

	ResidentialBill(String customerName, int units) {
		super(customerName, units);
	}

	double calculateBill() {
		double amount = 0;

		if (units <= 100) {
			amount = units * 2.5;
		} else if (units <= 300) {
			amount = (100 * 2.5) + (units - 100) * 3.5;
		} else {
			amount = (100 * 2.5) + (200 * 3.5) + (units - 300) * 5;
		}

		if (units > 500) {
			amount += 150;
		}

		return amount;
	}

	public String toString() {
		return "\n--- Residential Bill Details ---\n" + super.toString();
	}
}
// class ResidentialBill ends here

class CommercialBill extends ElectricityBill {

	CommercialBill() {
		super();
	}

	CommercialBill(String customerName, int units) {
		super(customerName, units);
	}

	double calculateBill() {
		double amount = units * 6.5;

		if (units < 200) {
			amount = 1500;
		}

		if (units > 1000) {
			double extra = amount * 0.08;
			amount += extra;
		}

		return amount;
	}

	public String toString() {
		return "\n--- Commercial Bill Details ---\n" + super.toString();
	}
}
// class CommercialBill ends here

class TestElectricityBill {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Electricity Bill Calculator\n");

		System.out.print("Enter Customer Name : ");
		String name = sc.nextLine();

		System.out.print("Enter Units Consumed: ");
		int units = sc.nextInt();

		System.out.println("Select Type (1 = Residential, 2 = Commercial)");
		int type = sc.nextInt();

		ElectricityBill bill;

		if (type == 1) {
			bill = new ResidentialBill(name, units);
		} else if (type == 2) {
			bill = new CommercialBill(name, units);
		} else {
			System.out.println("Invalid choice!");
			return;
		}

		System.out.println(bill);
		bill.generateBill();
	}
}
// class TestElectricityBill ends here
