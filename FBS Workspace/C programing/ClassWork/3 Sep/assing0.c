#include<stdio.h>
void sub_persent(int ,int ,int ,int ,int );
void add(int);
void areaTriangle(float ,float );
void avg(int ,int ,int ,int ,int );
void areaCircle(int r);
void Celcious(float);
void minIntoHr(float);
void quebAndSquer(int);
void rectPerimeter(int ,int );
void swap(int,int);
void main()
{	
	int ch;
	printf("1. 5 subjects percentage\n");
	printf("2. 2 no addtion\n");
	printf("3. Area of triangle\n");
	printf("4. Avrage of 5 numbers\n");
	printf("5. Area of circle\n");
	printf("6. Celcious Convaertion\n");
	printf("7. Minute into Hours\n");
	printf("8. Qube and Squre\n");
	printf("9. Rectangel perimeter\n");
	printf("10. Swap 2 Numbers\n");
	printf("0. Exit\n");
	
	do
	{	printf("\nEnter your Choice:");
		scanf("%d",&ch);
		if(ch==1){
			int math=50,sci=50,history=50,marathi=50,hindi=50;
			sub_persent(math,sci,history,marathi,hindi);
			
		}
			
		else if(ch==2)
		{
			add(10+10);
		
		}
			
		else if(ch==3)
		{
			float base=3.4,hight=3.3;
			areaTriangle(base,hight);
		
		}
			
		else if(ch==4)
		{
			int a,b,c,d,e;
			printf("enter 5 numbers:\n");
			printf("enter a 1st number:\n");
			scanf("%d",&a);
	
			printf("enter a 2nd number:\n");
			scanf("%d",&b);
	
			printf("enter a 3rd number:\n");
			scanf("%d",&c);
	
			printf("enter a 4th number:\n");
			scanf("%d",&d);
	
			printf("enter a 5th number:\n");
			scanf("%d",&e);
			avg(a,b,c,d,e);
		
		}
			
		else if(ch==5)
		{
			int r=5;
			areaCircle(r);
			
		}
			
		else if(ch==6)
		{
			float c=14.2;
			Celcious(c);
			
		}
			
		else if(ch==7)
		{
			float min=140;
			minIntoHr(min);
		
		}
			
		else if(ch==8)
		{
			int a=5;
			quebAndSquer(a);
		
		}
			
		else if(ch==9)
		{
			int len,wdth;
			printf("enter the length of rectangle :");
			scanf("%d",&len);
			printf("enter the width of rectangle :");
			scanf("%d",&wdth);
			rectPerimeter(len,wdth);
			
		}
			
		else if(ch==10)
		{
			int a=1,b=2;
			swap(a,b);
			
		}
			
		else if(ch!=0)
			printf("Invalid Input");
	
	}while(ch!=0);
}
void sub_persent(int math,int sci,int history,int marathi,int hindi)
{
	
	float persentage,total_marks;
	total_marks=math+sci+history+marathi+hindi;
	persentage=(total_marks/500)*100;
	printf("total marks are %f and persentage are %f",total_marks,persentage);
	
}
void add(int x)
{
	printf("10+10=%d",x);	
}
void areaTriangle(float base,float hight)
{
	float area;
	area=0.5*base*hight;
	printf("area of triangle %f",area);
}
void avg(int a,int b,int c,int d,int e)
{
	int v,avg;
	
	v=a+b+c+d+e;
	avg=v/5;
	printf("Average of 5 numbers is %d",avg);
}
void areaCircle(int r)
{
	
	float pi=3.14;
	double area=pi*r*r;
	printf("area of circle is=%f",area);
}

void Celcious(float c)
{
	
	
	float f=(c*9/5)+32;
	printf("the converted temperature from celsius to fahrenheit is %f",f);
}

void minIntoHr(float min)
{
	
	float hr;
	hr=min/60;
	printf("the convertion of given minutes into hours is %f",hr);
}

void quebAndSquer(int a)
{
	int squr,cube;
	squr=a*a;
	cube=a*a*a;
	printf("the square of given no is %d and cube of given no is %d. ",squr,cube);
}

void rectPerimeter(int len,int wdth)
{
	int p;
	p=2*len+2*wdth;
	printf("the perimeter of rectangle is %d.",p);
}

void swap(int a,int b)
{
	int c;
	printf("before sawping a=%d and b=%d\n",a,b);
	c=a;
	a=b;
	b=c;
	printf("after swaping a=%d nad b=%d",a,b);
}
