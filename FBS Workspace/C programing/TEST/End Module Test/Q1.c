void nFactorial(int n){
	int i,sum=1;
	for(i=1;i<n+1;i++)
	{
		sum=sum*i;
		printf("%d,",sum);
	}
}

void main()
{
	int n;
	printf ("enter the nth no to find factorial:");
	scanf("%d",&n);
	nFactorial(n);
}
