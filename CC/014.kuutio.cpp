#include <iostream>
/*Ohjelma laskee k‰ytt‰j‰n antaman luvun kuution:
do-while-rakenne:
pyydet‰‰n k‰ytt‰j‰lt‰ luku ja otetaan se vastaan
jos(luku on suurempi, kuin 0), tulostetaan "luvun kuutio on.."
lasketaan kuutio (luku*luku*luku)
toistetaan niin kauan kun luku ei ole 0
*/

using namespace std;

int main()
{
	int luku;
	
	do{
		cout << "Anna luku (0=exit): ";
		cin>>luku;
		
		if(luku>0) cout << "Luvun kuutio: "<<luku*luku*luku<<endl;
		
	}while(luku != 0);




    return 0;
}
