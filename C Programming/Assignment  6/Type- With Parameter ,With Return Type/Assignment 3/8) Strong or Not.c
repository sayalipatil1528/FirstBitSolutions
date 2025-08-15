#include<stdio.h>
int Is_Strong(int);

void main()
{
	int Num;
	printf("Enter a Number : ");
	scanf("%d",&Num);
	int res=Is_Strong(Num);
	if(res==1)
	 	printf("Strong Number");
	else
		printf("Not Strong Number");
	
	
}
int Is_Strong(int No)
{
	int rem,sum=0;
	int temp=No;
	while(temp>0)
	{
		rem=temp%10;
		int fact=1,i=1;
		while(i<=rem)
		{
			fact=fact*i;
		    
		    i++;
		}
		sum=sum+fact;
		temp=temp/10;
	}
	if(No==sum)
		return 1;
	else                                                                       
		return 0;
		
}

				







