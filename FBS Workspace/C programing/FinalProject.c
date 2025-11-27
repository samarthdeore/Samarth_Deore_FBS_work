#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct Book {
	int BookId;
	char name[50];
	char author[50];
	char category[50];
	double price;
	double rating;
};

struct Book *book = NULL;
int bookCount = 5;
int bookCapacity = 30;

void Store() {
	int i;
	book = (struct Book*)malloc(bookCapacity*sizeof(struct Book));

	book[0].BookId = 1;
	strcpy(book[0].name,"The Alchemist");
	strcpy(book[0].author,"Paulo Coelho");
	strcpy(book[0].category, "Fiction");
	book[0].price = 12.99;
	book[0].rating = 4.7;

	book[1].BookId = 2;
	strcpy(book[1].name, "1984");
	strcpy(book[1].author, "George Orwell");
	strcpy(book[1].category, "Dystopian");
	book[1].price = 10.50;
	book[1].rating = 4.8;

	book[2].BookId = 3;
	strcpy(book[2].name, "Sapiens");
	strcpy(book[2].author, "Yuval Noah Harari");
	strcpy(book[2].category, "History");
	book[2].price = 18.25;
	book[2].rating = 4.6;

	book[3].BookId = 4;
	strcpy(book[3].name, "To Kill a Mockingbird");
	strcpy(book[3].author, "Harper Lee");
	strcpy(book[3].category, "Classic");
	book[3].price = 9.99;
	book[3].rating = 4.9;

	book[4].BookId = 5;
	strcpy(book[4].name, "Atomic Habits");
	strcpy(book[4].author, "James Clear");
	strcpy(book[4].category, "Self-help");
	book[4].price = 16.00;
	book[4].rating = 4.8;

//	printf("--- Books Stored ---\n");
//	for(i=0; i<bookCount; i++) {
//		printf("Book ID = %d\n",book[i].BookId);
//		printf("Name = %s\n",book[i].name);
//		printf("Author = %s\n",book[i].author);
//		printf("Category = %s\n",book[i].category);
//		printf("Price = %.2lf\n",book[i].price);
//		printf("Rating = %.1lf\n\n",book[i].rating);
//	}
}

void addBook() {
	if (bookCount>=bookCapacity) {
		bookCapacity *= 2;
		book = (struct Book*)realloc(book,bookCapacity*sizeof(struct Book));
		if (book == NULL) {
			printf("Memory reallocation failed!\n");
			exit(1);
		}
		printf("Book capacity increased to %d.\n", bookCapacity);
	}

	printf("Enter the Book ID: ");
	scanf("%d",&book[bookCount].BookId);
	printf("Enter the Name of the Book: ");
	scanf(" %[^\n]",book[bookCount].name);
	printf("Enter the Author of the Book: ");
	scanf(" %[^\n]",book[bookCount].author);
	printf("Enter the Category of the Book: ");
	scanf(" %[^\n]",book[bookCount].category);
	printf("Enter the Price of the Book: ");
	scanf("%lf",&book[bookCount].price);
	printf("Enter the Rating of the Book: ");
	scanf("%lf",&book[bookCount].rating);
	bookCount++;
	printf("Book added successfully.\n");
}

void sdisplay(int i) {
	printf("Book ID = %d\n",book[i].BookId);
	printf("Name = %s\n",book[i].name);
	printf("Author = %s\n",book[i].author);
	printf("Category = %s\n",book[i].category);
	printf("Price = %.2lf\n",book[i].price);
	printf("Rating = %.1lf\n\n",book[i].rating);
}

void display() {
	int i;
	if (bookCount==0) {
		printf("There is no data to print.\n");
		return;
	}
	printf("--- Book List ---\n");
	for(i=0; i<bookCount; i++) {
		sdisplay(i);
	}
}

void searchBook() {
	int bid, flag=-1, i, ch;
	printf("1. By Book Id\n2. By Book Name\nEnter your choice: ");
	scanf("%d",&ch);
	if(ch==1) {
		printf("Enter the Book id to search: ");
		scanf("%d",&bid);
		for(i=0; i<bookCount; i++) {
			if(book[i].BookId==bid) flag=i;
		}
		if (flag==-1){
			int choi;
			do{
			
			printf("The id you intered is not found!");
			printf("1.To continue\n");
			printf("2. for go to dashboard\n");
			printf("3. to exit");
			printf("enter your choice:");
			scanf("%d",&choi);
			if(choi==1)
				searchBook();
			else if(choi==2)
				return;
			}while(choi!=3);
				
		}
			
		else {
			printf("Book found:\n");
			sdisplay(flag);
		}
	} else if(ch==2) {
		char name[50];
		printf("Enter the Book Name to search: ");
		scanf(" %[^\n]",name);
		for(i=0; i<bookCount; i++) {
			if(strcasecmp(book[i].name,name)==0) flag=i;
		}
		if (flag==-1)
			printf("Book not found\n");
		else {
			printf("Book found:\n");
			sdisplay(flag);
		}
	} else
		printf("Invalid choice!\n");
}

