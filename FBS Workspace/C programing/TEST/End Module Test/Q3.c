#include<stdio.h>
struct mobile{
	int mid;
	char mname[20];
	int price;
	char brand[20];
};

struct mobile mo[10];
int mobileCount=0;
void add_mobile()
{	
		printf("enter the mobile id");
		scanf("%d",&mo[mobileCount].mid);
		
		printf("enter the mobile name");
		
		scanf(" %s",&mo[mobileCount].mname);
		printf("entre the price of mobile");
		scanf("%d",&mo[mobileCount].price);
		printf("enter the brand name");
		scanf("%s",&mo[mobileCount].brand);
		mobileCount++;
	
	
}

void display()
{
	int i;
	for(i=0;i<mobileCount;i++)
	{
		printf("mid = %d\t",mo[i].mid);
		printf("mname = %s\t",mo[i].mname);
		printf("price = %d\t",mo[i].price);
		printf("brand = %s\t",mo[i].brand);
	}
}

void main()
{
	add_mobile();
	display();
}
