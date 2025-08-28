
void main()
{
	
	int no , sum = 0, temp , r=1;
	printf("enter the no :");
	scanf("%d",&no);
	temp=no;
	
	while (r<no)
	{
		if(no%r==0)
		{
			sum=sum+r;
		}


		r++;		
	}
	if(sum==temp)
	{
		printf("the no is perfect no");
	}
	else
	printf("the no is not perfect no");
}
