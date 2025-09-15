void main()
{
	int n,no=1;
	printf ("enter the nth no:");
	scanf("%d",&n);
	while(no<=n)
	{
		int sum = 0, temp , r=1;
		temp=no;
	
		while (r<no)
		{
			if(no%r==0)
			{
				sum=sum+r;
			}


			r++;		
		}
		if(sum==no)
		{
			printf("%d\n",no);
		}
		no++;
	}
}
