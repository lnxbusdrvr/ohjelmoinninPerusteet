from tkinter import *
window=Tk()
window.title('Alien')
#piiretään piirtoalue
c=Canvas(window, height=330, width=400)
c.pack()  #tuo em. näkyviin
body=c.create_oval(100, 150, 300, 250, fill='blue')
eye=c.create_oval(170, 70, 230, 130, fill='white')
eye2=c.create_oval(230, 70, 290, 130, fill='white')
eyeball=c.create_oval(190, 90, 210, 110, fill='black')
eyeball2=c.create_oval(270, 90, 250, 110, fill='black')
mouth=c.create_oval(150, 220, 250, 240, fill='red')
neck=c.create_line(200, 150, 200, 130)
neck=c.create_line(260, 150, 260, 130)
hat=c.create_polygon(180, 75, 220, 75, 200, 20, fill='green')

def mouth_open():
    c.itemconfig(mouth, fill='black')

def mouth_close():
    c.itemconfig(mouth, fill='red')

def blink():  #kaikki defin jälkeiset nimet ovat omia keksittyjä nimiä
    c.itemconfig(eye, fill='green')
    c.itemconfig(eye2, fill='green')
    c.itemconfig(eyeball, state=HIDDEN)
    c.itemconfig(eyeball2, state=HIDDEN)

def unblink():
    c.itemconfig(eye, fill='white')
    c.itemconfig(eye2, fill='white')
    c.itemconfig(eyeball, state=NORMAL)
    c.itemconfig(eyeball2, state=NORMAL)

    
