class SalesManager{
	int id;
	String name;
	double salary;
	double incentive;
	int target;

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
}
//class hr ends hear
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

	}
	//main ends hear
}
//class testhr ends hear