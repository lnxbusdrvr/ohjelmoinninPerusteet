// C-koodia
// switch case esimerkki
#include <stdio.h>

int main(void)
{
	int numero;
	
	printf("Anna numero väliltä 1-6: ");
	scanf("%d", &numero);
	
	switch(numero)
	{
		case 1: //C:ssä pitää käyttä case:n kohdalla aaltosulkuja
		    {
		    	printf("Annoit numeron %d", numero);
		    	break;
			}
		
		case 2:
			{
				printf("Annoit numeron %d", numero);
				break;
			}
		
		case 3:
			{
				printf("Annoit numeron %d", numero);
				break;
			}
		
		case 4:
			{
				printf("Annoit numeron %d", numero);
				break;
			}
		
		case 5:
			{
				printf("Annoit numeron vünf eli %d", numero);
				break;
			}
		
		case 6:
			{
				printf("Annoit numeron seis, eli numero %d:en", numero);
				break;
			}
		default:
			{
				printf("Scheiße das war nicht Nqumber aus ein für sechst");
				break;
			}
	}
	
	
	
	
	return 0;
}
