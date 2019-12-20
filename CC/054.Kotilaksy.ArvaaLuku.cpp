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

int ArvaaLuku();

int main()
{
	ArvaaLuku();
	
	return 0;
}

int ArvaaLuku()
{
	int arvottuLuku=10, arvaus;
	
	do
	{
		cout << "Arvaa luku: ";
		cin>>arvaus;
		
		if(arvottuLuku<arvaus) cout << "Luku on pienempi";
		else if(arvottuLuku>arvaus) cout << "Luku on isompi";
		else cout << "Arvasit oikein"<<arvottuLuku<<endl;
		
		
	}while(arvottuLuku != arvaus);
}
