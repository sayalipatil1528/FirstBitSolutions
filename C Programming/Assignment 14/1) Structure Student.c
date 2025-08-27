#include<stdio.h>
#include<string.h>
struct student
{
	int rollno;
	char name[10];
	int marks;
};
struct student storeStudent();
void displayStudent(struct student);
void main()
{
	struct student s1,s2;
	
	s1.rollno=101;
	strcpy(s1.name,"ABC");
	s1.marks=76;
	
	printf("Enter Details of Student 2 : \n");
	s2=storeStudent();
	
	printf("Details of student are : \n");
	displayStudent(s1);
	displayStudent(s2);
}
struct student storeStudent()
{
	struct student temp;
	scanf("%d",&temp.rollno);
	scanf("%s",temp.name);
	scanf("%d",&temp.marks);
	return temp;
}
void displayStudent(struct student stud)
{
	printf("\nRoll No = %d\n",stud.rollno);
	printf("Name = %s\n",stud.name);
	printf("Marks = %d\n",stud.marks);
}