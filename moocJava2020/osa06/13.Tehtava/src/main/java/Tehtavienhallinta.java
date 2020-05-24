
import java.util.ArrayList;

public class Tehtavienhallinta {
    
    private ArrayList<String> tehtavat;
    private ArrayList<String> tehdytTehtavat;
    
    public Tehtavienhallinta() {
        this.tehtavat = new ArrayList<>();
        this.tehdytTehtavat = new ArrayList<>();
    }
    
    public ArrayList<String> tehtavalista() {
        return this.tehtavat;        
    }
    
    public void lisaa(String tehtava) {
        this.tehtavat.add(tehtava);
    }
    
    public void merkkaaTehdyksi(String tehtava) {
        this.tehdytTehtavat.add(tehtava);
    }
    
    public boolean onTehty(String tehtava) {
        return this.tehdytTehtavat.contains(tehtava);
    }


}

