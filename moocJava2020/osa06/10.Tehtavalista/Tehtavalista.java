
import java.util.ArrayList;

public class Tehtavalista {
    private ArrayList<String> lista;
    
    public Tehtavalista() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(String tehtava) {
        this.lista.add(tehtava);
    }
    
    public void tulosta() {
        // for-each laskuri pitää esitellä
        // globalina muuttujana,
        // jotta se toimisi
        int i = 1;
        for(String list : this.lista) {
            System.out.println(i+": "+list);
            i++;
        }
    }
    
    public void poista(int numero) {
        this.lista.remove(numero);
    }
}
