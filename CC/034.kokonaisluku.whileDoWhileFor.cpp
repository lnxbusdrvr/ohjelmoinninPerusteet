#include <iostream>
/* Ohjelma kysyy k�ytt�j�lt� jonkin kokonaisluvun ja tulostaa
sen kertotaulun.
while, do-while, for
Samaan ohjelmaan kaikille rakenteilla allekkain
huom! Laskurin pit�� vaihtaa nime� eli i, j, k
Ohjelma pyyt�� kokonaislukua, ottaa sen vastaan
luupissa tulostaa luvun kertotaulun
*/



using namespace std;

int main()
{
	int i=1, luku, j=1, luku2, k, luku3;

		cout << "EIN: Sy�t� kokonaisluku: ";
		cin >> luku;	

	while(i<=10)
	{
		
		cout<<luku<<" kertaa "<<i<<" on "<<luku*i<<endl;
		i++;
		cout<<endl;
	
	}
	
		cout << "ZWEI: Sy�t� kokonaisluku: ";
		cin >> luku2;
	
	do
	{
		cout<<luku2<<" kertaa "<<j<<" on "<<luku2*j<<endl;
		j++;
		cout<<endl;
		
	}while(j<=10);
	
	cout << "TREI: Sy�t� kokonaisluku: ";
	cin >> luku3;
	
	for(int k=1; k<=10; k++)
	{
		cout<<luku3<<" kertaa "<<k<<" on "<<luku3*k<<endl;
	}	
	






    return 0;
}
