#include <iostream>
/*Ohjelma tuostaa merkkej‰*/



using namespace std;

int main()

{
	char merkki;
	
	cout << "Syˆt‰ +, -, * tai / -merkki: \n";
	cin >> merkki;
	
	switch(merkki)
	{
		case '+':	// jos k‰ytet‰‰n merkkej‰, niin se pit‰‰ laitta '' -sis‰‰n
			cout << "Merkkisi oli "<<merkki<<endl;
			break;
			
		case '-':
			cout << "Merkkisi oli "<<merkki<<endl;
			break;
		
		case '*':
			cout << "Merkkisi oli "<<merkki<<endl;
			break;
		
		case '/':
			cout << "Merkkisi oli "<<merkki<<endl;
			break;
			
		default:
			cout << "Merkki on tuntematon "<<endl;
			break;
		
		
			
	}
		

		
		
	
	



    return 0;
}
