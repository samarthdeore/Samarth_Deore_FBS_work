void main()
{
	int no,i,j;
	printf("entre the n'th no:");
	scanf("%d",&no);
	for(i=1;i<=no;i++)
	{
		for (j=1;j<=no;j++)
		{
			if(i==j||i>=j||i==1)
				printf("*");
		}
		printf("\n");
	}
	for(i=2;i<=no;i++)
	{
		for (j=1;j<=no;j++)
		{
						
			if(i==j||i<=j||i==no)
				printf("*");
		}

		printf("\n");
	}
}
