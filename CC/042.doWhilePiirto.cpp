#include <iostream>
// Ohjelma piirt‰‰ annetun merkin ja mittojen mukaan kuvion 


using namespace std;

int main()
{
	int leveys, korkeus;
	char merkki, jatketaanko;
	
	do
	{
		system("cls");	//Tyhjent‰‰ ruuden, ei j‰‰ vanhoja juttuja ruudulle
		cout << "Anne leveys: ";
		cin >> leveys;
		
		cout << "Anna korkeus: ";
		cin >> korkeus;
		
		cout << "Anna merkki: ";
		cin >> merkki;
		
		//Sis‰kk‰iset for-lauseet
		for(int i=1; i<=korkeus; i++)		//Tulostaa merkki ja kasvattaa sen
		{
			for(int j=1; j<=leveys; j++)
			{
				cout<<merkki;
			}
		cout<<" \n";
		}
	cout << "Jatketaanko (k/e): ";
	cin>>jatketaanko;
	}while(jatketaanko=='k');
	





    return 0;
}
