void main()
{
	double basic=10000;
	double totalsalary,da,ta,hra;
	if(basic<=5000)
	{
		da=basic*0.10;
		ta=basic*0.20;
		hra=basic*0.25;	
	}
	else{
		da=basic*0.15;
		ta=basic*0.25;
		hra=basic*0.30;
	}
	totalsalary=basic+da+ta+hra;
	printf("total salary of person is %f",totalsalary);
}
