

/**
 *
 * @author lnxbusdrvr
 * @param <T>
 */
public class Piilo<T> {
    private T piilo;

    public Piilo() {
        this.piilo = null;
    }
    
    public void laitaPiiloon(T piilotettava) {
        this.piilo = piilotettava;
    }
    
    public T otaPiilosta() {
        this.piilo = null;
        return this.piilo;
    }
    
    public boolean onkoPiilossa() {
        return this.piilo == null;
    }
    
    
}
