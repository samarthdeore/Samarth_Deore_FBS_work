void main ()
{
	int unit;
	printf ("enter the unit of month:");
	scanf("%d",&unit);
	if(unit>=1&&unit<=50)
	{
		unit =unit * 30;
		printf ("your electricity bill is %d Rs.",unit);
	}
	else if(unit>=51&&unit<=150)
	{
		unit =unit * 40;
		printf ("your electricity bill is %d Rs.",unit);
	}
	else if(unit>=151)
	{
		unit =unit * 50;
		printf ("your electricity bill is %d Rs.",unit);
	}
}
