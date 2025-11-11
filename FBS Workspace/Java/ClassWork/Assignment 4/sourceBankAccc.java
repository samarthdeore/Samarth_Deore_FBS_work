import java.util.*;
class BankAcc{
	int accNum;
	String accHolderName;
	double currentBalance;
	double interestRate;

	BankAcc(){
		this.accNum=1234678;
		this.accHolderName="swami";
		this.currentBalance=10000.1000;
		this.interestRate=3.3;
	}

	BankAcc(int no,String n,double current,double intrest){
		this.accNum=no;
		this.accHolderName=n;
		this.currentBalance=current;
		this.interestRate=intrest;
	}
	void setAccNum(int n){
		this.accNum=n;
	}
	void setAccHolderName(String n){
		this.accHolderName=n;
	}
	void setCurrentBalance(double n){
		this.currentBalance=n;
	}
	void setInterestRate(double n){
		this.interestRate=n;
	}

	int getAccNum(){
		return this.accNum;
	}
	String getAccHolderName(){
		return this.accHolderName;
	}
	double getCurrentBalance(){
		return this.currentBalance;
	}
	double  getInterestRate(){
		return this.interestRate;
	}

	void display(){
		System.out.println("Account number:"+this.accNum);
		System.out.println("Name:"+this.accHolderName);
		System.out.println("Current Balance:"+this.currentBalance);
		System.out.println("Interest Rate:"+this.interestRate);
	}
}
//class bankAcc ends hear

class Test1{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Accout no:");
		int no=sc.nextInt();
		sc.nextLine();
		System.out.println("enter Name:");
		String nm=sc.nextLine();
		System.out.println("Enter the Current Balance:");
		double curBal=sc.nextDouble();
		System.out.println("Enter the intrest rate");
		double iR=sc.nextDouble();
		BankAcc b1=new BankAcc(no,nm,curBal,iR);
		b1.display();
	}
}