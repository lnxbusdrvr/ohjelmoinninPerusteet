#peli-ikkunan luominen
from tkinter import *

#ikkuna-start
height=500
width=800
window=Tk()  #luo ikkunan
window.title('Kuplasota')  #Pelin nimi
c=Canvas(window, width=width, height=height, bg='darkblue')
c.pack()  #tuo piirtoalueen näkyviin
#ikkuna-end

#sukellusvene
ship_id=c.create_polygon(5, 5, 5, 25, 30, 15, fill='red')
ship_id2=c.create_oval(0, 0, 30, 30, outline='red')
ship_r=15
mid_x=width/2
mid_y=height/2
c.move(ship_id, mid_x, mid_y)
c.move(ship_id2, mid_x, mid_y)
#sukellusvene-end

#sukellusveneen ohjaaminen (tapahtumakäsittelijä)
ship_spd=10
def move_ship(event):
    if event.keysym=='Up':
        c.move(ship_id, 0, -ship_spd)
        c.move(ship_id2, 0, -ship_spd)
    elif event.keysym=='Down':  #liikutetaa alaspäin
        c.move(ship_id, 0, ship_spd)
        c.move(ship_id2, 0, ship_spd)
    elif event.keysym=='Left':  #liikutetaa vasennalle
        c.move(ship_id, -ship_spd, 0)
        c.move(ship_id2, -ship_spd, 0)
    elif event.keysym=='Right':  #liikutetaa oikealle
        c.move(ship_id, ship_spd, 0)
        c.move(ship_id2, ship_spd, 0)
c.bind_all('<Key>', move_ship)
#sukellusveneen ohjaaminen end

#kuplien luominen
from random import randint
bub_id=list()
bub_r=list()
bub_speed=list()

min_bub_r=10
max_bub_r=30
max_bub_spd=10
gap=100

#käy läpi kuplalistaa ja siirtää kutakin kuplaa vuorollaan
def create_bubble():
    x=width+gap  #asetellaan kuplat piirtoalueelle
    y=randint(0, height)
    r=randint(min_bub_r, max_bub_r) #säde, eli koko
    id1=c.create_oval(x - r, y - r, x + r, y+ r, outline='white')
    bub_id.append(id1)
    bub_r.append(r)
    bub_speed.append(randint(1, max_bub_spd))

#liikuttaa kuplia
def move_bubbles():
    for i in range (len(bub_id)):
        c.move(bub_id[i], -bub_speed[i], 0)

#selvitetään kuplan sijainti tunnusnumeron perusteella
def get_coords(id_num):
    pos=c.coords(id_num)
    x=(pos[0]+pos[2])/2
    y=(pos[1]+pos[3])/2
    return x, y

#kupla puhkeaa ja poistuu pelistä
def del_bubble(i):
    del bub_r[i]
    del bub_speed[i]
    c.delete(bub_id[i])
    del bub_id[i]

#lasketaan kahden pisteen välimatka
from math import sqrt
def distance (id1, id2):
    x1, y1=get_coords(id1)
    x2, y2=get_coords(id2)
    return sqrt((x2-x1)**2 + (y2-y1)**2)

#kuplat puhkeaa, kun sukellusvene ja kupla törmäävät, kerätään pisteitä
def collision():
    points=0
    for bub in range(len(bub_id)-1, -1, -1):
        if distance(ship_id2, bub_id[bub]) < (ship_r + bub_r[bub]):
            points +=(bub_r[bub] + bub_speed[bub])
            del_bubble(bub)
    return points

#määritetään pelaajan pistemäärä ja jäljellä oleva peliaika
c.create_text(50, 30, text='AIKA', fill='white')
c.create_text(150, 30, text='PISTEET', fill='white')
time_text=c.create_text(50, 50, fill='white')
score_text=c.create_text(150, 50, fill='white')

def show_score(score):
    c.itemconfig(score_text, text=str(score))
def show_time(time_left):
    c.itemconfig(time_text, text=str(time_left))

#määritetään aikaraja ja pistemäärä, jonka saavuttamalkla saa bonusaikaa
#ja laskee pelin päättymisajan
from time import sleep, time #tuo sleep ja time -funktiot
bub_chance=10
time_limit=30
bonus_score=1000
score=0
bonus=0
end=time() + time_limit

#pääsilmukka
score=0
bub_chance=10
while time() < end:
    if randint(1, bub_chance) == 1:
        create_bubble()
    move_bubbles()
    score += collision()
    if(int(score/bonus_score)) > bonus:
        bonus +=1  #sama kuin i++ c++:ssa
        end += time_limit
    show_score(score)
    show_time(int(end - time()))
    window.update()
    sleep(0.01)

#peli ohi-teksti tulee näkyviin peliajan päätyttyä
c.create_text(mid_x, mid_y,\
              text='PELI OHI', fill='white', font=('Helvetica', 30))
c.create_text(mid_x, mid_y+30,\
              text='Pisteet:'+str(score), fill='white')
c.create_text(mid_x, mid_y + 45,\
              text='Bonusaika:'+ str(bonus*time_limit), fill='white')



