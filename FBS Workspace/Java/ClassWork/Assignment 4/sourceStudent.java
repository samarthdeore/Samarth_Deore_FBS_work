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
class TestStudent{
	public static void main(String [] args){
		Student s1;
		s1=new Student();
		s1.setRollNo(22);
		s1.setName("Samarth");
		s1.setMarks(99);
		System.out .println(s1.rollNO+" "+s1.name+" "+s1.marks);

		s1.display();

		Student s2;
		s2=new Student(32,"Chandra",89);
		s2.display();

	}
	//main ends hear


}
//class test student ends hear