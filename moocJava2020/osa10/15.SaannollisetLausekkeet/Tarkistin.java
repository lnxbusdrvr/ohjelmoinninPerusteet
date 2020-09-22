

public class Tarkistin {
    
    public boolean onViikonpaiva(String merkkijono) {
        return merkkijono.matches("ma|ti|ke|to|pe|la|su");
    }
    
    public boolean kaikkiVokaaleja(String merkkijono) {
        return merkkijono.matches("[aeiouöäå]*");
        /*if(merkkijono.matches("[aeiouyöäå]*")) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;*/
    }

}
