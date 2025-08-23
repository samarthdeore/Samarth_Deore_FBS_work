void main()
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
	printf("Average of 5 numbers is %d",avg);
}
