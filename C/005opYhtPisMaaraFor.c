// C-koodia
// Ohjelma laskee oppilaan 5 koeteht‰v‰n yhteispistem‰‰r‰
// For -versio
#include <stdio.h>

int main(void)
{
	int tehtava, pisteet=0, summa=0;
	
	for(tehtava=1; tehtava<=5; tehtava++)
	{
		// Kun kutsutaan muuttujaa printf:ssa, niin siin‰ ei k‰ytet‰
		// & -merkki‰. & -merkki‰ k‰ytet‰‰n vaan scanf:issa
		printf("Anne %d teht‰v‰n pistem‰‰r‰: ", tehtava);
		scanf("%d", &pisteet);
		
		summa=summa+pisteet;
	}
	
	printf("Yhteispistem‰‰r‰ on %d\n", summa);
	
	
	
	
	return 0;
}
