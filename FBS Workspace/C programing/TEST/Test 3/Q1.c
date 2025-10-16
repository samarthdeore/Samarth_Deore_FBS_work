void main()
{
	int st,end,i;
	printf("enter the starting no:");
	scanf("%d",&st);
	printf("enter the ending no:");
	scanf("%d",&end);
	printf("the even no are :\n");
	for (i=st;i<end+1;i++){
		if(i%2==0)
		printf("\n%d",i);
	}
	printf("\nodd numbers are:\n");
	for (i=st;i<end+1;i++){
		if(i%2!=0)
		printf("\n%d",i);
	}
}
