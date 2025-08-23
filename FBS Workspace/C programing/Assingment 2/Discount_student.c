#include<stdio.h>
void main()
{
	int price,discount,final_price;
	char y=1,student;
	printf ("enter the price:");
	scanf("%d",&price);
	fflush(stdin);
	printf("for student type y or for others type n:");
	scanf("%c",&student);
	if(student=='y')
	{
		if(price>=500)
		{
			discount=price*0.20;
			final_price=price-discount;
			printf("Discounted price is %d and Discount is %d",final_price,discount);
		}
		else
		{
			discount=price*0.10;
			final_price=price-discount;
			printf("Discounted price is %d and Discount is %d",final_price,discount);
		}
	}
	else
	{
		if(price>=600)
		{
			discount=price*0.15;
			final_price=price-discount;
			printf("Discounted price is %d and Discount is %d",final_price,discount);
		}
		else 
		printf("there is not a discount pay %d",price);
	}
	
}
