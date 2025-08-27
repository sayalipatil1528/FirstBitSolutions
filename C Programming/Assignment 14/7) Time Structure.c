#include<stdio.h>
struct Time
{
	int hour;
	int min;
	int sec;
};
struct Time store();
void display(struct Time);
void main()
{
	struct Time t1,t2;
	
	t1.hour=2;
	t1.min=30;
	t1.sec=67;

	printf("Enter Details of Time 2 : \n");
	t2=store();
	
	printf("Details of Time : \n");
	display(t1);
	display(t2);
}
struct Time store()
{
	struct Time temp;
	scanf("%d",&temp.hour);
	scanf("%d",&temp.min);
	scanf("%d",&temp.sec);
	return temp;
}
void display(struct Time t)
{
	printf("%d : %d : %d\n",t.hour,t.min,t.sec);
}