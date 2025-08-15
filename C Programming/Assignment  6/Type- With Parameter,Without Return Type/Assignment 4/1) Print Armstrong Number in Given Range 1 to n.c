#include<stdio.h>
void Is_Armstrong(int); //function declaration
void main()
{
	int No;
	printf("Enter a Number : ");
	scanf("%d",&No);
	Is_Armstrong(No); //function call
}
void Is_Armstrong(int Num)	
{

	for(int k=1;k<=Num;k++)
	{
	
		int no=k;
		
		int temp=no;
		int count=0;
		while(no>0)
		{
			count++;
			no=no/10;
		}
		no=temp;
		int sum=0,rem;
		while(no>0)
		{
			int res=1;
			rem=no%10;
			for(int i=1;i<=count;i++)
			res=res*rem;
			
			sum=sum+res;
			no=no/10;
		}
		if(temp==sum)
		{
			printf("%d is Armstrong Number \n",temp);
		}
	}
		
}