class Product{
	int productId;
	String pname;
	double price;
	int quantity;
	
	void setProductId(int x){
		this.productId=x;
	}
	void setPname(String x){
		this.pname=x;
	}
	void setPrice(double x){
		this.price=x;
	}
	void setQuantity(int x){
		this.quantity=x;
	}

	int getProductId(){
		return this.productId;
	}
	String getPname(){
		return this.pname;
	}
	double getPrice(){
		return this.price;
	}
	int getQuantity(){
		return this.quantity;
	}

	void display(){
		System.out.println("productId is "+this.productId+"\npname is "+this.pname+"\nprice is "+this.price+"\nQuantity is "+this.quantity);
	}
}
//class product ends hear
class TestProduct{
	public static void main(String [] args){
		Product p1;
		p1=new Product();
		p1.setPname("laptop");
		p1.setPrice(59999);
		p1.setQuantity(10);
		p1.setProductId(1001);
		
		System.out.println(p1.productId+" "+p1.pname+" "+p1.price+" "+p1.quantity);
		
		p1.display();
	}
	//main ends hear
}
//class test product ends hear