from tkinter import *

class Käyttöliittymä:
    def __init__(self):
        self.__pääikkuna = Tk()

        self.__tekstikenttä = Button(self.__pääikkuna, text="Värillinen nappi. Lopeta! ",
                                    background="green", foreground="white",
                                    padx=30, pady=10,
                                    relief=RAISED, borderwidth=5, command=self.lopeta)
        self.__tekstikenttä.pack(expand=True, fill=BOTH) 


        self.__lopetusnappi = Button(self.__pääikkuna, text="Lopeta ohjelma", 
                                    command=self.lopeta)
        self.__lopetusnappi.pack(side=RIGHT) 


        self.__pääikkuna.mainloop()

    def lopeta(self):
        self.__pääikkuna.destroy()

def main():
    käli = Käyttöliittymä()

main()
