// C-koodia
// Ohjelma laskee oppilaan 5 koeteht‰v‰n yhteispistem‰‰r‰
// do while -versio
#include <stdio.h>

int main(void)
{
	int tehtava=1, pisteet=0, summa=0;
	
	do
	{
		// Kun kutsutaan muuttujaa printf:ssa, niin siin‰ ei k‰ytet‰
		// & -merkki‰. & -merkki‰ k‰ytet‰‰n vaan scanf:issa
		printf("Anne %d teht‰v‰n pistem‰‰r‰: ", tehtava);
		scanf("%d", &pisteet);
		
		summa=summa+pisteet;
		//kasvatetaan laskuria
		tehtava++;
	}while(tehtava<=5);
	
	printf("Yhteispistem‰‰r‰ on %d\n", summa);
	
	
	
	
	return 0;
}
