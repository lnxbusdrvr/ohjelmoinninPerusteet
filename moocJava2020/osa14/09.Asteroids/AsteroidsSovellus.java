package asteroids;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class AsteroidsSovellus extends Application {
    
    // static tarkoittaa luokkakohtaista arvoa
    public static int LEVEYS = 300; // Vakiomuuttuja.
    public static int KORKEUS = 200;
    
    @Override
    public void start(Stage ikkuna) {
        Pane ruutu = new Pane();
        ruutu.setPrefSize(LEVEYS, KORKEUS);
        
        // Pisteet
        Text pisteteksti = new Text(10, 20, "Pisteet: ");
        pisteteksti.setFill(Color.RED);
        
        // Lopputekst
        Text lopputeksti = new Text(LEVEYS / 7, KORKEUS / 2, "Lopputeksti");
        // Teksti punaiseksi
        lopputeksti.setFill(Color.RED);
        // Isompi fontti
        lopputeksti.setFont(Font.font("Monospaced", 40));
        
        // Pisteiden nousua varten
        AtomicInteger pisteet = new AtomicInteger();
        
        //Äänitehosteet
        // https://freesound.org/people/fisch12345/sounds/325113/
        AudioClip loppu = new AudioClip("file:325113__fisch12345__error.wav");
        // https://freesound.org/people/IdkMrGarcia/sounds/446624/
        AudioClip rajahdys = new AudioClip("file:446624__idkmrgarcia__explosion2.wav");
        // https://freesound.org/people/V-ktor/sounds/435417/
        AudioClip ampuu = new AudioClip("file:435417__v-ktor__shoot02.wav");
        
        // Luodaan Alus
        Alus alus = new Alus(LEVEYS / 2, KORKEUS / 2);
        
        // Luodaan Asteroidit ja asetetaan ne listalle        
        List<Asteroidi> asteroidit = new ArrayList<>();
        
        for(int i = 0; i < 5; i++) {
            Random satunnainen = new Random();
            Asteroidi asteroidi = new Asteroidi(
                    satunnainen.nextInt(LEVEYS / 2), 
                    satunnainen.nextInt(KORKEUS / 2));
            asteroidit.add(asteroidi);
        }
        
        // Luodaan ammuksia varten lista
        List<Ammus> ammukset = new ArrayList<>();
        
        // Lisätään alus ja asteroidi ruutuun
        ruutu.getChildren().add(pisteteksti);
        ruutu.getChildren().add(alus.getHahmo());
        asteroidit.forEach(asteroidi -> ruutu.getChildren().add(asteroidi.getHahmo()));
        
        Scene nakyma = new Scene(ruutu);
        
        // Mappi sujuvaa kääntämistä varten
        Map<KeyCode, Boolean> painetutNapit = new HashMap<>();
        
        // Aluksen kääntö alkaa
        nakyma.setOnKeyPressed((tapahuma) -> {
            // true tarkoittaa, että nappi on pohjassa
            painetutNapit.put(tapahuma.getCode(), Boolean.TRUE);
        });
        
        nakyma.setOnKeyReleased((tapahtuma) ->{// Kun nappi vapautetaan
            painetutNapit.put(tapahtuma.getCode(), Boolean.FALSE);
        });
        
        
        // Annetaan animation luomiselle tarkoitetulle
        // AnimationTimer-luokalle toiminta, joka kääntää aluksen,
        // jos nappi on pohjassa tai ei
        
        // Toiminto alkaa:
        new AnimationTimer() {
            
            @Override
            public void handle(long nykyhetki) {
                // Vasen nuoli ja h-kirjain(oma lisä) ja a
                if((painetutNapit.getOrDefault(KeyCode.LEFT, Boolean.FALSE)) 
                        || 
                        (painetutNapit.getOrDefault(KeyCode.H, Boolean.FALSE) 
                        ||
                        (painetutNapit.getOrDefault(KeyCode.A, Boolean.FALSE)))) {
                    alus.kaannaVasemmalle();
                }
                
                // Oikealle, Oikea nuoli ja l-kirjain tai d
                if(painetutNapit.getOrDefault(KeyCode.RIGHT, Boolean.FALSE) 
                        ||
                        (painetutNapit.getOrDefault(KeyCode.L, Boolean.FALSE)
                        ||
                        (painetutNapit.getOrDefault(KeyCode.D, Boolean.FALSE)))) {
                    alus.kaannaOikealle();
                }
                
                // Alus liikkuu kärjen suuntaisesti käyttäen ylänappia ja k:ta, w
                if(painetutNapit.getOrDefault(KeyCode.UP, Boolean.FALSE) 
                        ||
                        (painetutNapit.getOrDefault(KeyCode.K, Boolean.FALSE)
                        ||
                        (painetutNapit.getOrDefault(KeyCode.W, Boolean.FALSE)))) {
                    alus.kiihdyta();
                }
                
                // Ammus
                                                                                  // Ammuksien määrä = pituus = kaunako SPACEa on painettu
                                                                                  //eli jos space on pohjassa, sitä muka pidempi ammus/viiva
                                                                                  // 1 tarkoitta, että ammus katoaa, 
                                                                                  // yhden asteroidin törmäykse jälkeen
                if(painetutNapit.getOrDefault(KeyCode.SPACE, Boolean.FALSE) && ammukset.size() < 1) {
                    Ammus ammus = new Ammus((int) alus.getHahmo().getTranslateX(), (int) alus.getHahmo().getTranslateY());
                    // Asettaa ammuutun suunan, joka on sama, kuin aluksella
                    ammus.getHahmo().setRotate(alus.getHahmo().getRotate());
                    // Lisätään ammus listaan
                    ammukset.add(ammus);
                    
                    // Kiihdytetään ammukseen nopeutta
                    ammus.kiihdyta();
                    ammus.setLiike(ammus.getLiike().normalize().multiply(3));
                    
                    // Lisää ammuksen ruutuun näkyville
                    ruutu.getChildren().add(ammus.getHahmo());
                    // Soita ampumisääni
                    ampuu.play();
                }
                
                // Asetetaan alus liikkumaan
                alus.liiku();
                // Asetetaan kaikki asteroidit liikkuu
                asteroidit.forEach(asteroidi -> asteroidi.liiku());
                // Asetetaan ammukset liikkumaan
                ammukset.forEach(ammus -> ammus.liiku());
                               
               // Ammuksen osuessa asteroidiin, 
               // asteroidi ja ammus asetetaat setElossa(false)
               ammukset.forEach(ammus -> {
                   asteroidit.forEach(asteroidi -> {
                       if(ammus.tormaa(asteroidi)) {
                           ammus.setElossa(false);
                           asteroidi.setElossa(false);
                       }
                   });
                   
                   /*if(!ammus.onElossa()) { // Järkevämpää olisi laittaa tänne
                                           // asteroidi, mutta siihen ei pääse
                                           // käsiksi
                       pistetxt.setText("Pisteet: "+pisteet.incrementAndGet());
                       rajahdys.play();
                   }*/
               });
               
               // Poistaa ammuksen ruudulta
               ammukset.stream()
                       .filter(ammus -> !ammus.onElossa())
                       .forEach(ammus -> ruutu.getChildren().remove(ammus.getHahmo()));
               
               // Poistetaan kaikki ammukset
               ammukset.removeAll(ammukset.stream()
                       .filter(ammus -> !ammus.onElossa())
                       .collect(Collectors.toList()));
               
               // Poistetaan törmätty asteroidi ruudulta
               asteroidit.stream()
                       .filter(asteroidi -> !asteroidi.onElossa())
                       .forEach(asteroidi -> {
                           // Vasta, kun asteroidi on hävinyt ruudulta, lisätään piste
                           pisteteksti.setText("Pisteet: "+pisteet.incrementAndGet());
                           // ja soitetaan räjähdys-soundi
                           rajahdys.play();
                           ruutu.getChildren().remove(asteroidi.getHahmo());
                });
               
               asteroidit.removeAll(asteroidit.stream()
                       .filter(asteroidi -> !asteroidi.onElossa())
                       .collect(Collectors.toList()));
                       
                       
                // Jos törmää yhteenkään asteroidiin,
                asteroidit.forEach(asteroidi -> {
                    if(alus.tormaa(asteroidi)) {
                        // soitetaat loppu-soundi
                        loppu.play();
                        // Lopputeksti
                        lopputeksti.setText("GAME OVER");
                        // Näytetään ruudulle lopputeksti
                        ruutu.getChildren().add(lopputeksti);
                        // ja pelin animaatio loppu, eli peli loppuu
                        stop();
                    }
                });
                
                // Luodaan uudet asteroidit, kun ne on tuhottu
                if(Math.random() < 0.005) {
                    Asteroidi asteroidi = new Asteroidi(LEVEYS, KORKEUS);
                    // Mikäli ei törmää alukseen
                    if(!asteroidi.tormaa(alus)) {
                        // Lisätään listalle uusi asteroidi
                        asteroidit.add(asteroidi);
                        // ja asetetaan asteroidi ruudulle
                        ruutu.getChildren().add(asteroidi.getHahmo());
                    }
                }
                
            }
           
        }.start();      
        // Toiminto loppuu
        // Aluksen kääntö loppuu
        
        ikkuna.setTitle("Asteroids!");
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }

    public static void main(String[] args) {
        System.out.println("Ohjelma alkaa!");
        launch(args);
    }

    public static int osiaToteutettu() {
        // Ilmoita tämän metodin palautusarvolla kuinka monta osaa olet tehnyt
        return 4;
    }

    

}
