#include <iostream>
/* K‰ytt‰j‰ yritt‰‰ arvata ohjelman arpoman Luvun:
esitell‰‰n muuttujat
niin kauan kun (arvaus ei ole yht‰ kuin arvottu luku)
pyydet‰‰n k‰ytt‰j‰‰ arvaamaan Lukum otetaan vastaan
jos(arvottuLuku<k‰yttˆj‰nArvaus), tulostetaan "Luku on pienempi"
jos taas (arvottuLuku >k‰ytt‰j‰nArvaus), tulostetaan "Luku on suurempi"
muussa tapauksessa, tulostetaan "arvasit oikein, luku oli..."
*/


using namespace std;

int main()
{
	int arvottuLuku=10, arvaus;
	
	while(arvottuLuku != arvaus)		//ei ole yht‰kuin !=
	{
		cout << "Arvaa luku: ";
		cin>>arvaus;
		
		if(arvottuLuku < arvaus) cout << "Luku on pienempi!\n";
		else if(arvottuLuku > arvaus) cout << "Luku on isompi!\n";
		else cout << "Arvasit oikein, luku oli "<<arvottuLuku<<endl;
	}





    return 0;
}
