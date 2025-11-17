package Assignment3;

import java.util.Scanner;

abstract class InsurancePolicy {

	String policyHolderName;
	double basePremium;

	InsurancePolicy() {
		policyHolderName = "Not given";
		basePremium = 0;
	}

	InsurancePolicy(String policyHolderName, double basePremium) {
		this.policyHolderName = policyHolderName;
		this.basePremium = basePremium;
	}

	abstract double calculatePremium();

	void printPolicyDetails() {
		System.out.println("\nPolicy Holder Name : " + policyHolderName);
		System.out.println("Base Premium       : Rs. " + basePremium);
		double finalPremium = calculatePremium();
		System.out.println("Final Premium      : Rs. " + finalPremium);
	}

	public String toString() {
		return "\nInsurance Policy Details:\nPolicy Holder : " + policyHolderName + "\nBase Premium  : Rs. "
				+ basePremium + "\n";
	}
}
// class InsurancePolicy ends here

class CarInsurance extends InsurancePolicy {

	int carAgeInYears;
	boolean hadAccidentInLastYear;
	double carValue;

	CarInsurance() {
		super();
		carAgeInYears = 0;
		hadAccidentInLastYear = false;
		carValue = 0;
	}

	CarInsurance(String name, double base, int age, boolean accident, double value) {
		super(name, base);
		carAgeInYears = age;
		hadAccidentInLastYear = accident;
		carValue = value;
	}

	double calculatePremium() {
		double premium = basePremium;

		if (carAgeInYears <= 3) {
			premium += basePremium * 0.10;
		} else if (carAgeInYears <= 7) {
			premium += basePremium * 0.20;
		} else {
			premium += basePremium * 0.30;
		}

		if (hadAccidentInLastYear) {
			premium += basePremium * 0.25;
		} else {
			premium -= basePremium * 0.10;
		}

		if (carValue > 1000000) {
			premium += 2000;
		}

		return premium;
	}

	public String toString() {
		return "\n--- Car Insurance Details ---\n" + super.toString() + "Car Age          : " + carAgeInYears + "\n"
				+ "Had Accident     : " + hadAccidentInLastYear + "\n" + "Car Value        : Rs. " + carValue + "\n";
	}
}
// class CarInsurance ends here

class HealthInsurance extends InsurancePolicy {

	int age;
	boolean isSmoker;
	boolean hasPreExistingDisease;

	HealthInsurance() {
		super();
		age = 0;
		isSmoker = false;
		hasPreExistingDisease = false;
	}

	HealthInsurance(String name, double base, int age, boolean smoker, boolean disease) {
		super(name, base);
		this.age = age;
		this.isSmoker = smoker;
		this.hasPreExistingDisease = disease;
	}

	double calculatePremium() {
		double premium = basePremium;

		if (age < 30) {
			premium += basePremium * 0.10;
		} else if (age <= 45) {
			premium += basePremium * 0.25;
		} else {
			premium += basePremium * 0.40;
		}

		if (isSmoker) {
			premium += basePremium * 0.30;
		} else {
			premium -= basePremium * 0.05;
		}

		if (hasPreExistingDisease) {
			premium += basePremium * 0.20;
		}

		return premium;
	}

	public String toString() {
		return "\n--- Health Insurance Details ---\n" + super.toString() + "Age                  : " + age + "\n"
				+ "Smoker               : " + isSmoker + "\n" + "Pre-existing Disease : " + hasPreExistingDisease
				+ "\n";
	}
}
// class HealthInsurance ends here

class TestInsurancePolicy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insurance Premium Calculator\n");
		System.out.println("Select Policy Type: ");
		System.out.println("1. Car Insurance");
		System.out.println("2. Health Insurance");
		int choice = sc.nextInt();
		sc.nextLine(); // consume newline

		if (choice == 1) {
			System.out.print("Enter Policy Holder Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Base Premium: ");
			double base = sc.nextDouble();
			System.out.print("Enter Car Age in Years: ");
			int age = sc.nextInt();
			System.out.print("Had Accident Last Year (true/false): ");
			boolean accident = sc.nextBoolean();
			System.out.print("Enter Car Value in Rs.: ");
			double value = sc.nextDouble();

			CarInsurance carPolicy = new CarInsurance(name, base, age, accident, value);
			System.out.println(carPolicy);
			carPolicy.printPolicyDetails();

		} else if (choice == 2) {
			System.out.print("Enter Policy Holder Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Base Premium: ");
			double base = sc.nextDouble();
			System.out.print("Enter Age: ");
			int age = sc.nextInt();
			System.out.print("Is Smoker (true/false): ");
			boolean smoker = sc.nextBoolean();
			System.out.print("Has Pre-existing Disease (true/false): ");
			boolean disease = sc.nextBoolean();

			HealthInsurance healthPolicy = new HealthInsurance(name, base, age, smoker, disease);
			System.out.println(healthPolicy);
			healthPolicy.printPolicyDetails();

		} else {
			System.out.println("Invalid choice!");
		}

		sc.close();
	}
}
// class TestInsurancePolicy ends here
