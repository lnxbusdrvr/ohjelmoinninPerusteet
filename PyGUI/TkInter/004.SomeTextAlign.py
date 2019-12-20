from tkinter import *

class Käyttöliittymä:
    def __init__(self):
        self.__pääikkuna = Tk()

        self.__tekstikenttä = Label(self.__pääikkuna, text="Tekstikenttä ylhäällä")
        self.__tekstikenttä.pack(side=TOP) 

        self.__tekstikenttävasen = Label(self.__pääikkuna, text="Tekstikenttä vasemmalla")
        self.__tekstikenttävasen.pack(side=LEFT)

        self.__tekstikenttäoikea = Label(self.__pääikkuna, text="Tekstikenttä oikealla")
        self.__tekstikenttäoikea.pack(side=RIGHT) 

        self.__tekstikenttäalhaalla = Label(self.__pääikkuna, text="Tekstikenttä alhaalla")
        self.__tekstikenttäalhaalla.pack(side=BOTTOM) 

        self.__pääikkuna.mainloop()

def main():
    käli = Käyttöliittymä()

main()
