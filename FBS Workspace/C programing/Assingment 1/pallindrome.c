void main()
{
	int no=121;
	int r1,r2,r3,q1,rev;
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	rev=r1*100+r2*10+r3;
	if(no==rev)
	printf("no is pallindrome");
	else
	printf("no is not pallindrome");
	
}
