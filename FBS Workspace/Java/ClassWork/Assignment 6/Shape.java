class Shape {
	String color;

	Shape() {
		color = "Red";
	}

	Shape(String color) {
		this.color = color;
	}
	

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	void display() {
		System.out.println("Color is: " + color);
	}
	double calArea() {
		double area=0;
		return area;
	}
}
//class shape ends here

class Circle extends Shape {
	double radius;

	Circle() {
		super();
		radius = 5.0;
	}

	Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}

	double getArea() {
		return Math.PI * radius * radius;
	}

	void display() {
		super.display();
		System.out.println("Radius is: " + radius);
		System.out.println("Area of Circle is: " + getArea());
		System.out.println();
	}
	double calArea() {
		double area=3.14*this.radius*this.radius;
		return area;
	}
}
//class circle ends here
class Rectangle extends Shape {
	double length;
	double breadth;

	Rectangle() {
		super();
		length = 4.0;
		breadth = 6.0;
	}

	Rectangle(String color, double length, double breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}
	
	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getBreadth() {
		return breadth;
	}

	void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	double getArea() {
		return length * breadth;
	}

	void display() {
		super.display();
		System.out.println("Length is: " + length);
		System.out.println("Breadth is: " + breadth);
		System.out.println("Area of Rectangle is: " + getArea());
		System.out.println();
	}
	double calArea() {
		double area=this.breadth*this.length;
		return area;
	}
}
//class rectangle ends here
class Triangle extends Shape {
	double base;
	double height;

	Triangle() {
		super();
		base = 5.0;
		height = 3.0;
	}

	Triangle(String color, double base, double height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	double getArea() {
		return 0.5 * base * height;
	}

	void display() {
		super.display();
		System.out.println("Base is: " + base);
		System.out.println("Height is: " + height);
		System.out.println("Area of Triangle is: " + getArea());
		System.out.println();
	}
	double calArea() {
		double area=0.5*this.base*this.height;
		return area;
	}
}
//class triangle ends here
class TestShape {
	public static void main(String[] args) {

//		System.out.println("--- Circle ---");
//		Circle c1 = new Circle();
//		Circle c2 = new Circle("Blue", 7.5);
//		c1.display();
//		c2.display();
//
//		System.out.println("--- Rectangle ---");
//		Rectangle r1 = new Rectangle();
//		Rectangle r2 = new Rectangle("Green", 8.0, 5.0);
//		r1.display();
//		r2.display();
//
//		System.out.println("--- Triangle ---");
//		Triangle t1 = new Triangle();
//		Triangle t2 = new Triangle("Yellow", 6.0, 4.0);
//		t1.display();
//		t2.display();
		
		Shape s1=new Shape();
		System.out.println(s1.calArea());
		s1=new Circle("Blue", 7.5);
		System.out.println(s1.calArea());
		s1=new Rectangle("Green", 8.0, 5.0);
		System.out.println(s1.calArea());
		s1=new Triangle("Yellow", 6.0, 4.0);
		System.out.println(s1.calArea());
		
	}
	//main ends here
}
//class test ends here