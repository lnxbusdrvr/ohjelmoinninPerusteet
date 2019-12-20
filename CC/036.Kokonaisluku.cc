#include <iostream>
/*
Ohjelma tulostaa kokonaislukua nousevassa järjestyksessä
lue luku1 ja luku2:
jos(luku1<=2) niin tulosta luku1 ja luku2
muuten tulosta luku2 ja luku1
loppu jos; loppu;
*/

using namespace std;

int main()
{
    int luku1, luku2;

    cout <<endl;

    cout << "Syötä ensimmäinen luku: \t";
    cin >> luku1;
    cout << endl;

    cout << "Syötä toinen luku: \t";
    cin >> luku2;
    cout << endl;
    

    luku1++;
    luku2++;

    if(luku1<=2) cout<<luku1<<" "<<luku2<<endl;
    else cout<<luku2<<luku1<<endl<<endl;


    return 0;
} 
