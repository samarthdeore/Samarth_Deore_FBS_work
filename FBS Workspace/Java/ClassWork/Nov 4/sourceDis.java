class Distans{
	int km;
	int m;
	

	Distans(){
		this.km=10;
		this.m=100;
		System.out.println("Constertor is Called");
	
	}

	Distans(int kem,int em){
		this.km=kem;
		this.m=em;
		System.out.println("Constertor is Called");
	
	}
	void setKm(int x){
		this.km=x;
	}

	void setM(int x){
		this.m=x;
	}

	int getKm(){
		return this.km;
	}
	int getM(){
		return this.m;
	}

	void display(){
		System.out.println(this.getKm()+"Km"+this.getM()+"m");
	}
}
//class distans ends hear

class TeatDistans{
	public static void main(String [] args){
		Distans d1;
		d1=new Distans();
		
		d1.setM(10);
		d1.setKm(100);

		System.out.println(d1.km+"Km"+d1.m+"m");
		d1.display();
	}
	//main ends hear
}
//class testDistans ends hear