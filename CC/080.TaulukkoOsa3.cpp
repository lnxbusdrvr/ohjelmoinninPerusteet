#include <iostream>

/*
Taulukot
*/
using namespace std;

int main()
{
	int taulukko[12], i;
	//Luvut taulukkoon
	for(i=0; i<12; i++)
	{
		cout << "Anna " <<i+1<< " luku:";
		cin >> taulukko[i];
	}
	
	//Lukujen tulostus taulukosta
	for(i=0; i<12; i++)
	{
		cout<<taulukko[i] <<endl;
	}
		
	
	return 0;
}
