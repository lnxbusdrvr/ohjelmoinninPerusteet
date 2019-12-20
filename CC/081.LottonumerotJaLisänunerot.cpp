/*
Taulukot os 
Tulostetaan lottonumerot(7)ja 3 -lisänumero
40 on suurin numero
*/
#include <iostream>

using namespace std;

void LottoKysely();

int main()
{
	int lotto[7], i, lisanro[3];
	LottoKysely();
		
	
	
	
	
	
	return 0;
}

void LottoKysely()
{
	int lotto[7], i, lisanro[3];
	
	cout << "\n";
	cout << "Lottonumerot. 7 numeroa\n";
	cout << "-----------------------\n\n";
	
	for(i=0; i<7; i++)
	{
		cout << "Syötä "<<i+1<<" lottonumero : ";
		cin >> lotto[i];
	}
	
	cout << "\n\n3 lisänumeroa\n";
	cout << "-------------\n\n";
	
	for(i=0; i<3; i++)
	{
		cout << "Syötä "<<i+1<<" lisänumero : ";
		cin >> lisanro[i];
	}
		
	cout << "\n\nValitsemasi lottonumerot: "<<lotto[0]<<" "<<lotto[1]<<" "<<lotto[2]<<" "<<lotto[3]<<" "<<lotto[4]<<" "<<lotto[5]<<" "<<lotto[6]<<endl;
	cout << "Valitsemasi lisänumerot:  "<<lisanro[0]<<" "<<lisanro[1]<<" "<<lisanro[2]<<endl;
}
