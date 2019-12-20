#include <iostream>
/*
Ohjelma muuttaa cup-mitan desilitroiksi (joko amerikkalainen cup tai brittil‰inen cup):
esitell‰‰n vakioina seuraavat vaihtokurssit:
VAIHTOKURSSIUS 2.37
VAIHTOKURSSIBRI 2.84
esitell‰‰n muut muuttujat
pyydet‰‰n k‰ytt‰j‰lt‰ muunnettava m‰‰r‰ ja otetaan vastaan
pyydet‰‰n valitsemaan 1. jos kyseess‰ on amerikkalainen mitta
pyydet‰‰n valitsemaan 2. jos kysess‰ on brittil‰inen mitta
otetaan valinta vastaan

jos (valinta on 1), lasketaan muunnos: annettu m‰‰r‰ (= oman muuttujan nimi)* VAIHTOKURSSIUS
muussa tapauksessa, lasketaan muunnos: annettu m‰‰r‰ (= oman muuttujan nimi) * VAIHTOKURSSIBRI

tulostetaan muunnoksen tulos
*/

#define VAIHTOKURSSIUS 2.37
#define VAIHTOKURSSIBRI 2.84

using namespace std;


int main()
{
	int valinta, tulos;
	double luku, cupKoko;
	char jatketaanko='k';
	
	cout << "\n";
	cout << "Cup -mitta desilitroiksi(dl)) -muunnin:\n";
	cout << "\n";
	
	while(jatketaanko == 'k')
	{
		system("cls");	//tyhjent‰‰ ruudun
		cout << "Valitse cup-versio\n";
		cout << "1. Amerikkalainen\n";
		cout << "2. Brittil‰inen\n\n";
		cin >> valinta;
	
		cout << "------------------\n\n";
	
	
		cout << "Syˆt‰ cup koko:";
	    cin >> cupKoko;
	
    
	    cout <<cupKoko<<"Kuppia on ";
	
	    if(valinta==1)
	    {
	    	tulos=cupKoko*VAIHTOKURSSIUS;
		}
		else
		{
			tulos=cupKoko*VAIHTOKURSSIBRI;
		}
	    cout << tulos;
	    cout << "\n Haluatko jatkaa (k/e): ";
	    cin >> jatketaanko;
	    cout << endl;
	    
				
	}
	

 
 
 
 
    return 0;
}
