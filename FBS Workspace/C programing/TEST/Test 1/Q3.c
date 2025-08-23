void main()
{
	int no,last,n1,n2,q1;
	printf("enter the no:\n");
	scanf("%d",&no);
	n1=no%10;
	q1=no/10;
	n2=q1%10;
	last=n2*10+n1;	
	printf("last 2 no=%d",last);
}
