#include <iostream>
/*
Ohjelma tutki onko k�ytt�j� normaalipainoinen, alipainoinen, tai
ylipainoinen.
Painoindeksi: paino/(pituus*pituus)
Normaalipaino: 18 - 24,9
Alipaino: <10
Ylipaino: >25
*/



using namespace std;

int main()
{
	double paino, pituus, painoIdx;
	
	cout << "Painoindeksin laskuri\n";
	cout << "---------------------\n\n";
	
	cout << "Sy�t� paino(kg): \t";
	cin >> paino;
	
	cout << "Sy�t� pituus(m): \t";
	cin >> pituus;
	
	painoIdx=paino/(pituus*pituus);
	
	if(painoIdx >=18 || painoIdx <= 24.9)
	cout << "Painoindeksi on: "<<painoIdx<<endl<< " joka on normaalipaino"<<endl;
	else if(painoIdx < 10) cout << "Painoindeksi on: "<<painoIdx<<endl<< " joka on alipaino"<<endl;
	else if(painoIdx > 25) cout << "Painoindeksi on: "<<painoIdx<<endl<< " joka on ylipaino"<<endl;
	else cout << "V��r� sy�te"<<endl;





    return 0;
}
