

/**
 *
 * @author lnxbusdrvr
 */
public enum Koulutus {
    FT("tohtori"), 
    FM("maisteri"), 
    LuK("kandidaatti"), 
    FilYO("ylioppilas");
    
    private final String arvo;

    private Koulutus(String arvo) {
        this.arvo = arvo;
    }
    
    
    
}
