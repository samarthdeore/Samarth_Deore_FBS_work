class Printer{

	void print(){
		System.out.println("Hello");
	}
	void print(int i){
		System.out.println(i);
	}
	void print(char a){
		System.out.println(a);
	}

	void print(String s){
		System.out.println(s);
	}
}
//printer class ends hear

class Test{

	public static void main(String []args){
		Printer p1=new Printer();
		p1.print();
		p1.print(1);
		p1.print('v');
		p1.print("Rahul");
	}
	//main ends hear
}
//test class ends hear