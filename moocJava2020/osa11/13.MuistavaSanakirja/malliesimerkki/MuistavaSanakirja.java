package sanakirja;
 
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class MuistavaSanakirja {
 
    private Map<String, String> sanat;
    private String tiedosto;
 
    public MuistavaSanakirja() {
        this.sanat = new HashMap<>();
    }
 
    public MuistavaSanakirja(String tiedosto) {
        this();
        this.tiedosto = tiedosto;
    }
 
    public boolean lataa() {
        try {
            Files.lines(Paths.get(this.tiedosto))
                    .map(l -> l.split(":"))
                    .forEach(osat -> {
                        this.sanat.put(osat[0], osat[1]);
                        this.sanat.put(osat[1], osat[0]);
                    });
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
 
    public boolean tallenna() {
        try {
            PrintWriter kirjoittaja = new PrintWriter(new File(tiedosto));
            tallennaSanat(kirjoittaja);
            kirjoittaja.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
 
    public void lisaa(String sana, String kaannos) {
        if (sanat.containsKey(sana)) {
            return;
        }
 
        sanat.put(sana, kaannos);
        sanat.put(kaannos, sana);
    }
 
    public String kaanna(String sana) {
        return sanat.get(sana);
    }
 
    public void poista(String sana) {
        String kaannos = kaanna(sana);
 
        sanat.remove(sana);
        sanat.remove(kaannos);
    }
 
    private void tallennaSanat(PrintWriter kirjoittaja) throws IOException {
        List<String> joTiedostossa = new ArrayList<>();
        sanat.keySet().stream().forEach(sana -> {
            if (joTiedostossa.contains(sana)) {
                return;
            }
 
            String pari = sana + ":" + sanat.get(sana);
            kirjoittaja.println(pari);
 
            joTiedostossa.add(sana);
            joTiedostossa.add(sanat.get(sana));
        });
    }
}
 
