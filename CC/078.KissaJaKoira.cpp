#include <iostream>
#include <cstdlib>  // ISOT kirjaimet

/*
Lemmikkieläinten vakuutustoimisto:
Muuttujien esittely

muuttujien esittely

Menu
Tulostetaan: Lemmikkieläinten vakuutustoimisto
Tulostetaan: Valitse lemmikki:
A=Koira
B=Kissa
C=Lintu
D=Matelija

Pyydetään tekemään valinta, otetaan vastaan
valinta=toupper(valinta); //muuttaa käyttäjän mahdollisesti antaman pienen kirjaimen isoksi

    switch(valinta)
           case A ja B:

kysytään, onko leikattu (K/E), otetaan vastaan
leikattu=toupper(leikattu); //muuttaa käyttäjän mahdollisesti antaman pienen kirjaimen isoksi

jos (leikattu on K ja valinta on A)
tulostetaan: Leikattu koira: vakuutusmaksu on 50 €
jos taas (leikattu on E ja valinta on A)
tulostetaan: Leikkaamaton koira: vakuutusmaksu on 80 €
jos taas (leikattu on K ja valinta on B)
tulostetaan: Leikattu kissa: vakuutusmaksu on 40 €
jos taas (leikattu on E ja valinta on B)
tulostetaan: Leikkaamaton kissa: vakuutusmaksu on 60 €
               toistetaan niin kauan kun (leikattu ei ole K ja leikattu ei ole E)

          case c: 
tulostetaan: Lintu: ei vakuutusmaksua
          case D: 
tulostetaan: Matelija: ei vakuutusmaksua

          default:
tulostetaan: Virheellinen valinta

    kysytään vakuutetaanko lisää eläimiä (=jatketaanko), otetaan vastaan 

    jos (jatketaanko on e), kiitetään ohjelman käytöstä

koko ohjelmaa toistetaan niin kauan kun jatketaanko on k
*/


using namespace std;

void tyhjennaRuutu();

int main()
{
	char valinta, leikattu, jatketaanko;
	
	do
	{
		tyhjennaRuutu();
		cout << "Lemmikkieläinten vakuutustoimisto: "<<endl;
		cout << "Valitse lemmikki: \n";
		cout << "A = Koira\n";
		cout << "B = Kissa\n";
		cout << "C = Lintu\n";
		cout << "D = Matelija\n";
		
		cin>>valinta;
		valinta=toupper(valinta); //Muutetaan mahd. pienet kirjaimet isoiksi
		
		switch(valinta)
		{
			case 'A':
			case 'B':
				{
					do
					{
						cout<<"Onko leikattu (K/E)?";
						cin>>leikattu;
						leikattu=toupper(leikattu); //Nostetaan kirjain isoksi
						if(leikattu == 'K' && valinta=='A')
						   cout<<"Leikattu koira: Vakuutusmaksu on 50 €.\n";
						else if(leikattu == 'E' && valinta == 'A')
						   cout<<"Leikkaamaton koira: Vakuutusmaksu on 80 €.\n";
						else if(leikattu == 'K' && valinta == 'B')
						   cout<<"Leikkaamaton kissa: Vakuutusmaksu on 40 €.\n";
						else if(leikattu == 'E' && valinta == 'B')
						   cout<<"Leikkaamaton kissa: Vakuutusmaksu on 80 €.\n";
					}while(leikattu != 'K' && leikattu != 'E');
				break;
				}
			case 'C':
				cout<<"Lintu: ei vakuutusmaksua.\n";
				break;
			case 'D':
				cout<<"Matelija: ei vakuutusmaksua.\n";
				break;
			default:
				cout<<"Virheellinen syöte. Tarkista onko kravatti suorassa\n\n";
				
		} // switch-loppuu
	
	cout<<"Vakuutetaanko lisää eläimiä (k/e): \n";
	cin>>jatketaanko;
	
	if(jatketaanko == 'e') cout<<"Kiitos ohjelman käytöstä.\nNäkemiin...\n";
	
	}while(jatketaanko == 'k');
	
	
	return 0;
}

void tyhjennaRuutu()
{
    #ifdef WINDOWS
        system("cls");
    #else
        // Assume POSIX
        system("clear");
    #endif
}
