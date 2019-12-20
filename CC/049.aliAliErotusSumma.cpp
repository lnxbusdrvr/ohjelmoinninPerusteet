#include <iostream>



using namespace std;

//aliohjelmien esittelyt
int LaskeSumma(int luku1, int luku2);
int LaskeTulo(int luku1, int luku2);
int LaskeErotus(int luku1, int luku2);


int main()
{
	system("color 0A");	// F0=valmoinen tausta, musta fontti
	int luku1, luku2, summa, tulo, erotus;
	
	cout<<"Anna 2 lukua: ";
	cin>>luku1;
	cin>>luku2;
	
	//aliohjelmien kutsut
	summa=LaskeSumma(luku1, luku2);	//Kutsussa ei tarvitse enää muuttuijen
	tulo=LaskeTulo(luku1, luku2);	//tyyppiö, esim int/double
	erotus=LaskeErotus(luku1, luku2);
	
	cout<<"Summa: "<< ", tulo: "<<tulo<< ", erotus: "<<erotus<<endl;
	return 0;
}

int LaskeSumma(int luku1, int luku2)
{
	return luku1+luku2;
}

int LaskeTulo(int luku1, int luku2)
{
	return luku1*luku2;
}

int LaskeErotus(int luku1, int luku2)
{
	return luku1-luku2;
}
