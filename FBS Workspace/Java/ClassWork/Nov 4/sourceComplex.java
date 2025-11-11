class Complex{
	int real;
	int imaginary;

	Complex(){
		this.real=5;
		this.imaginary=9;
		System.out.println("Constertor is Called");
	}

	Complex(int r,int i){
		this.real=r;
		this.imaginary=i;
		System.out.println("Parameter Constertor is Called");
	}
	
	void setImaginary(int x){
		this.imaginary=x;
	}
	void setReal(int x){
		this.real=x;
	}

	int getReal(){
		return this.real;
	}
	int getImaginary(){
		return this.imaginary;
	}

	void display(){
		System.out.println(this.getReal()+"+"+ this.getImaginary() +"i");
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
		c1.display();

		Complex c2;
		c2=new Complex();
		c2.display();
	}
	//class main ends hear
}
//class test complex ends hear