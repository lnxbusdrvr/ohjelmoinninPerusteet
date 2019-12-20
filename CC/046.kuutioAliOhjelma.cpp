#include <iostream>
/*Ohjelma laskee k‰ytt‰j‰n antaman luvun kuution:
do-while-rakenne:
pyydet‰‰n k‰ytt‰j‰lt‰ luku ja otetaan se vastaan
jos(luku on suurempi, kuin 0), tulostetaan "luvun kuutio on.."
lasketaan kuutio (luku*luku*luku)
toistetaan niin kauan kun luku ei ole 0
AliOhjelma-versio*/

using namespace std;

void MuhamedAli();

int main()
{
	MuhamedAli();
	
	return 0;
}

void MuhamedAli()
{
	int luku;
	do{
		cout <<"\n";
		cout << "Anna luku (0=exit): \n";
		cin>>luku;
		
		if(luku>0) cout << "Luvun "<<luku<<" kuutio on "<<luku*luku*luku<<endl<<endl;
		
	}while(luku != 0);
}
