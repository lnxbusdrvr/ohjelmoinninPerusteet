#include <iostream>

using namespace std;

int main()
{
	int tLuku;
	
	while(tLuku != 1234)
	{
		cout << "Anna tunnusluku: ";
		cin>>tLuku;
		
		if(tLuku==1234) cout<<"Oikein"<<endl;
		else cout<<"Väärin"<<endl;
		
	}
	return 0;
}
