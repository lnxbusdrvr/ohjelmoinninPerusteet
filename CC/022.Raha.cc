#include <iostream>
/*Ohjelma tutkii käyttäjän rahavaroja:
esitellään muuttuja
köyttäjältä tiedustellaan, paljonko hänellä on rahaa, otetaan vastaan
jos taas (rahaa on 50-100), tulostetaan "Rahaa on kohtalaisesti"
muussa tapauksessa, tulostetaan "Rahaa on niukasti"
*/



using namespace std;

int main()

{
	int luku;
	
	cout << "Sy\x86t\x94 paljon sinulla on rahaa: \n";
	cin>>luku;
	
	if(luku >= 50 && luku <= 100);
	cout << "Rahaa on kohtalaisesti\n";
	
	else cout << "Rahaa on niukasti\n";	//ä=\x94 ö=\x86



    return 0;
}
