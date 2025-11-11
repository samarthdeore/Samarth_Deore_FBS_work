class Triangle{
	double hight;
	double base;

	Triangle(){
		this.hight=23.1;
		this.base=10.34;
	}

	Triangle(double h,double b){
		this.hight=h;
		this.base=b;
	}


	void setHight(double hgt){
		this.hight=hgt;
	}

	void setBase(double bes){
		this.base=bes;
	}
	double getHight(){
		return this.hight;
	}
	double getBase(){
		return this.base;
	}


}
//class triangle ends hear


class Rectangle{
	int length;
	int breadth;

	Rectangle(){
		this.length=23;
		this.breadth=10;
	}

	Rectangle(int len,int b){
		this.length=len;
		this.breadth=b;
	}


	void setLength(int hgt){
		this.length=hgt;
	}

	void setBreadth(int bes){
		this.breadth=bes;
	}
	double getLength(){
		return this.length;
	}
	double getBreadth(){
		return this.breadth;
	}


}
//class rectangle ends hear

class Circle{
	double redius;

	Circle(){
		this.redius=5.4;
	}

	Circle(double red){
		this.redius=red;
	}

	void setRedius(double red){
		this.redius=red;
	}

	double getRedius(){
		return this.redius;
	}

}
//class circle ends hear

class Shape{

	void area(Triangle t){
		double area=0.5*t.base*t.hight;
		System.out.println("area of triangle is "+area);
	}

	void area(Rectangle r){
		System.out.println("area of rectangle is "+r.length*r.breadth);
	}

	void area(Circle c){
		System.out.println("area of circle is "+3.14*c.redius*c.redius);
	}
	
}
//class shape ends hear

class Test{
	public static void main(String[] args){
		Triangle t1=new Triangle();
		Shape s1=new Shape();
		s1.area(t1);
		Rectangle r1=new Rectangle();
		s1.area(r1);

		Circle c1=new Circle();
		s1.area(c1);
	}
	//main ends hear
}

//class test ends hear