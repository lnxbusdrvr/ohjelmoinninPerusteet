/* C-koodia
*  Otetaan k‰ytt‰j‰lt‰ vastaan luvut
*  Lasketaan ne yhteen
*  ja tulostetaan summa k‰ytt‰j‰ll‰
*/
#include <stdio.h>

int main(void)
{
	//Esitell‰‰n muuttujat
	int luku1, luku2, summa;
	
	printf("Anna eka luku: ");
	//Otetaan vastaan, sama kuin lukija, tai std::cin
	//% kertoo paikan, d tarkoittaa, ett‰ kysyt‰‰n
	//int -tyyppist‰. Pilkku on sama, kuin + javassa, tai . php:ss‰
	//& -merkin avulla kutsutaan jokin muuttuja
	scanf("%d", &luku1);
	
	printf("Anna toka luku: ");
	scanf("%d", &luku2);
	
	//lasketaan normaalisti
	summa=luku1+luku2;
	
	printf("Lukujet summa on %d \n", summa);
	
	
	
	return 0;
}
