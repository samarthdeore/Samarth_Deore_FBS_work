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
	}
	//main ends hear
}
//class test product ends hear