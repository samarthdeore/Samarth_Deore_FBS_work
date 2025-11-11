class Time {
	int hr;
	int min;
	int sec;

	Time(){
		this.hr=13;
		this.min=45;
		this.sec=55;
	}
	Time(int h,int m,int s){
		this.hr=h;
		this.min=m;
		this.sec=s;
	}

	void setHr(int h){
		this.hr=h;
	}
	void setMin(int h){
		this.min=h;
	}
	void setSec(int h){
		this.sec=h;
	}

	int getHr(){
		return this.hr;
	}
	int getMin(){
		return this.min;
	}
	int getSec(){
		return this.sec;
	}

	void add(Time t,Time r){
		int h=t.hr+r.hr;
		int m=t.min+r.min;
		int s=t.sec+r.sec;
		System.out.println("Addition of 2 times is= "+h+":"+m+":"+s);
	}

	void add(Time t,int hour,int mi,int se){
		int h=t.hr+hour;
		int m=t.min+mi;
		int s=t.sec+se;
		System.out.println("Addition of time and int is= "+h+":"+m+":"+s);
	}

	
}
//class time ends 

class TestTime{
	public static void main(String [] args){
		Time t1=new Time();
		Time t2=new Time(22,11,45);
		t1.add(t1,t2);
		t1.add(t2,2,2,2);
	}
}
//class testtime ends hear