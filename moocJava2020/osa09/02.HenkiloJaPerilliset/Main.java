
import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        // kirjoita tänne testikoodia
        
        // Osa 1
        /*
        Henkilo ada = new Henkilo("Ada Lovelace", "Korsontie 1 03100 Vantaa");
        Henkilo esko = new Henkilo("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);*/
                
        // Osa 2
        /*
        Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("opintopisteitä " + olli.opintopisteita());
        olli.opiskele();
        System.out.println("opintopisteitä "+ olli.opintopisteita());*/
        
        // Osa 3
        /*Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
        System.out.println(olli);
        olli.opiskele();
        System.out.println(olli);*/
        
        // Osa 4
        /*
        Opettaja ada = new Opettaja("Ada Lovelace", "Korsontie 1 03100 Vantaa", 1200);
        Opettaja esko = new Opettaja("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");

        int i = 0;
        while (i < 25) {
            olli.opiskele();
            i = i + 1;
        }
        System.out.println(olli);*/
        
        ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();
        henkilot.add(new Opettaja("Ada Lovelace", "Korsontie 1 03100 Vantaa", 1200));
        henkilot.add(new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki"));

        tulostaHenkilot(henkilot);

    }

    public static void tulostaHenkilot(ArrayList<Henkilo> henkilot) {
        for(Henkilo henki : henkilot) {
            System.out.println(henki);
        }
    }

}
