void main()
{
	int mark;
	printf("enter the marks:");
	scanf("%d",&mark);
	if(mark>75)
	printf("Distinction");
	else if(mark>65)
	printf("First Class");
	else if(mark>55)
	printf("Second Class");
	else if(mark>=40)
	printf("Pass Class");
	else 
	printf("Fail");
}
