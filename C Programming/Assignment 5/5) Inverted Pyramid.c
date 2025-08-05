#include<stdio.h>
#include<conio.h>
void main()
 {
	int n=5;
	for(int i=1; i<=n; i++) 
	{
	
		for(int j=1; j<=i; j++) 
			printf(" ");

			for(int k=0; k<=n-i; k++)
			
				printf("* ");
			printf("\n");
	}
}