from tkinter import *
from random import randint

def roll():
    text.delete(0.0, END)
    text.insert(END, str(randint(1,6)))

window=Tk()
text=Text(window, width=5, height=2, font=12, bg='green', fg='white', padx=2, pady=5)
buttonA=Button(window, text='Heitä noppaa', command=roll)

text.pack()
buttonA.pack()
