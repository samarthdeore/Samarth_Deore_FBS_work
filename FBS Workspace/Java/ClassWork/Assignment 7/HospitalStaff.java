import java.time.LocalDate;

abstract class HospitalStaff {
	String staffName;
	String staffID;
	String department;
	String position;
	int age;
	double salary;
	boolean isFullTime;
	LocalDate joiningDate;

	HospitalStaff() {

		this.staffName = "not given";
		this.staffID = "not given";
		this.department = "not given";
		this.position = "not given";
		this.age = 0;
		this.salary = 0;
		this.isFullTime = false;
		this.joiningDate = LocalDate.now();
	}

	HospitalStaff(String staffName, String staffID, String department, String position, int age, double salary,
			boolean isFullTime, LocalDate joiningDate) {

		this.staffName = staffName;
		this.staffID = staffID;
		this.department = department;
		this.position = position;
		this.age = age;
		this.salary = salary;
		this.isFullTime = isFullTime;
		this.joiningDate = joiningDate;
	}

	String getStaffName() {
		return staffName;
	}

	void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	String getStaffID() {
		return staffID;
	}

	void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	String getDepartment() {
		return department;
	}

	void setDepartment(String department) {
		this.department = department;
	}

	String getPosition() {
		return position;
	}

	void setPosition(String position) {
		this.position = position;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	boolean isFullTime() {
		return isFullTime;
	}

	void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}

	LocalDate getJoiningDate() {
		return joiningDate;
	}

	void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	void display() {
		System.out.println("\n--- Hospital Staff Details ---");
		System.out.println("Staff Name: " + this.staffName);
		System.out.println("Staff ID: " + this.staffID);
		System.out.println("Department: " + this.department);
		System.out.println("Position: " + this.position);
		System.out.println("Age: " + this.age);
		System.out.println("Salary: " + this.salary);
		System.out.println("Full Time: " + this.isFullTime);
		System.out.println("Joining Date: " + this.joiningDate);
	}
	abstract void treat(String patientName) ;
	public String toString() {
	    return "\n--- Hospital Staff Details ---" +
	           "\nStaff Name: " + this.staffName +
	           "\nStaff ID: " + this.staffID +
	           "\nDepartment: " + this.department +
	           "\nPosition: " + this.position +
	           "\nAge: " + this.age +
	           "\nSalary: " + this.salary +
	           "\nFull Time: " + this.isFullTime +
	           "\nJoining Date: " + this.joiningDate;
	}
}

//class hospitalstaff ends here

class Nurse extends HospitalStaff {
	int noOfPatientsAssigned;
	boolean isShifted;
	String shiftTiming;
	int yearsOfExperience;
	boolean isCertified;

	Nurse() {
		super();
		this.noOfPatientsAssigned = 0;
		this.isShifted = false;
		this.shiftTiming = "not assigned";
		this.yearsOfExperience = 0;
		this.isCertified = false;
	}

	Nurse(String staffName, String staffID, String department, String position, int age, double salary,
			boolean isFullTime, LocalDate joiningDate, int noOfPatientsAssigned, boolean isShifted, String shiftTiming,
			int yearsOfExperience, boolean isCertified) {
		super(staffName, staffID, department, position, age, salary, isFullTime, joiningDate);
		this.noOfPatientsAssigned = noOfPatientsAssigned;
		this.isShifted = isShifted;
		this.shiftTiming = shiftTiming;
		this.yearsOfExperience = yearsOfExperience;
		this.isCertified = isCertified;
	}

	int getNoOfPatientsAssigned() {
		return noOfPatientsAssigned;
	}

	void setNoOfPatientsAssigned(int noOfPatientsAssigned) {
		this.noOfPatientsAssigned = noOfPatientsAssigned;
	}

	boolean isShifted() {
		return isShifted;
	}

	void setShifted(boolean isShifted) {
		this.isShifted = isShifted;
	}

	String getShiftTiming() {
		return shiftTiming;
	}

	void setShiftTiming(String shiftTiming) {
		this.shiftTiming = shiftTiming;
	}

