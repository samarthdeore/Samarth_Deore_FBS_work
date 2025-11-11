class Book{
	int isbn;
	String bname;
	String catagory;
	double price;

	Book(){
		this.isbn=987637;
		this.bname="asda";
		this.catagory="asdasd";
		this.price=12455;
		System.out.println("Default Constertor is Called");
	}

	Book(int i,String bnm,String ctg,double pri){
		this.isbn=i;
		this.bname=bnm;
		this.catagory=ctg;
		this.price=pri;
		System.out.println("Parameter Constertor is Called");
	}

	void setIsbn(int x){
		this.isbn=x;
	}
	void setBname(String x){
		this.bname=x;
	}
	void setCatagory(String x){
		this.catagory=x;
	}
	void setPrice(double x){
		this.price=x;
	}

	int getIsbn(){
		return this.isbn;
	}
	String getBname(){
		return this.bname;
	}
	String getCatagory(){
		return this.catagory;
	}
	double getPrice(){
		return this.price;
	}

	void display(){
		System.out.println("ISBN is"+this.isbn+"\nBook name is "+this.bname+"\nBook Category is "+this.catagory+"\nPrice is "+this.price);
	}
}
//class book ends hear
class TestBook{
	public static void main(String [] args){
	
		Book b1;
		b1=new Book();
		b1.setIsbn(1234456523);
		b1.setBname("Chaava");
		b1.setCatagory("Biopic");
		b1.setPrice(999);
		System.out.println(b1.isbn+" "+b1.bname+" "+b1.catagory+" "+b1.price);

		Book b2;
		b2=new Book(13221,"asdasda","werrew",2343);

		b1.display();
		b2.display();
	}
	//main ends hear
}
//class testbook ends hear