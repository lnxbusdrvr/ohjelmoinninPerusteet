/*
Taulukot os 
Tulostetaan lottonumerot(7)ja 3 -lis�numero
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
		cout << "Sy�t� "<<i+1<<" lottonumero : ";
		cin >> lotto[i];
	}
	
	cout << "\n\n3 lis�numeroa\n";
	cout << "-------------\n\n";
	
	for(i=0; i<3; i++)
	{
		cout << "Sy�t� "<<i+1<<" lis�numero : ";
		cin >> lisanro[i];
	}
		
	cout << "\n\nValitsemasi lottonumerot: "<<lotto[0]<<" "<<lotto[1]<<" "<<lotto[2]<<" "<<lotto[3]<<" "<<lotto[4]<<" "<<lotto[5]<<" "<<lotto[6]<<endl;
	cout << "Valitsemasi lis�numerot:  "<<lisanro[0]<<" "<<lisanro[1]<<" "<<lisanro[2]<<endl;
}
