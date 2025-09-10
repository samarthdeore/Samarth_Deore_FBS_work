#include<stdio.h>
float sub_persent();
int add();
float areaTriangle();
int avg();
float areaCircle();
float Celcious();
float minIntoHr();
void quebAndSquer();
int rectPerimeter();
void swap();
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
			printf("total marks in persentage are %f",sub_persent());
			
		}
			
		else if(ch==2)
		{
			printf("%d",add());
		
		}
			
		else if(ch==3)
		{
				printf("Area of triangle is %d",areaTriangle());
		
		}
			
		else if(ch==4)
		{
			printf("Average of 5 numbers is %d",avg());
		
		}
			
		else if(ch==5)
		{
			printf("area of circle is=%f",areaCircle());
			
		}
			
		else if(ch==6)
		{
			printf("the converted temperature from celsius to fahrenheit is %f",Celcious());
			
		}
			
		else if(ch==7)
		{
			printf("the convertion of given minutes into hours is %f",minIntoHr());
		
		}
			
		else if(ch==8)
		{
			quebAndSquer();
		
		}
			
		else if(ch==9)
		{
			printf("the perimeter of rectangle is %d.",rectPerimeter());
			
		}
			
		else if(ch==10)
		{
			swap();
			
		}
			
		else if(ch!=0)
			printf("Invalid Input");
	
	}while(ch!=0);
}
float sub_persent()
{
	int math=50,sci=50,history=50,marathi=50,hindi=50;
	float persentage,total_marks;
	total_marks=math+sci+history+marathi+hindi;
	persentage=(total_marks/500)*100;
	return persentage;
}
int add()
{
	return 10+10;	
}
float areaTriangle()
{
	float base=100.500,hight=100.523,area;
	area=0.5*base*hight;
	return area;
}
int avg()
{
	int a,b,c,d,e,avg,v;
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
	
	v=a+b+c+d+e;
	avg=v/5;
	return avg;
	
}
float areaCircle()
{
	int r=5;
	float pi=3.14;
	float area=pi*r*r;
	return area;
}

float Celcious()
{
	float c=14.2;
	
	float f=(c*9/5)+32;
	return f;
}

float minIntoHr()
{
	float min=140;
	float hr=min/60;
	return hr;
}

void quebAndSquer()
{
	int a=5,squr,cube;
	squr=a*a;
	cube=a*a*a;
	printf("the square of given no is %d and cube of given no is %d. ",squr,cube);
}

int rectPerimeter()
{
	int p,len,wdth;
	printf("enter the length of rectangle :");
	scanf("%d",&len);
	printf("enter the width of rectangle :");
	scanf("%d",&wdth);
	p=2*len+2*wdth;
	return p;
}

void swap()
{
	int a=1,b=2,c;
	printf("before sawping a=%d and b=%d\n",a,b);
	c=a;
	a=b;
	b=c;
	printf("after swaping a=%d nad b=%d",a,b);
}
