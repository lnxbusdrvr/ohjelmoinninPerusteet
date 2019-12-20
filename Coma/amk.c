#include <stdio.h>

int main(void)
{
     int n = 0, i = 0, y = 1;
	while(n < 5)
	{
	   printf("i on numero %d\n%d", i, i);
	   i = i + 2;
	   printf(" + 2 on numero %d\n", i);
           printf("%d ", y);
	   y = y * i;
           printf("kerta %d\n", i);
	   printf("Tulosta y joka on %d\n", y);

	   printf("n on numero %d\n%d", n, n);
           n = n + 1;
	   printf(" + 1 on %d\n", n);
           printf("Mennään silmukan alkuun\n\n");
        }
}

