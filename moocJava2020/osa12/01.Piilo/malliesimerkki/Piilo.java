 
public class Piilo<T> {
 
    private T piilossa;
 
    public void laitaPiiloon(T piilotettava) {
        this.piilossa = piilotettava;
    }
 
    public boolean onkoPiilossa() {
        return this.piilossa != null;
    }
 
    public T otaPiilosta() {
        T piilossaOllut = this.piilossa;
        this.piilossa = null;
        return piilossaOllut;
    }
}
 
