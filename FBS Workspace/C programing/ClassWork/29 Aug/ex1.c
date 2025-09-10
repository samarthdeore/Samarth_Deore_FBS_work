void main()
{
	int no,i,j;
	printf("entre the n'th no:");
	scanf("%d",&no);
	for (i=1;i<=no;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf("%d",j);
		}

		if(i==no)
		continue;
		else
		printf("+");
	}
	printf("\n");
	for (i=1;i<=no;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf("A");
		}

		if(i==no)
		continue;
		else
		printf("+");
	}
	
}
