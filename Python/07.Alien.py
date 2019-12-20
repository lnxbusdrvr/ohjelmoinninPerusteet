from tkinter import *
window=Tk()
window.title('Alien')
#piiretään piirtoalue
c=Canvas(window, height=330, width=400)
c.pack()  #tuo em. näkyviin
body=c.create_oval(100, 150, 300, 250, fill='blue')
eye=c.create_oval(170, 70, 230, 130, fill='white')
eye=c.create_oval(230, 70, 290, 130, fill='white')
eyeball=c.create_oval(190, 90, 210, 110, fill='black')
eyeball=c.create_oval(270, 90, 250, 110, fill='black')
mouth=c.create_oval(150, 220, 250, 240, fill='red')
neck=c.create_line(200, 150, 200, 130)
hat=c.create_polygon(180, 75, 220, 75, 200, 20, fill='green')
