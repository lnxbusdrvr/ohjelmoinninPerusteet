# -*- coding: utf-8 -*-
# Haamupeli
from random import randint
print('Haamupeli')
feeling_brave=True  #T-kirjain pitää olla isolla
score=0
while feeling_brave:
    ghost_door=randint(1, 3)
    print('Kolme ovea edessä...')
    print('Mikä ovi avataan?')
    door=input('1,2 vai 3?')
    door_num=int(door)
    if door_num == ghost_door:
        print('HAAMU')
        feeling_brave=False
    else:
        print('Ei haamua')
        print('Pääset seuraavaan huoneseen.')
        score=score + 1
print('Pakeni')
print('Peli ohi! Tuloksesi on ' , score)

