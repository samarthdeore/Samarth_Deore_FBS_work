import java.util.Scanner;
class SalesManager{
	int id;
	String name;
	double salary;
	double incentive;
	int target;

	SalesManager(){
		this.id=34;
		this.name="Lakhan";
		this.salary=30000;
		this.incentive=2323;
		this.target=23;
		System.out.println("Default Constertor is Called");
	}

	SalesManager(int i,String n,double sal,double ince,int tar){
		this.id=i;
		this.name=n;
		this.salary= sal;
		this.incentive=ince;
		this.target=tar;
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
	void setIncentive(double x){
		this.incentive=x;
	}
	void setTarget(int x){
		this.target=x;
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
	double getIncentive(){
		return this.incentive;
	}
	int getTarget(){
		return this.target;
	}

	void display(){
		System.out.println("id is "+this.id+"\nname is "+this.name+"\nsalary is "+this.salary+"\nincentive is "+this.incentive+"\ntarget is "+this.target);

	}
}
//class salesMAnager ends hear
class TestSalesManager{
	public static void main(String [] args){
		SalesManager e1;
		e1=new SalesManager();
		e1.setId(11);
		e1.setName("Samarth");
		e1.setSalary(122222);
		e1.setIncentive(30000);
		e1.setTarget(10);
		System.out.println(e1.id+" "+e1.name+" "+e1.salary+" "+e1.incentive+" "+e1.target);

		e1.display();

		SalesManager e2;
		e2=new SalesManager(12,"Sham",25000,2121,21);
		e2.display();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name:");
		String nm=sc.nextLine();
		System.out.println("Enter employee Salary");
		double sal=sc.nextDouble();
		System.out.println("Enter employee incentive:");
		double ince=sc.nextDouble();
		System.out.println("Enter employee target:");
		int target=sc.nextInt();

		SalesManager e3=new SalesManager(id,nm,sal,ince,target);
		e3.display();
	}
	//main ends hear
}
//class testhr ends hear