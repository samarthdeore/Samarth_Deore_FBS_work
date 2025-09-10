void main()
{
	int no=11111,sum=0,r1;
	while(no!=0)
	{
		r1=no%10;
		sum=sum+r1;
		no=no/10;
	}
	printf("sum of digits is %d",sum);
}
