#include <iostream>
#define TUNNUSLUKU 1234	//Vakiomuuttujan esittely
using namespace std;

int main()
{
	int tLuku;
	
	while(tLuku != TUNNUSLUKU)
	{
		cout<<"Anna tunnusluku: ";
		cin>>tLuku;
		
		if(tLuku==TUNNUSLUKU) cout<<"Oikein\n";
		else cout<<"Väärin\n";
	}
	
	return 0;
}
