#include <iostream>
/*Ohjelma tutkii veden l�mp�tilaa:
esitell��n muuttuja:l�mp�tila
pyydet��n k�ytt�j�lt� lamp�tilaa, otetaan vastaan
jos(L�mp� >= 100), tulostetaan "katkaise virta"
jos taas (l�mp�tila 90-100), tulostetaan "jatka viel� hetki, kunnes kiehuu
muussa tapauksessa, tulostetaan "jotka keitt�mist�"*/


using namespace std;

int main()
{
 int lampotila;
 
 cout << "\n";
 
 cout << "Sy�t� veden l�mp�tila:\n";
 cin >> lampotila;
 
 cout << "\n";
 
 if(lampotila >= 100) cout << "Katkaise virta\n\n";
 else if(lampotila >= 90 && lampotila <= 100) cout << "l�mmit� viel� hetki\n\n";
 else cout << "L�mp�tila on liian kylm�\n";

    return 0;
}
