void main()
{
	
	int no , sum = 0, temp , r1;
	printf("enter the no :");
	scanf("%d",&no);
	temp = no;
	
	while (no != 0)
	{
		r1 = no % 10;
		int i = 1, res = 1;
		while (i <= r1)
		{
			res = res * i;
			i++;
		}
		sum = sum + res;
		no = no / 10;
	}
	if(sum==temp)
	{
		printf("no is strong no");
		
	}
	else
	printf("no is not strong no");
}
