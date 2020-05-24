
import java.util.ArrayList;

public class Tehtavienhallinta {
    
    private ArrayList<String> tehtavat;
    
    public Tehtavienhallinta() {
        this.tehtavat = new ArrayList<>();
    }
    
    public ArrayList<String> tehtavalista() {
        return this.tehtavat;
    }
    
    public void lisaa(String tehtava) {
        this.tehtavat.add(tehtava);
    }

}

