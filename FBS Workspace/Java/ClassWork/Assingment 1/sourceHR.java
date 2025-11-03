class HR{
	int id;
	String name;
	double salary;
	double commission;

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

	}
	//main ends hear
}
//class testhr ends hear