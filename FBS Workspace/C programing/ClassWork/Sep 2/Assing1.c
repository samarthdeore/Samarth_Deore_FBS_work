#include<stdio.h>
/*function declaration*/
int leepYear();
int evenOdd();
int pallindrome();
double totalsalary();
int upperLower();
int eligibleVote();
int vowel();
void main()
{
	int ch;
	
	do
	{	
		printf("\n1. Leep Year\n");
		printf("2. Even Odd\n");
		printf("3. Pallindrome\n");
		printf("4. Total Salary\n");
		printf("5. Upper or Lower\n");
		printf("6. Eligible for Vote\n");
		printf("7. Vowel or Consonent\n");
		printf("0. Exit\n");
		printf("\nEnter your Choice:");
		scanf("%d",&ch);
		if(ch==1){
		
			if (leepYear())//function call
				printf("year is leep year");
			else
				printf("year is not leep year");
			
		}
			
		else if(ch==2)
		{
			if(evenOdd())//function call 
				printf("no is even");
			else
				printf("no is odd");
		
		}
			
		else if(ch==3)
		{
			if(pallindrome())
				printf("no is pallindrome");
			else
				printf("no is not pallindrome");
	
		
		}
			
		else if(ch==4)
		{
			printf("total salary of person is %f",totalsalary());
		
		}
			
		else if(ch==5)
		{
			if(upperLower())
				printf("Character is upper case");
			else
				printf ("charecter is lower case");	
		}
			
		else if(ch==6)
		{
			if (eligibleVote())
			{
				printf("person is not eligible to vote");
			}
			else {
				printf("person is eligible to vote");
				}
			
		}
			
		else if(ch==7)
		{
			if(	vowel() )
				printf("the character is vowel");
			else
				printf("the character is consonent");
		
		}
			
		else if(ch!=0)
			printf("Invalid Input");
	
	}while(ch!=0);
		
}

//function definations
int leepYear()
{
	int y=2004;
	return (y%4==0&&y%100!=0||y%400==0) ;	
}

int evenOdd()
{
	int no=10;
	return no%2==0;
	
}

int pallindrome()
{
	int no=121;
	int r1,r2,r3,q1,rev;
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
	return no==rev;
	
}

double totalsalary()
{
	double basic=10000;
	double totalsalary,da,ta,hra;
	if(basic<=5000)
	{
		da=basic*0.10;
		ta=basic*0.20;
		hra=basic*0.25;	
	}
	else{
		da=basic*0.15;
		ta=basic*0.25;
		hra=basic*0.30;
	}
	totalsalary=basic+da+ta+hra;
	return totalsalary;
}

int upperLower()
{
	char c;
	printf ("\n enter the character :");
	scanf(" %c",&c);
	return (c>='A'&&c<='Z');
}

int eligibleVote()
{
	int p=17;
	return p<18;
	
}

int vowel()
{
	char c='A';
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		return 1;
	else
		return 0;
	
}
