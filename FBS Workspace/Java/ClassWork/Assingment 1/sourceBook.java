class Book{
	int isbn;
	String bname;
	String catagory;
	double price;

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
	}
	//main ends hear
}
//class testbook ends hear