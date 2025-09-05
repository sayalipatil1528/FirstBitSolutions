#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct Book {
    int id;
    char name[100];
    char author[50];
    char category[50];
    float price;
    float rating;
} Book;

Book *books = NULL;
int bookCount = 0;

void addBook();
void removeBook();
void searchBook();
void updateBook();
void displayAllBook();
void showBooksByAuthor();
void showBooksByCategory();
void displayTopBooks();
void sortBooksByPrice();
void sortBooksByRating();

void main() {
    int choice = -1;

    while (choice != 0) {
        printf("\n Book Management System\n");
        printf("1. Add Book\n");
        printf("2. Remove Book\n");
        printf("3. Search Book\n");
        printf("4. Update Book\n");
        printf("5. Display All Books\n");
        printf("6. Show Book by Author\n");
        printf("7. Show Book by Category\n");
        printf("8. Display Sorted Book\n");
        printf("9. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 1) {
            addBook();
        } else if (choice == 2) {
            removeBook();
        } 
		else if (choice == 3) {
            searchBook();
		}
		else if (choice == 4) {
            updateBook();
		}
		else if (choice == 5) {
            displayAllBook();
		}
		else if (choice == 6) {
            showBooksByAuthor();
		}
		else if (choice == 7) {
            showBooksByCategory();
		}
		else if (choice == 8) {
            displayTopBooks();
		}
		else if (choice == 9) {
            printf("Exiting...\n");
            break;
        } else {
            printf("Invalid choice\n");
        }
    }

    // Free memory at the end of the program
    free(books);

}

void addBook() {
    if (books == NULL) {
        books = (Book *)malloc(sizeof(Book));
    } else {
        books = (Book *)realloc(books, (bookCount + 1) * sizeof(Book));
    }

    Book *b = &books[bookCount];

    printf("Enter ID: ");
    scanf("%d", &b->id);

    printf("Enter Book Name: ");
    scanf("%s", b->name);

    printf("Enter Author: ");
    scanf("%s", b->author);

    printf("Enter Category: ");
    scanf("%s", b->category);

    printf("Enter Price: ");
    scanf("%f", &b->price);

    printf("Enter Rating: ");
    scanf("%f", &b->rating);

    bookCount++;
    printf("Book added successfully\n");
}

void removeBook() {
    if (bookCount == 0) {
        printf("No books to remove!\n");
        return;
    }

    int id;
    printf("Enter ID of the book to remove: ");
    scanf("%d", &id);

    int found = 0;
    for (int i = 0; i < bookCount; i++) {
        if (books[i].id == id) {
            found = 1;
            for (int j = i; j < bookCount - 1; j++) {
                books[j] = books[j + 1];
            }
            bookCount--;

            if (bookCount == 0) {
                free(books);
                books = NULL;
            } else {
                books = (Book *)realloc(books, bookCount * sizeof(Book));
            }

            printf("Book removed successfully!\n");
            break;
        }
    }

    if (!found) {
        printf("Book not found!\n");
    }
}
void searchBook() {
    if (bookCount == 0) {
        printf("No Book available\n");
        return;
    }
        int id;
        printf("Enter id Number: ");
        scanf("%d", &id);
        for (int i = 0; i < bookCount; i++) {
            if (books[i].id == id) {
                printf("Found: ID:%d | Book Name:%s | Author:%s | Category:%s | Price:%f | Rating:%f\n",
                       books[i].id, books[i].name, books[i].author, books[i].category, books[i].price, books[i].rating);
                return;
            }
        }
    printf(" Book not found!\n");
}
void updateBook() {
    if (bookCount == 0) {
        printf("No Book available!\n");
        return;
    }
    int id;
    printf("Enter id  to update: ");
    scanf("%d", &id);

    for (int i = 0; i < bookCount; i++) {
        if (books[i].id == id) {
            printf("Enter New Price: ");
            scanf("%f", &books[i].price);
            printf("Enter New rating: ");
            scanf("%f", &books[i].rating);
            
            printf(" Book updated successfully \n");
            return;
        }
    }
    printf(" Book not found\n");
}

void displayAllBook() {
    if (bookCount == 0) {
        printf("No Book available\n");
        return;
    }
    printf("\n--- Book List ---\n");
    for (int i = 0; i < bookCount; i++) {
        printf("ID:%d | Book Name:%s | Author:%s | Category:%s | Price:%f | Rating:%f\n",
               books[i].id, books[i].name, books[i].author, books[i].category, books[i].price, books[i].rating);
    }
}

void showBooksByAuthor() {
    char author[100];
    int found = 0;
    printf("Enter Author Name: ");
    scanf("%s",&author);

    printf("Books by '%s':\n", author);
    for (int i = 0; i < bookCount; i++) {
        if (strcmp(books[i].author, author) == 0) {
            printf("ID: %d, Name: %s, Category: %s, Price: %f, Rating: %f\n",
                   books[i].id, books[i].name, books[i].category,
                   books[i].price, books[i].rating);
            found = 1;
        }
    }

    if (!found)
        printf("No books found by that author.\n");
}

void showBooksByCategory() {
    char category[100];
    int found = 0;
    printf("Enter Category: ");
    scanf("%s",&category);

    printf("Books in '%s' category:\n", category);
    for (int i = 0; i < bookCount; i++) {
        if (strcmp(books[i].category, category) == 0) {
            printf("ID: %d, Name: %s, Author: %s, Price: %f, Rating: %f\n",books[i].id, books[i].name, books[i].author,books[i].price, books[i].rating);
            found = 1;
        }
    }

    if (!found)
        printf("No books found in that category.\n");
}

void displayTopBooks()
{
    sortBooksByPrice();
    printf("\nTop 3 Books by Price:\n");
    for (int i = 0; i < bookCount && i < 3; i++) {
        printf("Name: %s, Price: %.f\n", books[i].name, books[i].price);
    }

    sortBooksByRating();
    printf("\nTop 3 Books by Rating:\n");
    for (int i = 0; i < bookCount && i < 3; i++) {
        printf("Name: %s, Rating: %.1f\n", books[i].name, books[i].rating);
    }
}

void sortBooksByPrice() {
    for (int i = 0; i < bookCount - 1; i++) {
        for (int j = i + 1; j < bookCount; j++) {
            if (books[j].price > books[i].price) {
                Book temp = books[i];
                books[i] = books[j];
                books[j] = temp;
            }
        }
    }
}

void sortBooksByRating() {
    for (int i = 0; i < bookCount - 1; i++) {
        for (int j = i + 1; j < bookCount; j++) {
            if (books[j].rating > books[i].rating) {
                Book temp = books[i];
                books[i] = books[j];
                books[j] = temp;
            }
        }
    }
}





