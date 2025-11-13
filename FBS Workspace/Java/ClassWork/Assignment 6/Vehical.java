
public class Vehical {
	int vehicleId;
	String brand;
	double price;
	
	
	Vehical() {
		this.vehicleId = 100;
		this.brand = "not given";
		this.price = 90000;
	}
	
	Vehical(int vehicleId, String brand, double price) {
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.price = price;
	}
	
	int getVehicleId() {
		return vehicleId;
	}
	void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	
	void display() {
		System.out.println("Vehicle ID is : " + this.vehicleId);
		System.out.println("Brand is : " + this.brand);
		System.out.println("Price is : " + this.price);
	}
	void breake() {
		System.out.println("break is applied");
	}
}
//class vehicle ends here

class Car extends Vehical
{
	
	int doors;
	Car() {
		super();
		this.doors = 6;
	}
	Car(int vehicleId, String brand, double price,int doors) {
		super(vehicleId,brand,price);
		this.doors = doors;
	}
	int getDoors() {
		return doors;
	}
	void setDoors(int doors) {
		this.doors = doors;
	}
	
	void display() {
		super.display();
		System.out.println("doors is : "+this.doors);
	}
	void breake() {
		System.out.println("drum break is applied");
	}
	
}
//class car ends here

class Bike extends Vehical
{
	String type;
	boolean hasDiscBrake;
	Bike() {
		super();
		this.type = "no given";
		this.hasDiscBrake = false;
	}
	Bike(int vehicleId, String brand, double price,String type, boolean hasDiscBrake) {
		super(vehicleId,brand,price);
		this.type = type;
		this.hasDiscBrake = hasDiscBrake;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	boolean isHasDiscBrake() {
		return hasDiscBrake;
	}
	void setHasDiscBrake(boolean hasDiscBrake) {
		this.hasDiscBrake = hasDiscBrake;
	}
	
	void display() {
		super.display();
		System.out.println("Type is : "+this.type);
		System.out.println("Disc Break is : "+this.hasDiscBrake);
	}
	void breake() {
		System.out.println("disk break is applied");
	}
}

class Truck extends Vehical{
	double loadCapacity;
	Truck() {
		super();
		this.loadCapacity = 80.23;
	}
	Truck(int vehicleId, String brand, double price,double loadCapacity) {
		super(vehicleId,brand,price);
		this.loadCapacity = loadCapacity;
	}
	double getLoadCapacity() {
		return loadCapacity;
	}
	void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
	void display() {
		super.display();
		System.out.println("Load Capacity is : "+this.loadCapacity);
	}
	void breake() {
		System.out.println("air break is applied");
	}
}
//class truck ends here

class TestVehical {
	public static void main(String[] args) {
//		Vehical v1 =new Vehical(2, "Tata", 7000000);
//		Vehical v2 =new Vehical();
//		
//		Car c1 =new Car();
//		Car c2= new Car(3, "Hyundai", 900000, 4);
//		
//		Bike b1 = new Bike();
//		Bike b2 = new Bike(4, "Yamaha", 150000, "Cruiser", true);
//		
//		Truck t1 = new Truck();
//        Truck t2 = new Truck(5, "Volvo", 5000000, 120.5);
//        
//        v1.display(); 
//        System.out.println();
//        v2.display(); 
//        System.out.println();
//        c1.display(); 
//        System.out.println();
//        c2.display(); 
//        System.out.println();
//        b1.display(); 
//        System.out.println();
//        b2.display(); 
//        System.out.println();
//        t1.display(); 
//        System.out.println();
//        t2.display();
        
        Vehical v3 =new Vehical();
        v3.breake();
        v3=new Car();
        v3.breake();
        v3=new Bike();
        v3.breake();
        v3=new Truck();
        v3.breake();
		
	}
	//main ends here
}
//test class ends here