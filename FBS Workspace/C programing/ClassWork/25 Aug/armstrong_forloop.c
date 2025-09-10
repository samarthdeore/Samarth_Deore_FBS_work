void main()
{
	int no=154,sum=0,temp=no,r1;
	for(no=temp;no!=0;no=no/10)
	{
		r1=no%10;
		sum=sum+r1*r1*r1;
	}
	if(sum==temp)
	{
		printf ("it is armstrong no");
		
	}
	else
	printf("it is not armstrong no");
}
