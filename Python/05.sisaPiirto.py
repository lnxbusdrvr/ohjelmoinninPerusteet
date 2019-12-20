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
    elif do == 'D': #lisätään tämä, jotta jälkimmäinen kutsu saadaan toteutettua
        pendown()
    elif do == 'U':
        penup()
    elif do == 'N':
        reset()
    else:
        print('Tuntematon käsky')

def string_artist(program):
    cmd_list = program.split('-')  #Käskee ohjelmaa jatkamaan merkkijonon viivan kohdalta
    for command in cmd_list:  #selaa merkkijonojen listaa
        cmd_len = len(command)  #lukee käskymerkkijonon pituuden
        if cmd_len == 0:  #jos käskyn pituus 0 (tyhjä), funktio ohitaa sen
            continue
        cmd_type = command[0]  #lukee käskyn ekan merkin ja valitsee käskyn tyypin
        num = 0
        if cmd_len>1:  #tarkistaa, onko käskyn perässä lisää merkkejä
            num_string = command[1:]  #poistaa ekan merkin ja jättää loput
            num = int(num_string)  #muuntaa merkit merkkijonosta luvuiksi
        print(command, ':', cmd_type, num)  #näyttää käskyn, mitä ohjelma tekee
        turtle_controller(cmd_type,num)  #välittää käskyn kilpikonnalle

string_artist('N-F100-L90-F200-L90-F50-R60-F30-L120-F30-R60-F40-R60-F30-L120-F30-R60-F50-90-F200-L90-F100-L90-U-F150-L90-F20-D-F30-L90-F30-L90-F30-L90-F30-R90-U-F40-D-F30-R90-F30-R90-F30-R90-F30-L180-U-F60-R90-D-F40-L120-F40-L120-F40')
        
