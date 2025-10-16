void main()
{
	int i,j;
	char g[9]="samarth";
	for (i=0;i<9;i++){
		int count=0;
		for (j=0;j<9;j++){
			if(g[i]==g[j])
				count++;
		}
		printf("%c = %d\t",g[i],count);
		if(g[i]=='\0')
			break;	
	}
}
