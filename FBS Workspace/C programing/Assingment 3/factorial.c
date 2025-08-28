void main()
{
	int no,i=1,sum=1;
	printf("enter the no :");
	scanf("%d",&no);
	while(i<=no)
	{
		sum=sum*i;
		printf("%d\n",sum);
		i++;
		
	}
	printf("factorial of %d is %d",no,sum);
}
