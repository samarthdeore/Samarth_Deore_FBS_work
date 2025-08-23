void main()
{
	double s1,s2,s3;
	printf("Enter 3 sides of tringle.\n");
	printf("Enter 1st side of tringle:");
	scanf("%f",&s1);
	printf("Enter the 2nd side of tringle:");
	scanf("%f",&s2);
	printf("Enter the 3rd side of tringle:");
	scanf("%f",&s3);
	if(s1==s2&&s2==s3&&s3==s1)
		printf("the triangle is equilateral.");
		else if (s1==s2||s2==s3||s1==s3)
			printf("the triangle is isoscaeles.");
	else
	printf("the triangle is scalene.");
}
