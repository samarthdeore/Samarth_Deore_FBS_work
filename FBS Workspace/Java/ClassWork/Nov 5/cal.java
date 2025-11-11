class Calculator{
	void add(int a,int b){
		int c=a+b;
		System.out.println(c);
		System.out.println("hi 1");
	}

	void add(float a,int b){
		System.out.println(a+b);
		System.out.println("hi 2");
	}

	void add(int a,float b){
		
		System.out.println(a+b);
		System.out.println("hi 3");
	}

	void add(double a,double b){
		
		System.out.println(a+b);
		System.out.println("hi 4");
	}

	void sub(int a,int b){
		int c=a-b;
		System.out.println(c);
		System.out.println("hi 1");
	}

	void sub(float a,int b){
		System.out.println(a-b);
		System.out.println("hi 2");
	}

	void sub(int a,float b){
		
		System.out.println(a-b);
		System.out.println("hi 3");
	}

	void sub(double a,double b){
		
		System.out.println(a-b);
		System.out.println("hi 4");
	}

	void mul(int a,int b){
		int c=a*b;
		System.out.println(c);
		System.out.println("hi 1");
	}

	void mul(float a,int b){
		System.out.println(a*b);
		System.out.println("hi 2");
	}

	void mul(int a,float b){
		
		System.out.println(a*b);
		System.out.println("hi 3");
	}

	void mul(double a,double b){
		
		System.out.println(a*b);
		System.out.println("hi 4");
	}

	void div(int a,int b){
		int c=a/b;
		System.out.println(c);
		System.out.println("hi 1");
	}

	void div(float a,int b){
		System.out.println(a/b);
		System.out.println("hi 2");
	}

	void div(int a,float b){
		
		System.out.println(a/b);
		System.out.println("hi 3");
	}

	void div(double a,double b){
		
		System.out.println(a/b);
		System.out.println("hi 4");
	}
}
//class calculator ends hear

class Test1{

	public static void main(String []args){
		Calculator c1=new Calculator();
		int a=10;
		double d=10.5;
		float f=10.3f;

		c1.add(a,a);
		c1.add(f,a);
		c1.add(a,f);
		c1.add(d,d);

		c1.sub(a,a);
		c1.sub(f,a);
		c1.sub(a,f);
		c1.sub(d,d);

		c1.mul(a,a);
		c1.mul(f,a);
		c1.mul(a,f);
		c1.mul(d,d);

		c1.div(a,a);
		c1.div(f,a);
		c1.div(a,f);
		c1.div(d,d);

	}
}