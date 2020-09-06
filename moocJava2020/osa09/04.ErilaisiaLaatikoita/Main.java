

public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmaasi täällä
        /*Laatikko laatikko = new MaksimipainollinenLaatikko(5);
        laatikko.lisaa(new Tavara("a", 1));
        laatikko.lisaa(new Tavara("b", 2));
        laatikko.lisaa(new Tavara("c", 2));
        laatikko.lisaa(new Tavara("d", 1));
        laatikko.lisaa(new Tavara("f", 0));
        laatikko.onkoLaatikossa(new Tavara("d"));*/
        MaksimipainollinenLaatikko kahviLaatikko = new MaksimipainollinenLaatikko(10);
        kahviLaatikko.lisaa(new Tavara("Saludo", 5));
        kahviLaatikko.lisaa(new Tavara("Pirkka", 5));
        kahviLaatikko.lisaa(new Tavara("Kopi Luwak", 5));

        System.out.println(kahviLaatikko.onkoLaatikossa(new Tavara("Saludo")));
        System.out.println(kahviLaatikko.onkoLaatikossa(new Tavara("Pirkka")));
        System.out.println(kahviLaatikko.onkoLaatikossa(new Tavara("Kopi Luwak")));
    }
}
