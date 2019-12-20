// C-koodia
// Ohjelma laskee oppilaan 5 koeteht‰v‰n yhteispistem‰‰r‰
// do while -versio
#include <stdio.h>

int LaskePisteet(int pisteet);

int main(void)
{
	int  yhteensa, pisteet=0;
	

	printf("Kutsutaan aliohjelma: \n");
	// Kutsutaan aliohjelma
	yhteensa=LaskePisteet(pisteet);
	
	//Tulostetaan aliohjelman returnlause
	printf("Yhteispistem‰‰r‰ on %d\n", yhteensa);
	
	
	
	
	return 0;
}


// Aliohjelman toteutus
int LaskePisteet(int pisteet)
{
	int tehtava=1, summa=0;	//Jos summa ei ole alustettu(initialized), niin
							//returniin lis‰t‰‰n 1 numero
	do
	{
		// Kun kutsutaan muuttujaa printf:ssa, niin siin‰ ei k‰ytet‰
		// & -merkki‰. & -merkki‰ k‰ytet‰‰n vaan scanf:issa
		printf("Anna %d teht‰v‰n pistem‰‰r‰: ", tehtava);
		scanf("%d", &pisteet);
		
		summa=summa+pisteet;
		//kasvatetaan laskuria
		tehtava++;
	}while(tehtava<=5);
	return summa;
}
