#include <iostream>

/*
Taulukot
*/
using namespace std;

int main()
{
	int taulukko[5], i;
	//Luvut taulukkoon
	for(i=0; i<5; i++)
	{
		cout << "Anna " <<i+1<< " luku:";
		cin >> taulukko[i];
	}
	
	//Lukujen tulostus taulukosta
	for(i=0; i<5; i++)
	{
		cout<<taulukko[i] <<endl;
	}
		
	
	return 0;
}
