#include <iostream>
//Ohjelma tutkii kumpi on vanhempi, Ville vai Pekka


using namespace std;

int main()
{

//Input
 int pekanIka, villenIka;
 
 cout << "\n";
 cout << "Syötä Pekan ikä: \n";
 cin >> pekanIka;
 
 cout << "\n";
 cout << "Syötä Ville Haapasalon ikä: \n";
 cin >> villenIka;

//Temput
 if(pekanIka < villenIka)
 {
 	cout << "Ville on vanhempi, kuin Pekka";
 }
 else if(pekanIka == villenIka)
 cout << "Ville ja Pekka ovat samanikäisiä";
 
  
 else cout << "Pekka on vanhempi, kuin Ville";

    return 0;
}
