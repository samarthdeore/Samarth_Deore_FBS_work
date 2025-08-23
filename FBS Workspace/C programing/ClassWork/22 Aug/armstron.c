void main()
{
	int no=153,sum,temp=no,r1,x=0;
	while(no!=0)
	{
		r1=no%10;
		sum=r1*3;
		
		no=no/10;
		printf("%d\n",sum);
	}
	if(x==temp)
	{
		printf ("it is armstrong no");
		
	}
	else
	printf("it is not armstrong no");
}
