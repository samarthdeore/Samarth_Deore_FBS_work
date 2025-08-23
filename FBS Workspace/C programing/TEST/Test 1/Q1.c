void main ()
{
	int hr,min,sec,total_sec;
	printf("enter the hr:\n");
	scanf("%d",&hr);
	printf("enter the min:\n");
	scanf("%d",&min);
	printf("enter the sec:\n");
	scanf("%d",&sec);
	total_sec=hr*60*60+min*60+sec;
	printf("%d",total_sec);
}
