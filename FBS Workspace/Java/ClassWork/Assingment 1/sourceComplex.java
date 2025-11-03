class Complex{
	int real;
	int imaginary;
	
	void setImaginary(int x){
		this.imaginary=x;
	}
	void setReal(int x){
		this.real=x;
	}
}
//class complex ends hear
class TestComplex{
	public static void main(String [] args){
		Complex c1;
		c1=new Complex();
		c1.setReal(2);
		c1.setImaginary(3);
		System.out.println(c1.real+"+"+c1.imaginary+"i");
	}
	//class main ends hear
}
//class test complex ends hear