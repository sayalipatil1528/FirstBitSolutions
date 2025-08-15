#include<stdio.h>
int Person(int);

void main()
{
	int age;
	printf("Enter Age : ");
	scanf("%d",&age);
	int res=Person(age);
	if(res==1)
		printf("Person is Child");
	else if(res==2)
		printf("Person is Teenager");
	else if(res==3)
		printf("Person is Adult");
	else
		printf("Person is Senior");
	
}
int Person(int age)
{
	if(age<=12)
		return 1;
		
	else if(age>12 && age<=19)
		return 2;
		
	else if(age>=20 && age<=59)
		return 3;	
		
	else
	 	return 4;
		
}

				