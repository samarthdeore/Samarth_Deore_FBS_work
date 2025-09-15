void main()
{
	int n,no=1;
	printf ("enter the nth no:");
	scanf("%d",&n);
	while(no<=n)
	{
		int sum=0,temp=no,rem,count=0,res,i;
	
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		temp=no;
		
		while(temp!=0)
		{
			res=1;
			rem=temp%10;
			for (i=0;i<count;i++)
			{
				
				res=res*rem;
				
			}
			sum=sum+res;
			temp=temp/10;
		}
		
		if(sum==no)
		{
			printf ("%d\n",no);
		}
		no++;
	}
}
