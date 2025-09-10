void main()
{
	int no=121,r1,rev=0,temp=no;
	for(no=temp;no!=0;no=no/10)
	{
		r1=no%10;
		rev=rev*10+r1;
	}
	if (temp==rev)
	printf("the no %d is pallindrome",temp);
	else
	printf("the no %d is not pallindrome",temp);
}
