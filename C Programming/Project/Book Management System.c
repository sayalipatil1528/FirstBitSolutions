#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Book
{
	int bookId;
	char bname[20];
	char authorname[20];
	char category[20];
	double price;
	double rating;
}Book;

Book* books=NULL;
int count=2;

void addBook();
void removeBook();
void searchBook();
void showBookByAuthor();
void showBookByCategory();
void update();
void displayTop3Books();
void sortBookByPrice();
void sortBookByRating();
void displayAllBook();
void main()
{
	int choice;
	
	books=(Book*)malloc(sizeof(Book)*count);
	
	books[0].bookId=1;
	strcpy(books[0].bname,"abc");
	strcpy(books[0].authorname,"abc");
	strcpy(books[0].category,"abc");
	books[0].price=100;
	books[0].rating=10;
	
	books[1].bookId=2;
	strcpy(books[1].bname,"xyz");
	strcpy(books[1].authorname,"xyz");
	strcpy(books[1].category,"xyz");
	books[1].price=110;
	books[1].rating=15;
	
	
	
	while(choice != 9)
	{
		printf("\nBook Management System\n\n");
		printf("1.Add Book\n");
		printf("2.Remove Book\n");
		printf("3.Search Book\n");
		printf("4.Show Author's Books\n");
		printf("5.Show Category's Books\n");
		printf("6.Update Book\n");
		printf("7.Display Sorted Book\n");
		printf("8.Display All Books\n");
		printf("9.Exit\n");
		
		printf("\nEnter a choice : \n");
		scanf("%d",&choice);
		
		if(choice==1)
		{
			addBook();
		}
		else if(choice==2)
		{
			removeBook();
		}
		else if(choice==3)
		{
			searchBook();
		}
		else if(choice==4)
		{
			showBookByAuthor();
		}
		else if(choice==5)
		{
			showBookByCategory();
		}
		else if(choice==6)
		{
			update();
		}
		else if (choice==7) 
		{
            displayTop3Books();
		}
		else if(choice==8)
		{
			displayAllBook();
		}
		else if(choice==9)
		{
			exit;
		}
		else
		{
			printf("Invalid choice\n");
		}
		
	}
	
}
void addBook()
{
	
	int n_Id;
	printf("Enter New Id : ");
	scanf("%d",&n_Id);
	
	for(int i=0;i<count;i++)
	{
		if(books[i].bookId==n_Id)
		{
			printf("Book with this Id already exist.Please enter unique id.");
			return;
		}
	}
	
	books=(Book*)realloc(books,(count+1)*sizeof(Book));
	
	books[count].bookId=n_Id;
	
	printf("Enter Book name : ");
	scanf("%s",books[count].bname);
	
	printf("Enter Author name : ");
	scanf("%s",books[count].authorname);
	
	printf("Enter Category : ");
	scanf("%s",books[count].category);
	
	printf("Enter Price : ");
	scanf("%lf",&books[count].price);
	
	printf("Enter Rating : ");
	scanf("%lf",&books[count].rating);
	
	count++;
	
	printf("\nBook added successfull..\n");

}

void removeBook()
{
	int id;
	printf("\nEnter Id to remove a book : ");
	scanf("%d",&id);
	
	int found=0;
	for(int i=0;i<count;i++)
	{
		if(books[i].bookId==id)
		{
			found=1;
			for(int j=i;j<count-1;j++)
			{
				books[j]=books[j+1];
			}
			count--;
			books=realloc(books,sizeof(Book)*count);
			break;
		}
	}
	if(found==0)
		printf("Book not found...\n");
	else
		printf("Book removed...\n");
}

