#include <stdio.h> //kirjastofunktio
#define PII 3.14 //vakion m‰‰rittely
int main (void) //p‰‰ohjelma
{                  //lauselohko alkaa
 int ymp_sade=10; //muuttujan esittelyt
 float ymp_ala;
 
 ymp_ala=PII*ymp_sade*ymp_sade; //sijoituslause
 printf("Ympyr‰n ala on %.2f\n", ymp_ala);
 system("pause");
 return 0;   
    
    
}                //lauselohko p‰‰ttyy
