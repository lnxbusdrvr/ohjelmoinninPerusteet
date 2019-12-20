#include <iostream>
/*
Ohjelma tutki onko käyttäjä normaalipainoinen, alipainoinen, tai
ylipainoinen.
Painoindeksi: paino/(pituus*pituus)
Normaalipaino: 18 - 24,9
Alipaino: <10
Ylipaino: >25
*/



using namespace std;

int main()
{
        double paino, pituus, painoIdx;

        cout << "Painoindeksin laskuri\n";
        cout << "---------------------\n\n";

        cout << "Syötä paino(kg): \t";
        cin >> paino;

        cout << "Syötä pituus(m): \t";
        cin >> pituus;

        painoIdx=paino/(pituus*pituus);

        cout << "Painoindeksi on: "<<painoIdx<<endl;

        if(painoIdx >= 18 && painoIdx <= 24.9 ) cout << " joka on normaalipaino"<<endl;
        else if(painoIdx < 18) cout << " joka on alipaino"<<endl;
        else if(painoIdx >= 25) cout << " joka on ylipaino"<<endl;
        else cout << "Väärä syöte"<<endl;





    return 0;
}
