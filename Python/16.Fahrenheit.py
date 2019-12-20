# -*- coding: utf-8 -*-
# Tiedosto: if.py

#Ohjelma pyytää Fahreheitteja ja muuntaa sen Celcius-muotoon
#pyydetään fahrenheit
#otetaan vastaan
#jaetaan f / 1.8 = celcius
#tulostetaan tulos=celcius

while True:
    print("\n")
    print("Lämpötilamuuntoohjelma\n")
    print("----------------------\n")
    print("\n")
    fahr= float(input("Syötä lämpötila(°F): "))
    print(fahr, 'on ', 'fahr - 32', '°C\n')
    jatketaanko
    if jatketaanko == 'k':
        break
