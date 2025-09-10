void main()
{
	int no=153,sum=0,temp=no,r1;
	while(no!=0)
	{
		r1=no%10;
		sum=sum+r1*r1*r1;
		no=no/10;
	}
	if(sum==temp)
	{
		printf ("it is armstrong no");
		
	}
	else
	printf("it is not armstrong no");
}
