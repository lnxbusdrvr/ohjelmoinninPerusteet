#include <iostream>
#define TUNNUSLUKU 1234	//Vakiomuuttujan esittely
using namespace std;

int main()
{
	int tLuku;
	
	do
	{
		cout<<"Anna tunnusluku: ";
		cin>>tLuku;
		
		if(tLuku==TUNNUSLUKU) cout<<"Oikein\n";
		else cout<<"V��rin\n";
	}while(tLuku != TUNNUSLUKU);
	
	return 0;
}
