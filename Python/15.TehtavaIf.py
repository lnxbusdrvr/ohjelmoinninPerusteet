# -*- coding: utf-8 -*-
# Tiedosto: if.py

print("Tervetuloa ohjelmaan!")
print()  # Tulostetaan tyhjä rivi
x = input("Anna kellonaika: ")
kello = int(x)

if kello < 7:
    print("Aika nousta luennolle.")
elif kelli <= 8:
    print("Aamuluennot menivät jo, mutta vielä kerkeää iltapäivän opiskella.")
else:
    print("Taitaa olla parempi pitää rokulipäivä... Zzz...")

print()  # Toinen tyhjä rivi
print("Kiitos käynnistä!")
