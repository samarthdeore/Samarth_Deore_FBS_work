void main()
{
	int no,i,j;
	printf("entre the n'th no:");
	scanf("%d",&no);
	for(i=1;i<=no;i++)
	{
		for (j=1;j<=no;j++)
		{
			if(i==j||i<=j)
				printf("*");
		}
		printf("\n");
	}
}