void SearchByAuthor() {
	int flag=0,i;
	char name[50];
	printf("Enter the Author Name to search: ");
	scanf(" %[^\n]",name);
	for(i=0; i<bookCount; i++) {
		if(strcasecmp(book[i].author,name)==0) {
			if (flag==0)
				printf("Books by author %s:\n",name);
			sdisplay(i);
			flag++;
		}
	}
	if (flag==0)
		printf("Author not found\n");
}

void SearchByCategory() {
	int flag=0,i;
	char name[50];
	printf("Enter the Category Name to search: ");
	scanf(" %[^\n]",name);
	for(i=0; i<bookCount; i++) {
		if(strcasecmp(book[i].category,name)==0) {
			if (flag==0)
				printf("Books in category %s:\n",name);
			sdisplay(i);
			flag++;
		}
	}
	if (flag==0)
		printf("Category not found\n");
}

void removeBook() {
	int i,j,id,flag=0;
	printf("Enter the Book ID to remove: ");
	scanf("%d",&id);
	for(i=0; i<bookCount; i++) {
		if(book[i].BookId==id) {
			flag=1;
			for(j=i; j<bookCount-1; j++) {
				book[j]=book[j+1];
			}
			bookCount--;
			break;
		}
	}
	if(flag==0)
		printf("Book ID not found!\n");
	else {
		printf("Book removed successfully.\n");
		display();
	}
}

void updateBook() {
	int i,bid,flag=-1;
	printf("Enter the Book ID to update: ");
	scanf("%d",&bid);
	for(i=0; i<bookCount; i++) {
		if(book[i].BookId==bid)
			flag=i;
	}
	if (flag==-1)
		printf("Book not found\n");
	else {
		printf("Enter the Name of the Book: ");
		scanf(" %[^\n]",book[flag].name);
		printf("Enter the Author of the Book: ");
		scanf(" %[^\n]",book[flag].author);
		printf("Enter the Category of the Book: ");
		scanf(" %[^\n]",book[flag].category);
		printf("Enter the Price of the Book: ");
		scanf("%lf",&book[flag].price);
		printf("Enter the Rating of the Book: ");
		scanf("%lf",&book[flag].rating);
		printf("Book updated successfully.\n");
		sdisplay(flag);
	}
}

void sortBook() {
	int choice;
	struct Book temp;
	int i,j;
	printf("\n--- Sort Books ---\n");
	printf("1. Sort by Price (Low to High)\n");
	printf("2. Sort by Price (High to Low)\n");
	printf("3. Sort by Rating (Low to High)\n");
	printf("4. Sort by Rating (High to Low)\n");
	printf("Enter your choice: ");
	scanf("%d", &choice);
	switch(choice) {
		case 1:
			for(i=0; i<bookCount-1; i++)
				for(j=i+1; j<bookCount; j++)
					if(book[i].price > book[j].price) {
						temp = book[i];
						book[i] = book[j];
						book[j] = temp;
					}
			printf("\nBooks sorted by Price (Low to High):\n");
			display();
			break;
		case 2:
			for(i=0; i<bookCount-1; i++)
				for(j=i+1; j<bookCount; j++)
					if(book[i].price < book[j].price) {
						temp = book[i];
						book[i] = book[j];
						book[j] = temp;
					}
			printf("\nBooks sorted by Price (High to Low):\n");
			display();
			break;
		case 3:
			for(i=0; i<bookCount-1; i++)
				for(j=i+1; j<bookCount; j++)
					if(book[i].rating > book[j].rating) {
						temp = book[i];
						book[i] = book[j];
						book[j] = temp;
					}
			printf("\nBooks sorted by Rating (Low to High):\n");
			display();
			break;
		case 4:
			for(i=0; i<bookCount-1; i++)
				for(j=i+1; j<bookCount; j++)
					if(book[i].rating < book[j].rating) {
						temp = book[i];
						book[i] = book[j];
						book[j] = temp;
					}
			printf("\nBooks sorted by Rating (High to Low):\n");
			display();
			break;
		default:
			printf("Invalid choice!\n");
	}
}

void main() {
	Store();
	int ch;
	do {
		printf("\n--- Book Management Menu ---\n");
		printf("1. Add Book\n");
		printf("2. Display Books\n");
		printf("3. Search Book\n");
		printf("4. Search by Author\n");
		printf("5. Search by Category\n");
		printf("6. Remove Book\n");
		printf("7. Update Book\n");
		printf("8. Sort Books\n");
		printf("9. Exit\n");
		printf("Enter your choice: ");
		scanf("%d", &ch);
		switch(ch) {
			case 1:
				addBook();
				break;
			case 2:
				display();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				SearchByAuthor();
				break;
			case 5:
				SearchByCategory();
				break;
			case 6:
				removeBook();
				break;
			case 7:
				updateBook();
				break;
			case 8:
				sortBook();
				break;
			case 9:
				printf("Exiting the program.\n");
				break;
			default:
				printf("Invalid choice!\n");
		}
	} while(ch!=9);
}
