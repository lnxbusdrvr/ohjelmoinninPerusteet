#include <iostream>
//ohjelma laskee koetehtävän pisteet
//Esitellään muuttujat pisteet=0, summa=0, tehtavat=1



using namespace std;

int main()
{
	int tehtavat=0, pisteet=0, summa=0;
	
	while(tehtavat <= 4)
	{
		cout<<"Anna pistemäärä: ";
		cin<<pisteet;
		
		summa=summa+pisteet;
		tehtavat++;
	}
	
	cout<<"Yhteispistemäärä on "<<summa<<endl;
		

    return 0;
}
