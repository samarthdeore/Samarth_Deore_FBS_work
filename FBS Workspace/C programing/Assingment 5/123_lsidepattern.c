void main()
{
	int no,i,j;
	printf("entre the n'th no:");
	scanf("%d",&no);
	for(i=1;i<=no;i++)
	{
		for (j=1;j<=no;j++)
		{
			if(i>=j)
				printf("%d",i);
		}
		printf("\n");
	}
}
