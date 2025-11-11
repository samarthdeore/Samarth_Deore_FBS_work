import java.util.*;

class Employee {
	int empId;
	String name;
	double basicSalary;
	static double companyBonusRate;

	static {
		companyBonusRate = 10; 
	}

	Employee() {
		this.empId = 1001;
		this.name = "Aditya";
		this.basicSalary = 20000;
	}

	Employee(int id, String n, double salary) {
		this.empId = id;
		this.name = n;
		this.basicSalary = salary;
	}

	void setEmpId(int id) {
		this.empId = id;
	}

	void setName(String n) {
		this.name = n;
	}

	void setBasicSalary(double s) {
		this.basicSalary = s;
	}

	static void setCompanyBonusRate(double rate) {
		companyBonusRate = rate;
	}

	int getEmpId() {
		return this.empId;
	}

	String getName() {
		return this.name;
	}

	double getBasicSalary() {
		return this.basicSalary;
	}

	double getCompanyBonusRate() {
		return this.companyBonusRate;
	}

	double calculateTotalSalary() {
		return this.basicSalary + (this.basicSalary * companyBonusRate / 100);
	}

	void display() {
		System.out.println("\nEmployee ID: " + this.empId);
		System.out.println("Employee Name: " + this.name);
		System.out.println("Basic Salary: " + this.basicSalary);
		System.out.println("Company Bonus Rate: " + companyBonusRate + "%");
		System.out.println("Total Salary: " + calculateTotalSalary());
	}
} 
//class Employee ends here


class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Annasaheb", 30000);
		e1.display();

		Employee e2 = new Employee(102, "Ganpatrao", 45000);
		e2.display();

		Employee e3 = new Employee(103, "Sudhakar", 25000);
		e3.display();

		Employee e4 = new Employee();
		e4.display();

		Employee.setCompanyBonusRate(12.5);
		System.out.println("");
		e1.display();
		e2.display();
		e3.display();
		e4.display();
	}
	//main ends here
}
//class TestEmployee ends here