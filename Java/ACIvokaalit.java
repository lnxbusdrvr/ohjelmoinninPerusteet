package harjoituksia;

import java.util.Scanner;

public class ACIvokaalit {
	private static Scanner lukija = new Scanner(System.in);

	  public static void main(String[] args) {

	    System.out.println("Sy�t� rivi. Tutkin vokaalien m��r�n.");
	    String rivi = lukija.nextLine();

	    int vokaaleja = 0;
	    for (int i=0; i<rivi.length(); ++i)
	      if (onVokaali(rivi.charAt(i)))
	        vokaaleja = vokaaleja + 1;

	    System.out.println("Rivill� oli " + vokaaleja + " vokaalia.");

	  }
	  
	  private static boolean onVokaali(char merkki) {  
		    return ("aeiouy���AEIOUY���".indexOf(merkki) != -1);
		  }
	} 
