void main()
{
	int n,no=2;
	printf ("enter the nth no:");
	scanf("%d",&n);
	while(no<=n)
	{
		int temp=2,flag=0;
		while(temp<no)
		{
			if(no%temp==0)
			{
				flag=1;
			
				break;
			}
		
			temp++;
		}
		if(flag==0)
		{	 
			printf("%d\n",no);
		}
		no++;
	}
}
