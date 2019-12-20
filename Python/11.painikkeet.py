from tkinter import *
def bAaction():
    print('kiitos')

def bBaction():
    print('Auh! Tuo sattui!')

window=Tk()

buttonA=Button(window, text='Paina minua', command=bAaction)
buttonB=Button(window, text='Paina minua', command=bBaction)

buttonA.pack()  #sijoittaa painikkeet ikunaan
buttonB.pack()
