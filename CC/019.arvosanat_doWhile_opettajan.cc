#include <iostream>
//ohjelma laskee koeteht�v�n pisteet
//Esitell��n muuttujat pisteet=0, summa=0, tehtavat=1



using namespace std;

int main()
{
	int tehtavat=1, pisteet=0, summa=0;
	
	do{
		cout << "Teht�v� nro: ";
		cin>>pisteet;
		
		summa=summa+pisteet;
		ka=summa/tehtavat;
		tehtavat++;
	}while(tehtavat <= 5);
	summa=pisteet*tehtavat;
	
	cout << "Yhteistulos on: "<<summa<< " ja keskiarvo on "<<ka<<endl;





    return 0;
}
