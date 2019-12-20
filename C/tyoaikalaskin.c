/*Työaikalaskin:
Ohjelma laskee tietyn ajanjakson aikana tehtyjen työtuntien
määrän sekä tulostaa tuntien yhteismäärän, keskimääräisen
työpäivän pituuden ja syötetyt tunnit eriteltynä. 
Ohjelman tulee aluksi kysyä, kuinka monen työpäivän tiedon
syötetään (max. 30 päivää). Tämän jälkeen ohjelma kysyy
päivittäiset työtunnit. 
vihje: ohjelman toteutus onnistuu helpoimmin käyttämällä
apuna taulukkoa, jonka koko on 30 alkiota.*/

#include <stdio.h>  
int main (void)  
{                   
 float taulukko[30], yht;
 int i, summa, paivat;
 
 
 printf("Ohjelma laskee yhteen haluamasi ajanjakson aikana\n");
 printf("tehdyt työtunnit sekä keskimääräisen työpäivän pituuden.\n");
 
 printf("Kuinka monta päivää:\n");
 scanf("%d", &paivat);
 
 for (i=0; i<paivat; i++)
 {
     printf("Anna %d. päivän työtunnit: ", i+1);
     scanf("%f", &taulukko[i]);
     yht+=taulukko[i];
     }
     
 printf("\nTehdyt työtunnit yhteensä: %.1f\n", yht);
 printf("Keskimääräinen työpäivän pituus: %.1f\n", yht/paivat);
 
 printf("Syötetyt tunnit:\n ");
 
 for(i=0; i<paivat; i++)
 {
     printf("%.1f", taulukko[i]);     
          }   
           
 system("pause");
 return 0;   
    
    
}                 
