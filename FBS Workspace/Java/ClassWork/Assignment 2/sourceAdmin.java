class Admin{
	int id;
	String name;
	double salary;
	double allowance;

	void setId(int x){
		this.id=x;
	}
	void setName(String x){
		this.name=x;
	}
	void setSalary(double x){
		this.salary=x;
	}
	void setAlloance(double x){
		this.allowance=x;
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
	double getAlloance(){
		return this.allowance;
	}

	void display(){
		System.out.println("Id is"+this.id+"\n name is "+this.name+"\nSalary is "+this.salary+"\n allowance is "+this.allowance);
	}
}
//class hr ends hear
class TestAdmin{
	public static void main(String [] args){
		Admin e1;
		e1=new Admin();
		e1.setId(11);
		e1.setName("Samarth");
		e1.setSalary(122222);
		e1.setAlloance(30000);
		System.out.println(e1.id+" "+e1.name+" "+e1.salary+" "+e1.allowance);
		e1.display();
	}
	//main ends hear
}
//class testhr ends hear