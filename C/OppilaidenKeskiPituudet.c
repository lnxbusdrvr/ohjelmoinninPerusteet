/* Luokan oppilaiden keskipituuden laskeminen, kun oppilasmaara
on annettu etukateen */
#include <stdio.h>
int main(void)
{
/* muuttujien m‰‰rittelyt */
float pituus = 0, summa = 0;
int lukumaara, i;
/* lahtotietojen kysely */
printf("Anna luokan oppilaiden lukumaara: ");
scanf("%d",&lukumaara);
/* Varsinainen laskenta ja tulostus */
for (i = 1; i <= lukumaara; i++)
{
printf("Anna oppilaan %d pituus ",i);
scanf("%f",&pituus);
summa = summa + pituus;
}

printf("Oppilaiden keskipituus on = %.1f\n",summa/lukumaara);

system("pause");
return 0;
}
