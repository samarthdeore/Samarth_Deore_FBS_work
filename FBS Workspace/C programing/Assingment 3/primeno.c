void main()
{
	int no,temp=2,flag=0;
	printf("Enter the no to check :");
	scanf("%d",&no);
	while(temp<no)
	{
		if(no%temp==0)
		{
			flag=1;
			
			break;
		}
		
		temp++;
	}
	if(flag==0)
		{	 
			printf("the given no is prime no\n");
		}
	else{
		printf("the given no is not prime no");
	}
}
