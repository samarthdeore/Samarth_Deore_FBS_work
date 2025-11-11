import java.util.*;

class ElectricityBill {
	int customerId;
	String customerName;
	double unitsConsumed;
	static double ratePerUnit;

	static {
		ratePerUnit =7.5; 
	}

	ElectricityBill() {
		this.customerId =1001;
		this.customerName="Swami";
		this.unitsConsumed=150;
	}

	ElectricityBill(int id, String name, double units) {
		this.customerId =id;
		this.customerName=name;
		this.unitsConsumed=units;
	}

	void setCustomerId(int id) {
		this.customerId = id;
	}

	void setCustomerName(String name) {
		this.customerName = name;
	}

	void setUnitsConsumed(double units) {
		this.unitsConsumed = units;
	}

	static void setRatePerUnit(double rate) {
		ratePerUnit = rate;
	}

	int getCustomerId() {
		return this.customerId;
	}

	String getCustomerName() {
		return this.customerName;
	}

	double getUnitsConsumed() {
		return this.unitsConsumed;
	}

	double getRatePerUnit() {
		return this.ratePerUnit;
	}

	double calculateBill() {
		return this.unitsConsumed * ratePerUnit;
	}

	void display() {
		System.out.println("\nCustomer ID: " + this.customerId);
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Units Consumed: " + this.unitsConsumed);
		System.out.println("Rate per Unit: " + ratePerUnit);
		System.out.println("Total Bill: " + calculateBill());
	}
} 
//class ElectricityBill ends here


class TestElectricityBill {

	public static void main(String[] args) {

		ElectricityBill e1 = new ElectricityBill(101, "Pratiksha", 250);
		e1.display();

		ElectricityBill e2 = new ElectricityBill(102, "Amit", 300);
		e2.display();

		ElectricityBill e3 = new ElectricityBill(103, "Gabbar", 100);
		e3.display();

		ElectricityBill e4 = new ElectricityBill();
		e4.display();

		ElectricityBill.setRatePerUnit(9.2);
		System.out.println("");
		e1.display();
		e2.display();
		e3.display();
		e4.display();
	}
	//main ends here
}
// class TestElectricityBill ends here