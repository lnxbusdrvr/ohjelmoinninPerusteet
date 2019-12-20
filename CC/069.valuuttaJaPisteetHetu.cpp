#include <iostream>
/* Ohjelma muuntaa Eurot haluttuun valuuttaan:
ruotsin kruunu, USA:n dollari, Ven‰j‰n rupla, Iso-Britannian punta
tehd‰‰n valuutojen arvoista vakioita
do-while-rakenne
aliohjemat LaskeKruunut, LaskeDollarit, LaskePunnat, LaskeRuplat
pyydet‰‰n valuuttaa(euro, otetaan vastaan
pyydet‰‰n valuuttaa, otetaan vastaan
jos(valuuttaan==1), kutsutaan LaskeKruunut-aliohjelmaaa
jne.
*/
#define SEK 10.14
#define USD 1.43
#define GBP 0.88
#define RUB 42.50

using namespace std;

// jos kaksi lukua lasketaan, niin tarvitaan 2
// parametri‰kin
// periaatteessa parametrit ovat myˆs muuttujia,
// muttei aina
double LaskeKruunut(double luku);
double LaskeDollarit(double luku);
double LaskePunnat(double luku);
double LaskeRuplat(double luku);
int LaskePisteet();
void Hetu(int htunnus);

int main()
{
	double luku, tulos;
	int valuutta, valinta, pisteetYht, htunnus;
	char jatketaanko;
	do
	{
		cout<<"\n";
		cout<<"   ______ \n";
		cout<<"  | Menu | \n";
		cout<<"--|------|------------------\n";
		cout<<"1. Valuutan muunto         |\n";
		cout<<"2. Oppilaiden pistem‰‰r‰   |\n";
		cout<<"3. Henkilˆtunnus           |\n";
		cout<<"----------------------------ˆ\n";
		cout<<"Annavalinta: ";
		cin>>valinta;
		
		switch(valinta)
		{
			case 1:
							
			cout << "\n";
			cout <<"Muunnan eurot haluamaasi valuuttaan.\n";
			cout << "Syˆt‰ Eurom‰‰r‰: ";
			cin >> luku;
			cout << "\n";
		
			cout << "1. Ruotsin kruunu \n";
			cout << "2. USA:n dollari \n";
			cout << "3. Iso-Britannian punta \n";
			cout << "4. Ven‰j‰n rupla\n";
			cin >> valuutta;
		
				//katsotaan mihiin eurot nhalutaan vaihtaa
				if(valuutta==1)
				{	//Aliohjelman kutsu
					//tuloksen tulostaminen
					tulos=LaskeKruunut(luku);
					cout<<luku<< " euroa on " <<tulos<< " Ruotsin kruunua"<<endl;
				}
				else if(valuutta==2)
				{	//aliohjelman 2 kutsu ja tulos
					tulos=LaskeDollarit(luku);
					cout<<luku<< " euroa on " <<tulos<< " Usan dollaria"<<endl;
				}
				else if(valuutta==3)
				{	//aliohjelman 3 kutsu ja tulos
					tulos=LaskePunnat(luku);
					cout<<luku<< " euroa on " <<tulos<< " Iso-Britannian puntaa"<<endl;
				}
				else
				{		
					tulos=LaskeRuplat(luku);
					cout<<luku<< " euroa on " <<tulos<< " Ven‰j‰n ruplaa"<<endl;
				}
			break;
		
			case 2:
				cout << "Anna 5 oppilaan pisteen, lasken ne yhteen: \n";
				pisteetYht=LaskePisteet();
				cout<<"Pisteet: "<<pisteetYht<<endl;
				break;
			
			case 3:
				Hetu(htunnus);
		}
		cout <<endl;
		cout << "Jatketaanko (k/e): ";
		cin >> jatketaanko;
		
		if(jatketaanko == 'e') cout<<"Kiitos ohjelman k‰ytˆst‰!"<<endl;
		
		//Tyhjent‰‰ screenin
		//for (int i=26; i>= 0; --i)
		//cout << "\n";
		
	}while(jatketaanko =='k' );
	
	return 0;
}



double LaskeKruunut(double luku)
{
	
	
	return SEK*luku;
}

double LaskeDollarit(double luku)
{	
	return USD*luku;
}

double LaskePunnat(double luku)
{	
	return GBP*luku;
}

double LaskeRuplat(double luku)
{	
	return RUB*luku;
}

int LaskePisteet()
{
	int pisteet=0, summa=0, tehtavat;
	while(tehtavat <= 5)
	{
		cout<<"Anna pistem‰‰r‰: ";
		cin>>pisteet;
		summa=summa+pisteet;
		tehtavat++;
	}
	return summa;
}

void Hetu(int htunnus)
{
	cout << "Sy√∂t√§ henkil√∂numeron viimeinen numero: \n";
    cin >>htunnus;

    if(htunnus%2 == 0 ) cout << "Olet nainen\n";
    else cout << "Olet mies\n"; 
}
