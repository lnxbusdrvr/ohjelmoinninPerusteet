package sanakirja;

public class Main {
    public static void main(String[] args) {
        // Testaa sanakirjaa täällä
        /*MuistavaSanakirja sanakirja = new MuistavaSanakirja();
        sanakirja.lisaa("apina", "monkey");
        sanakirja.lisaa("banaani", "banana");
        sanakirja.lisaa("apina", "apfe");

        System.out.println(sanakirja.kaanna("apina"));
        System.out.println(sanakirja.kaanna("monkey"));
        System.out.println(sanakirja.kaanna("ohjelmointi"));
        System.out.println(sanakirja.kaanna("banana"));*/
        
        /*MuistavaSanakirja s = new MuistavaSanakirja("sanat-7017.txt");
        s.lataa();
        s.tulosta();
        s.poista("below");
        s.tulosta();
        //s.lataa();
        //s.poista("below");
        s.lisaa("tieokone", "computer");
        //s.tallenna();
        s.tulosta();*/
        
        MuistavaSanakirja s = new MuistavaSanakirja();
        s.lisaa("apina", "monkey");
        s.lisaa("tietokone", "computer");
        s.tulosta();
        s.poista("monkey");
        s.tulosta();
    }
}
