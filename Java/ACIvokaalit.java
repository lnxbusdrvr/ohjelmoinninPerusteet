package harjoituksia;

import java.util.Scanner;

public class ACIvokaalit {
	private static Scanner lukija = new Scanner(System.in);

	  public static void main(String[] args) {

	    System.out.println("Syötä rivi. Tutkin vokaalien määrän.");
	    String rivi = lukija.nextLine();

	    int vokaaleja = 0;
	    for (int i=0; i<rivi.length(); ++i)
	      if (onVokaali(rivi.charAt(i)))
	        vokaaleja = vokaaleja + 1;

	    System.out.println("Rivillä oli " + vokaaleja + " vokaalia.");

	  }
	  
	  private static boolean onVokaali(char merkki) {  
		    return ("aeiouyåäöAEIOUYÅÄÖ".indexOf(merkki) != -1);
		  }
	} 