	int getYearsOfExperience() {
		return yearsOfExperience;
	}

	void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	boolean isCertified() {
		return isCertified;
	}

	void setCertified(boolean isCertified) {
		this.isCertified = isCertified;
	}

	void display() {
		super.display();
		System.out.println("\n--- Nurse Specific Details ---");
		System.out.println("Number of Patients Assigned: " + this.noOfPatientsAssigned);
		System.out.println("Is Shifted: " + this.isShifted);
		System.out.println("Shift Timing: " + this.shiftTiming);
		System.out.println("Years of Experience: " + this.yearsOfExperience);
		System.out.println("Is Certified: " + this.isCertified);
	}
	void treat(String patientName) {
	    System.out.println("Nurse " + this.staffName + " is assisting patient: " + patientName);
	}
	public String toString() {
	    return super.toString() +
	           "\n--- Nurse Specific Details ---" +
	           "\nNumber of Patients Assigned: " + this.noOfPatientsAssigned +
	           "\nIs Shifted: " + this.isShifted +
	           "\nShift Timing: " + this.shiftTiming +
	           "\nYears of Experience: " + this.yearsOfExperience +
	           "\nIs Certified: " + this.isCertified;
	}
}

//class nurse ends here

class Receptionist extends HospitalStaff {
	int noOfCallsHandled;
	int noOfAppointmentsScheduled;
	boolean isOnFrontDesk;
	boolean isTrained;
	String shiftTiming;

	Receptionist() {
		super();
		this.noOfCallsHandled = 0;
		this.noOfAppointmentsScheduled = 0;
		this.isOnFrontDesk = false;
		this.isTrained = false;
		this.shiftTiming = "not assigned";
	}

	Receptionist(String staffName, String staffID, String department, String position, int age, double salary,
			boolean isFullTime, LocalDate joiningDate, int noOfCallsHandled, int noOfAppointmentsScheduled,
			boolean isOnFrontDesk, boolean isTrained, String shiftTiming) {
		super(staffName, staffID, department, position, age, salary, isFullTime, joiningDate);
		this.noOfCallsHandled = noOfCallsHandled;
		this.noOfAppointmentsScheduled = noOfAppointmentsScheduled;
		this.isOnFrontDesk = isOnFrontDesk;
		this.isTrained = isTrained;
		this.shiftTiming = shiftTiming;
	}

	int getNoOfCallsHandled() {
		return noOfCallsHandled;
	}

	void setNoOfCallsHandled(int noOfCallsHandled) {
		this.noOfCallsHandled = noOfCallsHandled;
	}

	int getNoOfAppointmentsScheduled() {
		return noOfAppointmentsScheduled;
	}

	void setNoOfAppointmentsScheduled(int noOfAppointmentsScheduled) {
		this.noOfAppointmentsScheduled = noOfAppointmentsScheduled;
	}

	boolean isOnFrontDesk() {
		return isOnFrontDesk;
	}

	void setOnFrontDesk(boolean isOnFrontDesk) {
		this.isOnFrontDesk = isOnFrontDesk;
	}

	boolean isTrained() {
		return isTrained;
	}

	void setTrained(boolean isTrained) {
		this.isTrained = isTrained;
	}

	String getShiftTiming() {
		return shiftTiming;
	}

	void setShiftTiming(String shiftTiming) {
		this.shiftTiming = shiftTiming;
	}

	void display() {
		super.display();
		System.out.println("\n--- Receptionist Specific Details ---");
		System.out.println("Number of Calls Handled: " + this.noOfCallsHandled);
		System.out.println("Number of Appointments Scheduled: " + this.noOfAppointmentsScheduled);
		System.out.println("Is On Front Desk: " + this.isOnFrontDesk);
		System.out.println("Is Trained: " + this.isTrained);
		System.out.println("Shift Timing: " + this.shiftTiming);
	}

