#include <iostream>
/* Ohjelma laskee oppilaiden keskipituuden
opilaiden m‰‰r‰ on 8
esitetaan muuttujat: opMaara=8, opPituus*/

using namespace std;

void KeskiArvo();

int main()
{
	KeskiArvo();
	
	return 0;
}

void KeskiArvo()
{
	double opPituus, summa;
	int opMaara;
	
	cout << "Anna luokan oppilaiden lukum‰‰r‰: ";
	cin >> opMaara;
		
	for(int i=1; i <= opMaara; i++)
	{
		cout << "Anna "<<i<<" oppilaan pituus: \n";
		cin >> opPituus;

		
		summa=summa + opPituus;
	}
	if(opMaara > 0)
	cout << "Keskiarvo pituuteen on: "<<summa/opMaara<<endl;
}
