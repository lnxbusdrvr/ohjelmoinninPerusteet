

public class Main {

    public static void main(String[] args) {
        // kirjoita tänne testikoodia
        
        // Osa 1
        Henkilo ada = new Henkilo("Ada Lovelace", "Korsontie 1 03100 Vantaa");
        Henkilo esko = new Henkilo("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
                
        // Osa 2
        Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("opintopisteitä " + olli.opintopisteita());
        olli.opiskele();
        System.out.println("opintopisteitä "+ olli.opintopisteita());
        
        // Osa 3
        //Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
        System.out.println(olli);
        olli.opiskele();
        System.out.println(olli);

    }

}
