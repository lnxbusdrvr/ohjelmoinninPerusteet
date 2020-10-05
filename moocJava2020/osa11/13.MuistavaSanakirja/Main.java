package sanakirja;

public class Main {
    public static void main(String[] args) {
        // Testaa sanakirjaa täällä
        MuistavaSanakirja sanakirja = new MuistavaSanakirja();
        sanakirja.lisaa("apina", "monkey");
        sanakirja.lisaa("banaani", "banana");
        sanakirja.lisaa("apina", "apfe");

        System.out.println(sanakirja.kaanna("apina"));
        System.out.println(sanakirja.kaanna("monkey"));
        System.out.println(sanakirja.kaanna("ohjelmointi"));
        System.out.println(sanakirja.kaanna("banana"));
    }
}
