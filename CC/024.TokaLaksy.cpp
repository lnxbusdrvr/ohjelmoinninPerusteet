#include <iostream>

/* Ohjelma tutkii käyttäjän antamaa viikonpäivän numeroa (1-7):
jos(numero on 1-5). Tulostetaan "Arkipäivä"
jos taas(numero on 6), tulostetaan "lauantai"
jos taas(numero on 7), tulostetaan "sunnuntai"
muussa tapauksessta, tulostetaan "tarkista syöte"
*/



using namespace std;

int main()
{
    int vkoPva;

    cout << "Syötä päivämäärä(1-7): \v";
    cin >> vkoPva;

    if(vkoPva >= 1 && vkoPva <= 5 ) cout << "Arkipäivä\n";
    else if(vkoPva == 6) cout << "Lauantai\n";
    else if(vkoPva == 7) cout << "Sunnuntai\n";
    else cout << "Tarkista syöte\n";


    return 0;
}
