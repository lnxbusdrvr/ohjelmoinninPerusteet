

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        
        /* Osa 2
        Kasi kasi = new Kasi();

        kasi.lisaa(new Kortti(2, Maa.RUUTU));
        kasi.lisaa(new Kortti(14, Maa.PATA));
        kasi.lisaa(new Kortti(12, Maa.HERTTA));
        kasi.lisaa(new Kortti(2, Maa.PATA));

        kasi.tulosta();*/
        
        // Osa 4
        Kasi kasi1 = new Kasi();

        kasi1.lisaa(new Kortti(2, Maa.RUUTU));
        kasi1.lisaa(new Kortti(14, Maa.PATA));
        kasi1.lisaa(new Kortti(12, Maa.HERTTA));
        kasi1.lisaa(new Kortti(2, Maa.PATA));

        Kasi kasi2 = new Kasi();

        kasi2.lisaa(new Kortti(14, Maa.RUUTU));
        kasi2.lisaa(new Kortti(14, Maa.PATA));
        kasi2.lisaa(new Kortti(11, Maa.HERTTA));
        

        int vertailu = kasi1.compareTo(kasi2);
        System.out.println(vertailu);

        if (vertailu < 0) {
            System.out.println("arvokkaampi käsi sisältää kortit2");
            kasi2.tulosta();
        } else if (vertailu > 0){
            System.out.println("arvokkaampi käsi sisältää kortit1");
            kasi1.tulosta();
        } else {
            System.out.println("kädet yhtä arvokkaat");
        }

        /*Kortti eka = new Kortti(2, Maa.RUUTU);
        Kortti toka = new Kortti(14, Maa.PATA);
        Kortti kolmas = new Kortti(12, Maa.HERTTA);

        System.out.println(eka);
        System.out.println(toka);
        System.out.println(kolmas);*/
    }
}
