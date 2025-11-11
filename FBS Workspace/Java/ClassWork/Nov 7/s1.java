class Date
{
	int day,month,year;
	String dow;

	Date(){
		System.out.println("Constrector is called");
		this.day=4;
		this.month=11;
		this.year=2025;
		this.dow="friday";
	}

	Date(int d,int m,int y,String str){
		System.out.println("Parameter Constrector is called");
		this.day=d;
		this.month=m;
		this.year=y;
		this.dow=str;
	}
	
	void setDay(int x){
		this.day=x;
	}
	void setMonth(int x){
		this.month=x;
	}
	void setYear(int x){
		this.year=x;
	}
	void setDow(String x){
		this.dow=x;
	}

	int getDay(){
		return this.day;
	}

	int getMonth(){
		return this.month;
	}
	int getYear(){
		return this.year;
	}

	String getDow(){
		return this.dow;
	}

	void display(){
		System.out.println(this.getDay()+"/"+this.getMonth()+"/"+this.getYear()+" "+this.getDow());
	}
}
//date class ends hear

class Test
{
	public static void main(String[] args)
	{
		Date d1;
		d1=new Date();
		System.out.println(d1);
		Date d2;
		d2=new Date();
		System.out.println(d2);
		Date d3;
		d3=new Date();
		System.out.printf("%s\n",d3);

		System.out.printf("%d/%d/%d\n",d1.day,d1.month,d1.year);
		d1.day=31;
		d1.month=10;
		d1.year=2025;
		System.out.printf("%d/%d/%d\n",d1.day,d1.month,d1.year);

		System.out.printf("%d/%d/%d-%s\n",d1.day,d1.month,d1.year,d1.dow);
		d1.day=31;
		d1.month=10;
		d1.year=2025;
		d1.dow="friday";
		System.out.printf("%d/%d/%d-%s\n",d1.day,d1.month,d1.year,d1.dow);
		d2.setDay(9);
		d2.setMonth(7);
		d2.setYear(2004);
		d2.setDow("friday");
		System.out.printf("%d/%d/%d-%s\n",d2.day,d2.month,d2.year,d2.dow);

		System.out.println(d2.getDay()+"/"+d2.getMonth()+"/"+d2.getYear()+" "+d2.getDow());

		d1.display();

		Date d4;
		d4=new Date();
		d4.display();

		Date arr[]=new Date[3];
		arr[0]=new Date();
		arr[1]=new Date(7,11,2025,"fri");
		arr[2]=new Date();
		for (int i=0;i<3;i++)
			System.out.println(arr[i]);

		for (int i=0;i<arr.length;i++)
			arr[i].display();
	}//main ends hear
}
//test class ends hear