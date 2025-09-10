void main()
{
	int no,temp,flag=0;
	printf("Enter the no to check :");
	scanf("%d",&no);
	for(temp=2;temp<no;temp++)
	{
		if(no%temp==0)
		{
			flag=1;
			
			break;
		}
	}
	if(flag==0)
		{	 
			printf("the given no is prime no\n");
		}
	else{
		printf("the given no is not prime no");
	}
}
