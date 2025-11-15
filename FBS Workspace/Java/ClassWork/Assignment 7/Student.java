abstract class Student {
	int fbId;
	String name;
	int distance;
	static int count = 0;

	Student() {
		System.out.println("Student default constructor");
		fbId = 100;
		name = "not given";
		distance = 10;
		count++;

	}// default constructor

	Student(int fbId, String name, int distance) {
		System.out.println("Student parameterized constructor");
		this.fbId = fbId;
		this.name = name;
		this.distance = distance;
		count++;
	}// parameterized constructor

	int getFbId() {
		return fbId;
	}

	void setFbId(int fbId) {
		this.fbId = fbId;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getDistance() {
		return distance;
	}

	void setDistance(int distance) {
		this.distance = distance;
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Student.count = count;
	}

	void display() {

		System.out.println("Firstbit id is : " + this.fbId);
		System.out.println(" Name is : " + this.name);
		System.out.println("Distance travelled : " + this.distance);
	}
	abstract void work();
	
	public String toString() {
	    return "Firstbit ID: " + this.fbId +
	           "\nName: " + this.name +
	           "\nDistance: " + this.distance;
	}


}// class student ends here

class PlacedStudent extends Student // step 1 "is-a"
{
	// step 2 remove state and behavior which is available in super class
	String compnyName;
	String designation;

	PlacedStudent() {
		super();// step 3 a
		compnyName = "Xyz";
		designation = "Pqr";
		System.out.println("PlacedStudent default constructor");
	}
	PlacedStudent(int fbId, String name, int distance, String compnyName, String designation) {
		super(fbId, name, distance);// step 3 b
		System.out.println("PlacedStudent para constructor");
		this.compnyName = compnyName;
		this.designation = designation;
	}

	String getCompnyName() {
		return compnyName;
	}

	void setCompnyName(String compnyName) {
		this.compnyName = compnyName;
	}

	String getDesignation() {
		return designation;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}

	void display() {

		super.display();// step 4
		System.out.println("Company name is " + this.compnyName);
		System.out.println("Designation is " + this.designation);
	}
	void work() {
		System.out.println("start working for the compny");
	}
	public String toString() {
	    return super.toString() +
	           "\nCompany Name: " + this.compnyName +
	           "\nDesignation: " + this.designation;
	}

}// class Placedstudent ends here

class DemoInheritance {
	public static void main(String[] args) {
		// Student s1= new Student();
		// System.out.println("Student count total: "+Student.getCount());

		// Student s2= new Student(102,"Aditya",100);
		// System.out.println("Student count total: "+Student.getCount());

//		PlacedStudent ps2 = new PlacedStudent();
//		ps2.display();
//		System.out.println(ps2.getName());
//		System.out.println("\n\n");
//		PlacedStudent ps1 = new PlacedStudent(78, "Rahul", 500, "BCCI", "Coach");
//		System.out.println("Student count total: " + Student.getCount());
//		ps1.display();
//		System.out.println(ps1.getName());
		Student s1;
		s1=new PlacedStudent(78, "Rahul", 500, "BCCI", "Coach");
		s1.work();
		System.out.println(s1);
		System.out.println(s1.toString());
	}
	

}//
