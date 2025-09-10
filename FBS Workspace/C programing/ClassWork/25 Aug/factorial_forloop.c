void main()
{
	int no,i,sum=1;
	printf("enter the no :");
	scanf("%d",&no);
	for(i=1;i<=no;i++)
	{
		sum=sum*i;
	}
	printf("factorial of %d is %d",no,sum);
}
