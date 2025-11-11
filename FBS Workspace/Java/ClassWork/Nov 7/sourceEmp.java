import java.util.Scanner;
class Employee{
	int id;
	String name;
	double salary;

	Employee(){
		this.id=123;
		this.name="Aditya";
		this.salary=123231;
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

class TestEmp{
	public static void main(String [] args){
	Employee e1;
	e1=new Employee();
	e1.setId(11);
	e1.setName("Samarth");
	e1.setSalary(122222);

	System.out.println(e1.id+" "+e1.name+" "+e1.salary);
	
	e1.display();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name:");
		String nm=sc.nextLine();
		System.out.println("Enter employee Salary");
		double sal=sc.nextDouble();
		Employee e2=new Employee(id,nm,sal);
		e2.display();

		Employee arr[]=new Employee[3];
		arr[0]=new Employee();
		arr[1]=new Employee(id,nm,sal);
		arr[2]=new Employee();
		for (int i=0;i<3;i++)
			System.out.println(arr[i]);

		for (int i=0;i<arr.length;i++)
			arr[i].display();
	}
	//main ends hear
}
//teat ends hear