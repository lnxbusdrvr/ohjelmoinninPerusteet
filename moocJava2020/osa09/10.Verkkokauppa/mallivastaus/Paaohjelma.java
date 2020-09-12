

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        Varasto varasto = new Varasto();
        varasto.lisaaTuote("kahvi", 5, 10);
        varasto.lisaaTuote("maito", 3, 20);
        varasto.lisaaTuote("kerma", 2, 55);
        varasto.lisaaTuote("leipa", 7, 8);
 
        Scanner lukija = new Scanner(System.in);

        Kauppa kauppa = new Kauppa(varasto, lukija);
        kauppa.asioi("Pekka");
    }
}
