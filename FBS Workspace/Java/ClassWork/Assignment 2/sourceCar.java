class Car{
	String model;
	String brand;
	double price;
	String colour;
	int fuleCapacity;

	void setModel(String x){
		this.model=x;
	}
	void setBrand(String x){
		this.brand=x;
	}
	void setPrice(double x){
		this.price=x;
	}
	void setColour(String x){
		this.colour=x;
	}
	void setFuleCapacity(int x){
		this.fuleCapacity=x;
	}

	
	String getModel(){
		return this.model;
	}
	String getBrand(){
		return this.brand;
	}
	double getPrice(){
		return this.price;
	}
	String getColour(){
		return this.colour;
	}
	int setFuleCapacity(){
		return this.fuleCapacity;
	}

	void display(){
		System.out.println("Car model is "+this.model+"\nBrand is "+this.brand+"\nColour is "+this.colour+"\nPrice is "+this.price+"\nFule Capacity is "+this.fuleCapacity+"L");
	}
}
//class car ends hear

class TestCar{
	public static void main(String []srgs){
		Car c1;
		c1=new Car();
		c1.setModel("swift");
		c1.setBrand("suzuki");
		c1.setColour("white");
		c1.setPrice(650000);
		c1.setFuleCapacity(30);
		System.out.println(c1.model+" "+c1.brand+" "+c1.colour+" "+c1.price+" "+c1.fuleCapacity+"L");

		c1.display();
	}
	//main ends hear
}
// class testcar ends hear