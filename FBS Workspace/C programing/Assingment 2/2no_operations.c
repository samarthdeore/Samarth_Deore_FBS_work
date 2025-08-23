
void main()
{
	int a,b,ch;
	printf("Enter 2 no to perform the opratios\nEnter no 1:");
	scanf("%d",&a);
	printf("Enter no 2:");
	scanf("%d",&b);
	printf("Entre the operation no to perfrom\n1. + \n2. -\n3. /\n4. *\n5. mod%: \n");
	scanf("%d",&ch);
	if(ch==1)
		printf("%d+%d=%d",a,b,a+b);
	else if(ch==2)
		printf("%d-%d=%d",a,b,a-b);
	else if(ch==3)
	{
		double z;
		z=a/b;
		printf("%d/%d=%f",a,b,z);
	}
	else if(ch==4)
		printf("%d*%d=%d",a,b,a*b);
	else if (ch==5)
	{
		int w;
		w=a%b;
		printf("%d./.%d=%d",a,b,ch);
	}
	else
		printf("select the valid no to perform operation.");	
}
