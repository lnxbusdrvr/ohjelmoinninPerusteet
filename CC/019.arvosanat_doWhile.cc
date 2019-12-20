#include <iostream>
//ohjelma laskee koeteht‰v‰n pisteet
//Esitell‰‰n muuttujat pisteet=0, summa=0, tehtavat=1



using namespace std;

int main()
{
	int tehtavat=0, pisteet=0, summa=0;
	
	do{
		cout << "Teht‰v‰ nro: ";
		tehtavat++;
		
		cout << " "<<tehtavat<<endl;
		cout << "Syˆt‰ pistem‰‰r‰: \n";
		cin >> pisteet;
		

	}while(tehtavat <= 4);
	summa=pisteet*tehtavat;
	
	cout << "Yhteistulos on: "<<summa<<endl;





    return 0;
}
