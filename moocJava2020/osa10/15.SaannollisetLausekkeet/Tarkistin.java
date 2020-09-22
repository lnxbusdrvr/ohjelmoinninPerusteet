

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
    
    public boolean kellonaika(String merkkijono) {
        return merkkijono
            .matches("(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])");
    }

}
