#include <iostream>



using namespace std;

int main()
{
	int luku=0, suurin=0, lkm=0;
	
	do
	{
		//Pyydetään käyttäjältä lukua ja otetaan se vastaan
		cout << "Anna " <<lkm+1<< " luku: ";
		cin >> luku;
		
		/* jos viiimeksi annettu luku oli suurempi kuin aik. annettu suurin luku,
		sijoitetaan viimeksi annettu luku suurin.muuttujaan*/
		if(luku>suurin)
		{
			suurin=luku;
		}
		lkm++;
		
	}while(lkm<10);
	
	cout<<"Suurin syöttämäsi luku oli "<<suurin<<endl;





    return 0;
}
