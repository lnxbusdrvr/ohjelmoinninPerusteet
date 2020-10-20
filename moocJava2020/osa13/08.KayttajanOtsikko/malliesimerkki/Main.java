package otsikko;
 
import java.util.Scanner;
import javafx.application.Application;
 
public class Main {
 
    public static void main(String[] args) {
        System.out.println("Hello world!");
 
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä otsikko laitetaan?");
        String otsikko = lukija.nextLine();
 
        Application.launch(KayttajanOtsikko.class, "--otsikko=" + otsikko);
 
    }
 
}
 
