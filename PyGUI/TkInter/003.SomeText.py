from tkinter import *

class Käyttöliittymä:
    def __init__(self):
        self.__pääikkuna = Tk()

        self.__tekstikenttä = Label(self.__pääikkuna, text="Tekstikenttä vasen")
        self.__tekstikenttä.pack(side=LEFT) #määrittää Labelin siijoituksen ikkunassa

        self.__tekstikenttä2 = Label(self.__pääikkuna, text="Hello World2!")
        self.__tekstikenttä2.pack(side=RIGHT) 

        self.__pääikkuna.mainloop()

def main():
    käli = Käyttöliittymä()

main()