	@Override
	void treat(String patientName) {
		// TODO Auto-generated method stub
		
	}
	public String toString() {
	    return super.toString() +
	           "\n--- Receptionist Specific Details ---" +
	           "\nNumber of Calls Handled: " + this.noOfCallsHandled +
	           "\nNumber of Appointments Scheduled: " + this.noOfAppointmentsScheduled +
	           "\nIs On Front Desk: " + this.isOnFrontDesk +
	           "\nIs Trained: " + this.isTrained +
	           "\nShift Timing: " + this.shiftTiming;
	}
}

//class receptionist ends here

class Technician extends HospitalStaff {
	String expertiseArea;
	int noOfMachinesHandled;
	boolean isCertified;
	int yearsOfExperience;
	boolean isOnDuty;

	Technician() {
		super();
		this.expertiseArea = "not given";
		this.noOfMachinesHandled = 0;
		this.isCertified = false;
		this.yearsOfExperience = 0;
		this.isOnDuty = false;
	}

	Technician(String staffName, String staffID, String department, String position, int age, double salary,
			boolean isFullTime, LocalDate joiningDate, String expertiseArea, int noOfMachinesHandled,
			boolean isCertified, int yearsOfExperience, boolean isOnDuty) {
		super(staffName, staffID, department, position, age, salary, isFullTime, joiningDate);
		this.expertiseArea = expertiseArea;
		this.noOfMachinesHandled = noOfMachinesHandled;
		this.isCertified = isCertified;
		this.yearsOfExperience = yearsOfExperience;
		this.isOnDuty = isOnDuty;
	}

	String getExpertiseArea() {
		return expertiseArea;
	}

	void setExpertiseArea(String expertiseArea) {
		this.expertiseArea = expertiseArea;
	}

	int getNoOfMachinesHandled() {
		return noOfMachinesHandled;
	}

	void setNoOfMachinesHandled(int noOfMachinesHandled) {
		this.noOfMachinesHandled = noOfMachinesHandled;
	}

	boolean isCertified() {
		return isCertified;
	}

	void setCertified(boolean isCertified) {
		this.isCertified = isCertified;
	}

	int getYearsOfExperience() {
		return yearsOfExperience;
	}

	void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	boolean isOnDuty() {
		return isOnDuty;
	}

	void setOnDuty(boolean isOnDuty) {
		this.isOnDuty = isOnDuty;
	}

	void display() {
		super.display();
		System.out.println("\n--- Technician Specific Details ---");
		System.out.println("Expertise Area: " + this.expertiseArea);
		System.out.println("Number of Machines Handled: " + this.noOfMachinesHandled);
		System.out.println("Is Certified: " + this.isCertified);
		System.out.println("Years of Experience: " + this.yearsOfExperience);
		System.out.println("Is On Duty: " + this.isOnDuty);
	}
	void treat(String patientName) {
	    System.out.println("Technician " + this.staffName + " is operating machines for patient: " + patientName);
	}
	public String toString() {
	    return super.toString() +
	           "\n--- Technician Specific Details ---" +
	           "\nExpertise Area: " + this.expertiseArea +
	           "\nNumber of Machines Handled: " + this.noOfMachinesHandled +
	           "\nIs Certified: " + this.isCertified +
	           "\nYears of Experience: " + this.yearsOfExperience +
	           "\nIs On Duty: " + this.isOnDuty;
	}
}

//class technician ends here

class Doctor extends HospitalStaff {
	String specialization;
	int yearsOfExperience;
	int patientsPerDay;
	boolean isOnDuty;
	boolean isSurgeon;

	Doctor() {
		super();
		this.specialization = "not given";
		this.yearsOfExperience = 0;
		this.patientsPerDay = 0;
		this.isOnDuty = false;
		this.isSurgeon = false;
	}

	Doctor(String staffName, String staffID, String department, String position, int age, double salary,
			boolean isFullTime, LocalDate joiningDate, String specialization, int yearsOfExperience, int patientsPerDay,
			boolean isOnDuty, boolean isSurgeon) {
		super(staffName, staffID, department, position, age, salary, isFullTime, joiningDate);
		this.specialization = specialization;
		this.yearsOfExperience = yearsOfExperience;
		this.patientsPerDay = patientsPerDay;
		this.isOnDuty = isOnDuty;
		this.isSurgeon = isSurgeon;
	}

