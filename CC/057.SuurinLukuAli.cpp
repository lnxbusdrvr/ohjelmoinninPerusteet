#include <iostream>
/*Ohjelma pyyt‰‰ 10 kokonaislukua ja ilmoittaa mik‰ niist‰ on suurin
(do-while)*/
using namespace std;

int SuurinLuku();

int main ()
{
	int takas;
	takas=SuurinLuku();
 
  	return 0;
}

int SuurinLuku()
{
	  int luku=0, suurin=0, lkm=0;
  
	do{
  		//pyydet‰‰n k‰ytt‰j‰lt‰ lukua ja otetaan se vastaan
  		cout<<"Anna " <<lkm+1<< ". luku: ";
  		cin>>luku;
  	
  		/*jos viimeksi annettu luku oli suurempi kuin aik. annettu suurin luku,
	  	sijoitetaan viimeksi annettu luku suurin-muuttujaan*/
	  	if(luku>suurin){
	  	suurin=luku;
	  	}
	lkm++;
  	
  	} while(lkm<10); 
  
	cout<<"Suurin syˆtt‰m‰si luku oli "<<suurin<<endl;
	
	return suurin;

}
