void main()
{
	int no,i,j;
	printf("entre the n'th no:");
	scanf("%d",&no);
	for(i=1;i<=no;i++)
	{
		for (j=1;j<=no;j++)
		{
			if(i<=j)
				printf(" *");
			
			else 
			printf("  ");
		}
		for (j=2;j<=no;j++)
		{
			if(i+j==no+1||i+j<no+1)
			printf(" *");
			else
			printf("  ");
			
		}
		printf("\n");
	}
}
