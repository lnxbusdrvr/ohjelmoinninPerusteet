# -*- coding: utf-8 -*-
# Palkki
from turtle import *
def turtle_controller(do,val):  #funktion kutsu
    do = do.upper()  #muuntaa syötteen do kirjaimet isoiksi
    if do == 'F':
        forward(val)  #käskee funktiota muyuntamaan do-arvon F käskyksi forward
    elif do == 'B':
        backward(val)
    elif do == 'R':
        right(val)
    elif do == 'L':
        left(val)
    elif do == 'U':
        penup()
    elif do == 'N':
        reset()
    else:
        print('Tuntematon käsky')

turtle_controller('F', 150)
turtle_controller('R', 50)
turtle_controller('F', 100)
turtle_controller('F', 100)
turtle_controller('R', 90)
turtle_controller('F', 100)
turtle_controller('R', 90)
turtle_controller('F', 200)

 


