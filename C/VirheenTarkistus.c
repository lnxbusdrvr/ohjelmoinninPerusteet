#include <stdio.h>
int  main (void)
{
     int pistemaara;
     int summa=0;
     int lkm=0;
     
     while (lkm < 5)
     {
           printf("Anna pistem‰‰r‰: ");
           scanf("%d", &pistemaara);
           
           while (pistemaara <0 || pistemaara > 5)
           {
                 printf("Ei kelpaa, anna v‰lilt‰ 0-5:");
                 scanf("%d", &pistemaara);
                 
                 }
           summa+=pistemaara;
           lkm++;
           }
     printf("Pistem‰‰rien summa on %d\n", summa);
     
     
     system("pause");
     return 0;
     }
