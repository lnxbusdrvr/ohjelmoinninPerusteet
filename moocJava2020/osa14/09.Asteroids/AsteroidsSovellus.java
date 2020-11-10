package asteroids;

import java.util.HashMap;
import java.util.Map;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class AsteroidsSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna) {
        Pane ruutu = new Pane();
        ruutu.setPrefSize(600, 400);
        
        // Alus
                                        // Octaconista tehdään kolmio
        Polygon alus = new Polygon(-5, -5, 10, 0, -5, 5);
        //missä kohdassa alus on ruudulla
        alus.setTranslateX(300);//Leveys
        alus.setTranslateY(200);  //Korkeus
        
        // Lisätään alus ruutuun
        ruutu.getChildren().add(alus);
        
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
                    alus.setRotate(alus.getRotate() - 5);
                }
                
                // Oikealle, Oikea nuoli ja l-kirjain
                if(painetutNapit.getOrDefault(KeyCode.RIGHT, Boolean.FALSE) 
                        ||
                        (painetutNapit.getOrDefault(KeyCode.L, Boolean.FALSE))) {
                    alus.setRotate(alus.getRotate() + 5);
                }
                
            }
           
        }.start();      
        // Toiminto loppuu
        // Aluksen kääntö alkaa
        
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
        return 1;
    }

    

}
