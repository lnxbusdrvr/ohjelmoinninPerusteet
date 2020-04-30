public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattava) {
        if(this.nelioita > verrattava.nelioita) {
            return true;
        }else{
            return false;
        }
    }
    
    public int hintaero(Asunto verrattava) {
        int tamaHinta = this.neliohinta * this.nelioita;
        int verrHinta = verrattava.neliohinta * verrattava.nelioita;
        int hintaero = Math.abs(tamaHinta - verrHinta);
        
        return hintaero;
    }
    
    public boolean kalliimpi(Asunto verrattava) {
        int tamaHinta = this.neliohinta * this.nelioita;
        int verrHinta = verrattava.neliohinta * verrattava.nelioita;
        
        if(tamaHinta > verrHinta) {
            return true;            
        }else{
            return false;
        }
    }

}
