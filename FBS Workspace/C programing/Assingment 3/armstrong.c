void main()
{
	int no,sum=0,temp,r1;
	printf("Enter the no to check :");
	scanf("%d",&no);
	temp=no;
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
