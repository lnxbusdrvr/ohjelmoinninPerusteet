#include <stdio.h>
int main (void)
{
    int syotetty_luku, nelio;
    
    do
    {
        printf("Sy�t� jokin kok.luku, lop. negatiivisella luvulla: ");
        scanf("%d", &syotetty_luku);
        
        nelio=syotetty_luku*syotetty_luku;
        
        if (syotetty_luku >0)
        {
                printf("Antamasi luvun neli�: %d\n", nelio);          
                          
                          }
        else     {
             printf("Ohjelma lopetetaan...\n");
             }
        
        }while (syotetty_luku >0);
    
    
    system ("pause");
    return 0;
    }
