import java.util.Scanner;
class HR{
	int id;
	String name;
	double salary;
	double commission;

	HR(){
		this.id=133;
		this.name="sasdhahda";
		this.salary=13444;
		this.commission=2323;
		System.out.println("Constertor is Called");
	}

	HR(int i,String nm ,double sal,double comis){
		this.id=i;
		this.name=nm;
		this.salary=sal;
		this.commission=comis;
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
	void setCommission(double x){
		this.commission=x;
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
	double getCommission(){
		return this.commission;
	}

	void display(){
		System.out.println(this.getId()+" "+this.getName()+" "+this.getSalary()+" "+this.getCommission());
	}
}
//class hr ends hear
class TestHR{
	public static void main(String [] args){
		HR e1;
		e1=new HR();
		e1.setId(11);
		e1.setName("Samarth");
		e1.setSalary(122222);
		e1.setCommission(30000);
		System.out.println(e1.id+" "+e1.name+" "+e1.salary+" "+e1.commission);
		e1.display();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name:");
		String nm=sc.nextLine();
		System.out.println("Enter employee Salary");
		double sal=sc.nextDouble();
		System.out.println("Enter employee commission:");
		double commi=sc.nextDouble();
 
		HR e2=new HR(id,nm,sal,commi);
		e2.display();
	}
	//main ends hear
}
//class testhr ends hear