void main()
{
	int no,i,j;
	printf("entre the n'th no:");
	scanf("%d",&no);
	printf("1");
	for (i=2;i<=no;i++)
	{
		if(i%2!=0)
		{
			printf("+%d",i);
		}
	}
}
