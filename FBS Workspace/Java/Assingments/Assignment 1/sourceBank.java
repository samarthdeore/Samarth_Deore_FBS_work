class Student {
	int rollNO;
	String name;
	double marks;

	Student() {
		this.rollNO=22;
		this.name="Ram";
		this.marks=100;
		System.out.println("Default Constertor is Called");
	}

	Student(int roll,String n,double mar) {
		this.rollNO=roll;
		this.name=n;
		this.marks=mar;
		System.out.println("Parameter Constertor is Called");
	}

	void setRollNo(int x){
		this.rollNO=x;
	}
	void setName(String x){
		this.name=x;
	}
	void setMarks(double x){
		this.marks=x;
	}

	int getRollNo(){
		return this.rollNO;
	}
	String getName(){
		return this.name;
	}
	double getMarks(){
		return this.marks;
	}

	void display(){
		System.out .println("Roll NO is "+this.rollNO+"\nName is "+this.name+"\nMark is "+this.marks);
	}
}
//class student ends hear


class Employee{
	int id;
	String name;
	double salary;

	Employee(){
		this.id=123;
		this.name="Aditya";
		this.salary=53231.67;
		System.out.println("Default Constertor is Called");
	}

	Employee(int i,String n,double sal){
		this.id=i;
		this.name=n;
		this.salary=sal;
		System.out.println("Parameter Constertor is Called");
	}

	void setId(int x){
		this.id=x;
	}
	void setName(String x){
		this.name=x;
	}
	void setSalary(double x){
		this.salary=x;
	}

	int getId(){
		return this.id;
	}
	String getName(){
		return this.name;
	}
	double getSalary(){
		return this.salary;
	}

	void display(){
		System.out.println("Id is"+this.id+"\nName is "+this.name+"\nSalary is "+this.salary);
	}
}
//employee class ends hear 


class Bank{
	void loan(Student s){
		if(s.marks>80)
			System.out.println("loan approved 2 Lakhs");
		else if(s.marks<80 && s.marks>60)
			System.out.println("loan approved 1 Lakhs");
		else if(s.marks<60 && s.marks>40)
			System.out.println("loan approved 50K");
		else if(s.marks<40)
			System.out.println("no loan approved");
	}


	void loan(Employee e){
		double lpa=e.salary*12;
			System.out.println(lpa);
		if(lpa>1200000)
			System.out.println("loan approved 7 Lakhs");
		else if(lpa<1200000 && lpa>1000000)
			System.out.println("loan approved 6 Lakhs");
		else if(lpa<1000000 && lpa>600000)
			System.out.println("loan approved 5 Lakhs");
		else if(lpa<600000 && lpa>400000)
			System.out.println("loan approved 4 Lakhs");
		else if(lpa<400000)
			System.out.println("no loan approved");
	}
}
//class bank ends hear
class TestBank{
	public static void main(String[] args){
		Student s1=new Student();
		Bank b1=new Bank();
		b1.loan(s1);
		Employee e1=new Employee();
		b1.loan(e1);
		
	}
}