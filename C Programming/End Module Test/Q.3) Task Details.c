#include<stdio.h>
#include<string.h>
#include<stdlib.h>
typedef struct Task
{
	int taskId;
	char des[20];
	char status[10];
}Task;

Task *t=NULL;
int n=0;

void add();
void update();
void display();
void main()
{
	int choice=-1;
	while(choice!=0)
	{
		
		printf("Task Details\n");
		printf("1.Add Task Details\n");
		printf("2.Update Task Details\n");
		printf("3.Display Task Details\n");
		
		printf("\nEnter a choice : ");
		scanf("%d",&choice);
	
		if(choice==1)
		{
			add();
		}
		else if(choice==2)
		{
			update();
		}
		else if(choice==3)
		{
			display();
		}
		else
		{
			printf("Invalid choice\n");
		}
	}
}
void add()
{
	t=(Task*)realloc(t,(n+1)*sizeof(Task));
	printf("Enter task id : ");
	scanf("%d",&t[n].taskId);
	printf("Enter Description : ");
	scanf("%s",t[n].des);
	printf("Enter Status : ");
	scanf("%s",t[n].status);
	
	printf("Details added successfully\n");
	n++;

}
void update()
{
	int id;
	printf("Enter Id : ");
	scanf("%d",&id);
	
	for(int i=0;i<n;i++)
	{
		if(t[i].taskId==id)
		{
			printf("Enter new Description : ");
			scanf("%s",t[i].des);
			
			printf("Enter new Status : ");
			scanf("%s",t[i].status);
		}
	}
}
void display()
{
	for(int i=0;i<n;i++)
	{
		printf("\nTask Id : %d\n",t[i].taskId);
		printf("Description : %s\n",t[i].des);
		printf("Status : %s\n",t[i].status);
	}
}