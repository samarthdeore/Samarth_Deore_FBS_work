void main()
{
	int ch;

	printf("1. To check number is even or odd. \n");
		printf("2. To check number is prime or not.\n");
		printf("3. To check number is pallindrome or not. \n");
		printf("4. To check number is positive, negative or zero.\n");
		printf("5. To reverse a number. \n");
		printf("6. To find sum of digits.\n");
		printf("0. Exit\n");
		printf("\nEnter your Choice:");
		scanf("%d",&ch);
	while(ch!=0)
	{	
		
		if(ch==1)
		{
			int no;
			printf ("enter the no to check");
			scanf("%d",&no);
			if(no%2==0)
			printf("no is even");
			else
			printf("no is odd");
			break;
		}
			
		else if(ch==2)
		{
			int no,temp=2,flag=0;
			printf("Enter the no to check :");
			scanf("%d",&no);
			while(temp<no)
			{
				if(no%temp==0)
				{
					flag=1;	
					break;
				}
				temp++;
			}
			if(flag==0)
			{	 
				printf("the given no is prime no\n");
			}
			else{
				printf("the given no is not prime no");
			}
			break;
		}
			
		else if(ch==3)
		{
			int no, r1, rev = 0;
  			printf("Enter a number: ");
  			scanf("%d", &no);
			int temp = no;
			while (no != 0)
			{
				r1 = no % 10;
				rev = rev * 10 + r1;
				no = no / 10;
			}
			if (temp == rev)
				printf("The number %d is a palindrome\n", temp);
			else
				printf("The number %d is not a palindrome\n", temp);
				break;
		}
			
		else if(ch==4)
		{
			int no;
			printf ("enter the no to check:");
			scanf("%d",&no);
			if (no<0)
				printf("the given no is negative no");
			else if(no>0)
				printf("the given no is positive no");
			else if(no==0)
				printf ("the given no is zero");
			break;			
		}
			
		else if(ch==5)
		{
			int num, rev = 0, rem;
			printf("Enter a number: ");
			scanf("%d", &num);
			while (num != 0)
			{
				rem = num % 10;        
				rev = rev * 10 + rem;
				num = num / 10;
			}
			printf("Reversed number = %d\n", rev);
			break;
		}
			
		else if(ch==6)
		{
			int s=1,e,sum=0;
			printf("enter the no:");
			scanf("%d",&e);
			while(s<=e)
			{
				sum=sum+s;
				s++;
			}
			printf("sum of numbers is %d",sum);
			break;
		}
			
		else if(ch!=0)
		{
			printf("Invalid Input");
			break;
		}
	}
		
}
