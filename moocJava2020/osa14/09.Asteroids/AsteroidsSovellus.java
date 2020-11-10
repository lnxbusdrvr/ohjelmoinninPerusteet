package asteroids;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AsteroidsSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna) {
        Pane ruutu = new Pane();
        ruutu.setPrefSize(600, 400);
        
        // Luodaan Alus
        Alus alus = new Alus(150, 100);
        
        // Luodaan Asteroidit ja asetetaan ne listalle        
        List<Asteroidi> asteroidit = new ArrayList<>();
        
        for(int i = 0; i < 5; i++) {
            Random satunnainen = new Random();
            Asteroidi asteroidi = new Asteroidi(satunnainen.nextInt(100), satunnainen.nextInt(100));
            asteroidit.add(asteroidi);
        }
        
        // Lisätään alus ja asteroidi ruutuun
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
                // Vasen nuoli ja h-kirjain(oma lisä)
                if((painetutNapit.getOrDefault(KeyCode.LEFT, Boolean.FALSE)) 
                        || 
                        (painetutNapit.getOrDefault(KeyCode.H, Boolean.FALSE))) {
                    alus.kaannaVasemmalle();
                }
                
                // Oikealle, Oikea nuoli ja l-kirjain
                if(painetutNapit.getOrDefault(KeyCode.RIGHT, Boolean.FALSE) 
                        ||
                        (painetutNapit.getOrDefault(KeyCode.L, Boolean.FALSE))) {
                    alus.kaannaOikealle();
                }
                
                // Alus liikkuu kärjen suuntaisesti käyttäen ylänappia ja k:ta
                if(painetutNapit.getOrDefault(KeyCode.UP, Boolean.FALSE) 
                        ||
                        (painetutNapit.getOrDefault(KeyCode.K, Boolean.FALSE))) {
                    alus.kiihdyta();
                }
                
                // Asetetaan alus liikkumaan
                alus.liiku();
                // Kaikki asteroidit liikkuu
                asteroidit.forEach(asteroidi -> asteroidi.liiku());
                
                // Jos törmää yhteenkään asteroidiin
                asteroidit.forEach(asteroidi -> {
                    if(alus.tormaa(asteroidi)) {
                        // niin peli animaatio loppu, eli peli loppuu
                        stop();
                    }
                });
                
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
        return 3;
    }

    

}
