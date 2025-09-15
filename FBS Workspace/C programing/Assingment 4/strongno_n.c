void main()
{
	int n,no=1;
	printf ("enter the nth no:");
	scanf("%d",&n);
	while(no<=n)
	{
		int sum = 0, temp , r1;
		temp = no;
	
		while (temp != 0)
		{
			r1 = temp % 10;
			int i = 1, res = 1;
			while (i <= r1)
			{
				res = res * i;
				i++;
			}
			sum = sum + res;
			temp = temp / 10;
		}
		if(sum==no)
			printf("%d\n",no);
		
		no++;
	}
}
