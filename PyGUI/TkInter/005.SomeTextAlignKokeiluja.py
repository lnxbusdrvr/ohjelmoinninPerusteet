from tkinter import *

class Käyttöliittymä:
    def __init__(self):
        self.__pääikkuna = Tk()

        self.__tekstikenttä = Label(self.__pääikkuna, text="Tekstikenttä ylhäällä")
        self.__tekstikenttä.pack(side=TOP) 
        self.__tekstikenttäallekkain2 = Label(self.__pääikkuna, text="Tekstikenttä ylhäällä")
        self.__tekstikenttäallekkain2.pack(side=TOP) 
        self.__tekstikenttäallekkain3 = Label(self.__pääikkuna, text="Tekstikenttä ylhäällä")
        self.__tekstikenttäallekkain3.pack(side=TOP) 

        self.__tekstikenttävasen = Label(self.__pääikkuna, text="Tekstikenttä vasemmalla")
        self.__tekstikenttävasen.pack(side=LEFT)
        self.__tekstikenttävasen2 = Label(self.__pääikkuna, text="Tekstikenttä vasemmalla")
        self.__tekstikenttävasen2.pack(side=LEFT)
        self.__tekstikenttävasen3 = Label(self.__pääikkuna, text="Tekstikenttä vasemmalla")
        self.__tekstikenttävasen3.pack(side=LEFT)

        self.__tekstikenttäoikea = Label(self.__pääikkuna, text="Tekstikenttä oikealla")
        self.__tekstikenttäoikea.pack(side=RIGHT) 
        self.__tekstikenttäoikea2 = Label(self.__pääikkuna, text="Tekstikenttä oikealla")
        self.__tekstikenttäoikea2.pack(side=RIGHT) 
        self.__tekstikenttäoikea3 = Label(self.__pääikkuna, text="Tekstikenttä oikealla")
        self.__tekstikenttäoikea3.pack(side=RIGHT) 

        self.__tekstikenttäalhaalla = Label(self.__pääikkuna, text="Tekstikenttä alhaalla")
        self.__tekstikenttäalhaalla.pack(side=BOTTOM) 
        self.__tekstikenttäalhaalla2 = Label(self.__pääikkuna, text="Tekstikenttä alhaalla")
        self.__tekstikenttäalhaalla2.pack(side=BOTTOM) 
        self.__tekstikenttäalhaalla3 = Label(self.__pääikkuna, text="Tekstikenttä alhaalla")
        self.__tekstikenttäalhaalla3.pack(side=BOTTOM) 

        self.__pääikkuna.mainloop()

def main():
    käli = Käyttöliittymä()

main()
