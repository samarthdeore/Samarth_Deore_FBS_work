void main()
{
	int no,i,j;
	printf("entre the n'th no:");
	scanf("%d",&no);
	for(i=1;i<=no;i++)
	{
		char ch='A';
		for (j=1;j<=no;j++)
		{
			if(i==j||i>=j)
				if(i%2==0)
					printf("%c",ch++);
				else
					printf("%d",j);
		}
		printf("\n");
	}
}
