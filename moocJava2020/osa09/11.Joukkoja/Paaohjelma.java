

public class Paaohjelma {

    public static void main(String[] args) {
        //kokeile ohjelman toimintaa täällä
        Lauma l = new Lauma();
        l.lisaaLaumaan(new Elio(1,9));
        l.lisaaLaumaan(new Elio(4,2));
        System.out.println(l.toString());
    }
}
