#include <iostream>
/*Ohjelman laskee oppilaan 5 koeteht‰v‰n yhteispistem‰‰r‰n.
For versio*/



using namespace std;

int main()

{
	int pisteet=0, summa=0;
	
	//alkutoimet; ehto; lopputoimet
	for(int tehtavat=1; tehtavat <=5; tehtavat++)
	{
		cout << "Anna pistem‰‰r‰: ";
		cin>>pisteet;
		
		summa=summa+pisteet;
	}
	cout<<"Yhteispistem\x94\x94r\x94 on "<<summa<<endl;		//‰=\x94 ˆ=\x86



    return 0;
}
