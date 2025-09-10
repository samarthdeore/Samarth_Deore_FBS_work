void main()
{
	int no=145,sum=0,temp=no,r1,res=1;
	for(no=temp;no!=0;no=no/10)
	{
		r1=no%10;
		int i;
		for(i=1;i<r1;i++)
		{
			res=r1*i;
			printf("%d\n",res);
		}
	}
}
