

import java.util.ArrayList;

public class Lastiruuma {

    private ArrayList<Matkalaukku> matkalaukut;
    private int maksimipaino;

    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.matkalaukut = new ArrayList<>();
    }

    public void lisaaMatkalaukku(Matkalaukku matkalaukku) {
        if (this.yhteispaino() + matkalaukku.yhteispaino() > maksimipaino) {
            return;
        }

        this.matkalaukut.add(matkalaukku);
    }

    public int yhteispaino() {
        /*int summa = 0;
        int indeksi = 0;
        while (indeksi < this.matkalaukut.size()) {
            summa += this.matkalaukut.get(indeksi).yhteispaino();
            indeksi++;
        }*/
        int summa = this.matkalaukut.stream()
                .map(m -> m.yhteispaino())
                .reduce(0, (bf, bo) -> bf + bo);                
        return summa;
    }

    public void tulostaTavarat() {
        /*int indeksi = 0;
        while (indeksi < this.matkalaukut.size()) {
            this.matkalaukut.get(indeksi).tulostaTavarat();
            indeksi++;
        }*/
        /*String yhdistetty = this.matkalaukut.stream()
                .map(m -> m.)
                .reduce("", (bf, bo) -> bf + bo+"\n");
        System.out.println(yhdistetty);*/
        this.matkalaukut.stream()
                .forEach(Matkalaukku::tulostaTavarat);
    }

    @Override
    public String toString() {
        if (this.matkalaukut.isEmpty()) {
            return "ei matkalaukkuja (0 kg)";
        }

        if (this.matkalaukut.size() == 1) {
            return "1 matkalaukku (" + this.yhteispaino() + " kg)";
        }

        return this.matkalaukut.size() + " matkalaukkua (" + this.yhteispaino() + " kg)";
    }
}
