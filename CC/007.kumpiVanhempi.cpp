#include <iostream>
//Ohjelma tutkii kumpi on vanhempi, Ville vai Pekka


using namespace std;

int main()
{

//Input
 int pekanIka, villenIka;
 
 cout << "\n";
 cout << "Sy�t� Pekan ik�: \n";
 cin >> pekanIka;
 
 cout << "\n";
 cout << "Sy�t� Ville Haapasalon ik�: \n";
 cin >> villenIka;

//Temput
 if(pekanIka < villenIka)
 {
 	cout << "Ville on vanhempi, kuin Pekka";
 }
 else if(pekanIka == villenIka)
 cout << "Ville ja Pekka ovat samanik�isi�";
 
  
 else cout << "Pekka on vanhempi, kuin Ville";

    return 0;
}
