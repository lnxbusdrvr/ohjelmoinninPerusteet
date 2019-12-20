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
			cout<<"Tässä kuussa on "<<KK<< " päivää.";
			break;
		
		case 2:
			cout<<"Tässä kuussa on "<<KKK<< " päivää.";
			break;
		
		default:
			cout<<"Tässä kuussa on "<<K<< " päivää.";
		
	}
	
	return 0;
	
}
