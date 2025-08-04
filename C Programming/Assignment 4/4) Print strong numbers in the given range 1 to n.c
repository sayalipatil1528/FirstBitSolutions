#include <stdio.h>
#include<conio.h>
void main() 
{
    int no;
    
    printf("Enter a no : ");
	scanf("%d",&no);
    
    printf("Strong numbers from 1 to 10 are: ");

    for (int i = 1; i <= no; i++) {
        int temp = i;
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            int fact= 1;
            
            for (int j = 1; j <= rem; j++) {
                fact=fact*j;
            }
            sum =sum+ fact;
            temp =temp/ 10;
        }

        if (sum == i) {
            printf("%d ", i);
        }
    }
    
}