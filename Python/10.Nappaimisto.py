from tkinter import *
window=Tk()
window.title('Alien')
#piiretään piirtoalue
c=Canvas(window, height=330, width=400)
c.pack()  #tuo em. näkyviin
body=c.create_oval(100, 150, 300, 250, fill='green')
eye=c.create_oval(170, 70, 230, 130, fill='white')
eye2=c.create_oval(230, 70, 290, 130, fill='white')
eyeball=c.create_oval(190, 90, 210, 110, fill='black')
eyeball2=c.create_oval(270, 90, 250, 110, fill='black')
mouth=c.create_oval(150, 220, 250, 240, fill='red')
neck=c.create_line(200, 150, 200, 130)
neck=c.create_line(260, 150, 260, 130)
hat=c.create_polygon(180, 75, 220, 75, 200, 20, fill='blue')

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

words=c.create_text(200, 280, text='Muukalaisia ollaan')
def steal_hat():
    c.itemconfig(hat, state=HIDDEN)
    c.itemconfig(words, text='Anna hattuni takaisin')

def give_hat():
    c.itemconfig(hat, state=NORMAL)

window.attributes('-topmost',1)  #avaa tkinter-ikkunan

def burp(event):
    mouth_open()
    blink()
    c.itemconfig(words, text='Röyh')
c.bind_all('<Button-1>', burp)

def burp(event):
    mouth_close()
    unblink()
    c.itemconfig(words, text='oho')
c.bind_all('<Button-3>', burp)

def burp(event):
    steal_hat()
    c.itemconfig(words, text='oho')
c.bind_all('<Button-2>', burp)

def burp(event):
    give_hat()
    c.itemconfig(words, text='oho')
c.bind_all('<Button-4>', burp)

def eye_control(event):
    key=event.keysym    #selvitä painetun näppäimen nimen
    if key == "Up":
        c.move(eyeball, 0, -1)  #silmåämuna kääntyy ylöspäin
        c.move(eyeball2, 0, -1)
    elif key == "Down":
        c.move(eyeball, 0, 1)
        c.move(eyeball2, 0, 1)
    elif key == "Left":
        c.move(eyeball, -1, 0)
        c.move(eyeball2, -1, -0)
    elif key == "Right":
        c.move(eyeball, 1, 0)
        c.move(eyeball2, 1, 0)

c.bind_all('<Key>', eye_control)  #Aktivoi funktion eye_control: kun mitä tahansa painiketta painetaan





    
