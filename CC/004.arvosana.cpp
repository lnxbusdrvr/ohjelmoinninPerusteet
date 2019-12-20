#include <iostream>

/*Ohjelma tutkii k‰ytt‰j‰n antamaa arvosanaa (4-10):
esitell‰‰n muuttuja: arvosana
pyydet‰‰n k‰ytt‰j‰lt‰ arvosanaa, otetaan vastaan.
jos(4-5), tulostetaan "tulos oli heikko"
jos taas (6-7), tulostetaan "tulos oli tyydytt‰v‰"
jos taas (8-10), tulostetaan "tulos oli hyv‰"
muussa tapauksessa, tulostetaan "tarkista arvosana"
*/

using namespace std;

int main()
{
//input
 int arvosana;
 
 cout << "Anna arvosana (4-10): ";	//pyydet‰‰n k‰ytt‰j‰lt‰ arvosanaa
 cin >> arvosana;
 
//Temput
 if(arvosana >= 4 && arvosana <= 5) cout << "Tulos oli heikko\n"; //jos on enemm‰n kuin rivi, niin ei tarviste aaltoslkeita{}
 else if (arvosana >= 6 && arvosana <= 7) cout << "Tulos oli tyydytt‰v‰ \n";
 else if (arvosana >= 8 && arvosana <= 10) cout << "Tulos oli hyv‰ \n";
 else cout << "Tarkista arvosana! \n";



    return 0;
}
