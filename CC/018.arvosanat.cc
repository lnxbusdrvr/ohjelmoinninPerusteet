#include <iostream>
//ohjelma laskee koeteht�v�n pisteet
//Esitell��n muuttujat pisteet=0, summa=0, tehtavat=1



using namespace std;

int main()
{
	int tehtavat=0, pisteet=0, summa=0;
	
	while(tehtavat <= 4)
	{
		tehtavat++;
		
		cout << " "<<tehtavat<<endl;
		cout << "Sy�t� pistem��r�: \n";
		cin >> pisteet;
		

	}
	summa=pisteet*tehtavat;
	
	cout << "Yhteistulos on: "<<summa<<endl;





    return 0;
}
