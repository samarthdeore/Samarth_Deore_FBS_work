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
		System.out.println("\nId is : "+this.id+"\nName is : "+this.name+"\nSalary is : "+this.salary);
	}
}
//employee class ends hear 

class Admin extends Employee{
	double allowance;

	Admin(){
		super();
		this.allowance=2123;
		System.out.println("Constertor is Called");
	}


	Admin(int i,String nm, double sal,double alw){
		super(i,nm,sal);
		this.allowance=alw;
		System.out.println("Parameter Constertor is Called");
	}

	
	void setAlloance(double x){
		this.allowance=x;
	}

	double getAlloance(){
		return this.allowance;
	}

	void display(){
		super.display();
		System.out.println("allowance is "+this.allowance);
	}
}
//class Admin ends hear


class SalesManager extends Employee{
	
	double incentive;
	int target;

	SalesManager(){
		super();
		this.incentive=2323;
		this.target=23;
		System.out.println("Default Constertor is Called");
	}

	SalesManager(int i,String n,double sal,double ince,int tar){
		super(i,n,sal);
		this.incentive=ince;
		this.target=tar;
		System.out.println("Parameter Constertor is Called");
	}

	void setIncentive(double x){
		this.incentive=x;
	}
	void setTarget(int x){
		this.target=x;
	}

	double getIncentive(){
		return this.incentive;
	}
	int getTarget(){
		return this.target;
	}

	void display(){
		super.display();
		System.out.println("incentive is : "+this.incentive+"\ntarget is : "+this.target);

	}
}
//class SalesManager ends hear


class HR extends Employee{
	double commission;

	HR(){
		super();
		this.commission=2323;
		System.out.println("Constertor is Called");
	}

	HR(int i,String nm ,double sal,double comis){
		super(i,nm,sal);
		this.commission=comis;
		System.out.println("Parameter Constertor is Called");
	}

	void setCommission(double x){
		this.commission=x;
	}

	double getCommission(){
		return this.commission;
	}

	void display(){
		super.display();
		System.out.println("commission is : "+this.getCommission());
	}
}
//class hr ends hear


class Test{
	public static void main(String [] args){
		HR e1;
		e1=new HR();
		e1.setId(11);
		e1.setName("Samarth");
		e1.setSalary(122222);
		e1.setCommission(30000);
		e1.display();

		SalesManager e2;
		e2=new SalesManager(12,"Sham",25000,2121,21);
		e2.display();

		Admin e3;
		e3=new Admin(1,"Arjun",1231241,2323);
		e3.display();

		Employee e4;
		e4=new Employee();
		e4.setId(11);
		e4.setName("Samarth");
		e4.setSalary(122222);	
		e4.display();
	}
}