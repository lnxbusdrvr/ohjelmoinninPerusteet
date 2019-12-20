#include <iostream>
//Ohjelma tutkii kumpi on vanhempi, Ville vai Pekka


using namespace std;

void KumpiVanha();	//T‰ss‰ pit‰‰ loppua puolipisteseen

int main()
{
	KumpiVanha();	//t‰h‰‰n ei laiteta void:ia eteen

    return 0;
}

void KumpiVanha()	//Toteutuksessa ei laiteta puolipistett‰ loppuun
{
	//Input
 int pekanIka, villenIka;
 
 cout << "\n";
 cout << "Syˆt‰ Pekan ik‰: \n";
 cin >> pekanIka;
 
 cout << "\n";
 cout << "Syˆt‰ Ville Haapasalon ik‰: \n";
 cin >> villenIka;

//Temput
 if(pekanIka < villenIka)
 {
 	cout << "Ville on vanhempi, kuin Pekka";
 }
 else if(pekanIka == villenIka)
 cout << "Ville ja Pekka ovat samanik‰isi‰";
 
  
 else cout << "Pekka on vanhempi, kuin Ville";

}
