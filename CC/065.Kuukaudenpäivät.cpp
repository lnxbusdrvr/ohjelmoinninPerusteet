#include <iostream>
#define K 31
#define KK 30
#define KKK 28

using namespace std;

int main()
{
	int kuu;
	cout << "Monesko kuukausi (1-12): ";
	cin >> kuu;
	
	switch(kuu)
	{
		case 4:
		case 6:
		case 9:
		case 11:
			cout<<"T�ss� kuussa on "<<KK<< " p�iv��.";
			break;
		
		case 2:
			cout<<"T�ss� kuussa on "<<KKK<< " p�iv��.";
			break;
		
		default:
			cout<<"T�ss� kuussa on "<<K<< " p�iv��.";
		
	}
	
	return 0;
	
}
