/*Ty�aikalaskin:
Ohjelma laskee tietyn ajanjakson aikana tehtyjen ty�tuntien
m��r�n sek� tulostaa tuntien yhteism��r�n, keskim��r�isen
ty�p�iv�n pituuden ja sy�tetyt tunnit eriteltyn�. 
Ohjelman tulee aluksi kysy�, kuinka monen ty�p�iv�n tiedon
sy�tet��n (max. 30 p�iv��). T�m�n j�lkeen ohjelma kysyy
p�ivitt�iset ty�tunnit. 
vihje: ohjelman toteutus onnistuu helpoimmin k�ytt�m�ll�
apuna taulukkoa, jonka koko on 30 alkiota.*/

#include <stdio.h>  
int main (void)  
{                   
 float taulukko[30], yht;
 int i, summa, paivat;
 
 
 printf("Ohjelma laskee yhteen haluamasi ajanjakson aikana\n");
 printf("tehdyt ty�tunnit sek� keskim��r�isen ty�p�iv�n pituuden.\n");
 
 printf("Kuinka monta p�iv��:\n");
 scanf("%d", &paivat);
 
 for (i=0; i<paivat; i++)
 {
     printf("Anna %d. p�iv�n ty�tunnit: ", i+1);
     scanf("%f", &taulukko[i]);
     yht+=taulukko[i];
     }
     
 printf("\nTehdyt ty�tunnit yhteens�: %.1f\n", yht);
 printf("Keskim��r�inen ty�p�iv�n pituus: %.1f\n", yht/paivat);
 
 printf("Sy�tetyt tunnit:\n ");
 
 for(i=0; i<paivat; i++)
 {
     printf("%.1f", taulukko[i]);     
          }   
           
 system("pause");
 return 0;   
    
    
}                 
