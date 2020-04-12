# String array

## Vain valmiiksi kirjoitettu

String[] saa olla vain valmiiksi kirjoitettuna,
sitä ei pystytä ottamaan vastaan syötteenä (esim. Scanner, BufferedReader).

Luodessaan String syotteen, tehdään vain tavallinen syöte
```String syote = lukija.nextLine();``` ja sen jälkeen kaytetään vaikka
```syote.split(" ");``` -metodia, joka tässä tapauksessa erottaa välilyönneillä tietueet.
