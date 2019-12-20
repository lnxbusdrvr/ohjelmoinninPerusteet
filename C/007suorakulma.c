// C-koodia
#include <stdio.h>
#include <conio.h>  //jatketaanko -varten

int main(void)
{
	int leveys, korkeus, i, j;
	char merkki, jatketaanko;
	
	do
	{
		//tsystem("CLS"); //Ruudun tyhjennys, linuxissa system("clear");
		printf("Piirrän suorakulmion antamiesi mittojen ja haluamasi merkin mukaan.\n");
		
		printf("Anna leveys: \n");
		scanf("%d", &leveys);	//jos haluaa scanfissa double muuttujan, niin se on f-kirjain
								//ja char on c -merkki
		printf("Anna korkeus: \n");
		scanf("%d", &korkeus);
		
		printf("Anna merkki joka tulostetaan: ");
		scanf(" %c", &merkki);
		printf("\n");
		
		for(i=1; i<=korkeus; i++)
		{
			for(j=1; j<=leveys; j++)
			{
				printf("%c", merkki);
			}
			
			printf("\n");
		}
	
		printf("Jatketaanko (k/e): ");
		scanf(" %c", &jatketaanko);
		
	}while(jatketaanko=='k');
	
	
	
	
	return 0;
}
