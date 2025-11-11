class Employee{
	int id;
	String name;
	double salary;
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
	}
	//main ends hear
}
//teat ends hear