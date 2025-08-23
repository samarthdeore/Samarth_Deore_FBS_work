void main()
{
	int year;
	printf("enter the year:\n");
	scanf("%d",&year);
	year%4==0&&year%100!=0||year%400==0?
	printf("year is leep year"):printf("year is not leep year");
	
}