	String getSpecialization() {
		return specialization;
	}

	void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	int getYearsOfExperience() {
		return yearsOfExperience;
	}

	void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	int getPatientsPerDay() {
		return patientsPerDay;
	}

	void setPatientsPerDay(int patientsPerDay) {
		this.patientsPerDay = patientsPerDay;
	}

	boolean isOnDuty() {
		return isOnDuty;
	}

	void setOnDuty(boolean isOnDuty) {
		this.isOnDuty = isOnDuty;
	}

	boolean isSurgeon() {
		return isSurgeon;
	}

	void setSurgeon(boolean isSurgeon) {
		this.isSurgeon = isSurgeon;
	}

	void display() {
		super.display();
		System.out.println("\n--- Doctor Specific Details ---");
		System.out.println("Specialization: " + this.specialization);
		System.out.println("Years of Experience: " + this.yearsOfExperience);
		System.out.println("Patients Per Day: " + this.patientsPerDay);
		System.out.println("Is On Duty: " + this.isOnDuty);
		System.out.println("Is Surgeon: " + this.isSurgeon);
	}

	void treat(String patientName) {
		if (this.isOnDuty) {
			System.out.println(
					"Dr. " + this.staffName + " (" + this.specialization + ") is treating patient: " + patientName);
		} else {
			System.out.println("Dr. " + this.staffName + " is not on duty right now.");
		}
	}
	public String toString() {
	    return super.toString() +
	           "\n--- Doctor Specific Details ---" +
	           "\nSpecialization: " + this.specialization +
	           "\nYears of Experience: " + this.yearsOfExperience +
	           "\nPatients Per Day: " + this.patientsPerDay +
	           "\nIs On Duty: " + this.isOnDuty +
	           "\nIs Surgeon: " + this.isSurgeon;
	}

}

//class doctor ends here

class TestHospitalStaff {
	public static void main(String[] args) {

//		HospitalStaff hs1 = new HospitalStaff();
//		HospitalStaff hs2 = new HospitalStaff("Alice Johnson", "HS101", "Administration", "Manager", 40, 5000, true,
//				LocalDate.of(2010, 6, 15));
//
//		hs1.display();
//		hs2.display();
//
//		Nurse n1 = new Nurse();
//		Nurse n2 = new Nurse("Mary Smith", "N202", "ICU", "Senior Nurse", 32, 3500, true, LocalDate.of(2015, 3, 10), 20,
//				true, "Morning", 10, true);
//
//		n1.display();
//		n2.display();
//
//		Receptionist r1 = new Receptionist();
//		Receptionist r2 = new Receptionist("John Doe", "R303", "Front Desk", "Receptionist", 28, 2500, true,
//				LocalDate.of(2018, 5, 20), 150, 50, true, true, "Evening");
//
//		r1.display();
//		r2.display();
//
//		Technician t1 = new Technician();
//		Technician t2 = new Technician("David Brown", "T404", "Lab", "Lab Technician", 35, 4000, true,
//				LocalDate.of(2012, 11, 5), "Radiology", 5, true, 12, true);
//
//		t1.display();
//		t2.display();
		HospitalStaff[] staffArray = new HospitalStaff[3];

		staffArray[0] = new Nurse("Mary Smith", "N202", "ICU", "Senior Nurse", 32, 3500, true,
		        LocalDate.of(2015, 3, 10), 20, true, "Morning", 10, true);

		staffArray[1] = new Doctor("Priya Mehta", "D505", "Cardiology", "Senior Consultant", 45, 8000, true,
		        LocalDate.of(2008, 4, 12), "Cardiologist", 18, 12, true, true);

		staffArray[2] = new Technician("David Brown", "T404", "Lab", "Lab Technician", 35, 4000, true,
		        LocalDate.of(2012, 11, 5), "Radiology", 5, true, 12, true);
		
		for(int i=0;i<staffArray.length;i++) {
			staffArray[i].treat("Ranjit");
		}
		System.out.println(staffArray[1]);
		System.out.println(staffArray[1].toString());

	}
}