void searchBook()
{
	int choice;
	printf("Enter Choice 1.Search by Id\n 2.Search by Name\nChoose : ");
	scanf("%d",&choice);
	
	if(choice==1)
	{
		int id,found=0;
		printf("\nEnter Id to search book : ");
		scanf("%d",&id);
	
		for(int i=0;i<count;i++)
		{
			if(books[i].bookId==id)
			{
				found=1;
				printf("Book Id : %d || Name : %s || Author : %s || Category : %s || Price : %lf || Rating : %lf\n",books[i].bookId,books[i].bname,books[i].authorname,books[i].category,books[i].price,books[i].rating);
			}
		}
		if(found==0)
		printf("Book not found...\n");
	
	}
	
	else if(choice==2)
	{
		char name[20];
		printf("Enter a name to search book : ");
		scanf("%s",name);
		
		int found=0;
		for(int i=0;i<count;i++)
		{
			if(strcmp(books[i].bname,name)==0)
			{
				found=1;
				printf("Book Id : %d || Name : %s || Author : %s || Category : %s || Price : %lf || Rating : %lf\n",books[i].bookId,books[i].bname,books[i].authorname,books[i].category,books[i].price,books[i].rating);

			}
		}
		if(found==0)
		printf("Book not found...\n");
	}
	else
	{
		printf("Invalid choice\n");
	}
}

void showBookByAuthor()
{
	char author[20];
	printf("Enter Author : ");
	scanf("%s",author);
	
	int found=0;
	for(int i=0;i<count;i++)
	{
		if(strcmp(books[i].authorname,author)==0)
		{
			found=1;
			printf("Book Id : %d || Name : %s || Author : %s || Category : %s || Price : %lf || Rating : %lf\n",books[i].bookId,books[i].bname,books[i].authorname,books[i].category,books[i].price,books[i].rating);
		}
	}
	if(found==0)
		printf("Book not found...\n");
}

void showBookByCategory()
{
	char category[20];
	printf("Enter Category : ");
	scanf("%s",category);
	
	int found=0;
	for(int i=0;i<count;i++)
	{
		if(strcmp(books[i].category,category)==0)
		{
			found=1;
			printf("Book Id : %d || Name : %s || Author : %s || Category : %s || Price : %lf || Rating : %lf\n",books[i].bookId,books[i].bname,books[i].authorname,books[i].category,books[i].price,books[i].rating);
		}
	}
	if(found==0)
		printf("Book not found...\n");
}

void update()
{
	int id,found=0;
	printf("\nEnter a Id to Update data : ");
	scanf("%d",&id);
	
	for(int i=0;i<count;i++)
	{
		if(books[i].bookId==id)
		{
			found=1;
			printf("\nEnter New Price : ");
			scanf("%lf",&books[i].price);
			
			printf("\nEnter New Rating : ");
			scanf("%lf",&books[i].rating);
			
			printf("Data Updated...\n");
		}
	}
	if(found==0)
		printf("Book not found...\n");
}

void displayTop3Books()
{
	sortBookByPrice();
	printf("\nTop 3 Books by Price : \n");
	for(int i=0;i<count && i<3;i++)
	{
		printf("Name : %s || Price : %lf\n",books[i].bname,books[i].price);
	}
	
	sortBookByRating();
	printf("\nTop 3 Books by Rating : \n");
	for(int i=0;i<count && i<3;i++)
	{
		printf("Name : %s || Rating : %lf\n",books[i].bname,books[i].rating);
	}
}

void sortBookByPrice()
{
	for(int i=0;i<count-1;i++)
	{
		for(int j=i+1;j<count;j++)
		{
			if(books[j].price>books[i].price)
			{
				Book temp=books[i];
				books[i]=books[j];
				books[j]=temp;
			}
		}
	}
}

void sortBookByRating()
{
	for(int i=0;i<count-1;i++)
	{
		for(int j=i+1;j<count;j++)
		{
			if(books[j].rating>books[i].rating)
			{
				Book temp=books[i];
				books[i]=books[j];
				books[j]=temp;
			}
		}
	}
}

void displayAllBook()
{
	for(int i=0;i<count;i++)
	{
		printf("Book Id : %d || Name : %s || Author name : %s || Category : %s || Price : %lf || Rating : %lf\n",books[i].bookId,books[i].bname,books[i].authorname,books[i].category,books[i].price,books[i].rating);
	}
}