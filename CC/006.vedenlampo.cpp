#include <iostream>
/*Ohjelma tutkii veden lämpötilaa:
esitellään muuttuja:lämpötila
pyydetään käyttäjältä lampötilaa, otetaan vastaan
jos(Lämpö >= 100), tulostetaan "katkaise virta"
jos taas (lämpötila 90-100), tulostetaan "jatka vielä hetki, kunnes kiehuu
muussa tapauksessa, tulostetaan "jotka keittämistä"*/


using namespace std;

int main()
{
 int lampotila;
 
 cout << "\n";
 
 cout << "Syötä veden lämpötila:\n";
 cin >> lampotila;
 
 cout << "\n";
 
 if(lampotila >= 100) cout << "Katkaise virta\n\n";
 else if(lampotila >= 90 && lampotila <= 100) cout << "lämmitä vielä hetki\n\n";
 else cout << "Lämpötila on liian kylmä\n";

    return 0;
}
