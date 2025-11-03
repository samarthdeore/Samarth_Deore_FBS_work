class Date
{
	int day,month,year;
	String dow;
	
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
	}//main ends hear
}
//test class ends hear