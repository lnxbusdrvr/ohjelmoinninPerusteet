package kollaasi;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class KollaasiSovellus extends Application {

    @Override
    public void start(Stage stage) {

        // esimerkki avaa kuvan, luo uuden kuvan, ja kopioi avatun kuvan 
        // uuteen kuvaan pikseli kerrallaan
        Image lahdeKuva = new Image("file:monalisa.png");

        PixelReader kuvanLukija = lahdeKuva.getPixelReader();

        int leveys = (int) lahdeKuva.getWidth();
        int korkeus = (int) lahdeKuva.getHeight();

        WritableImage kohdeKuva = new WritableImage(leveys, korkeus);
        PixelWriter kuvanKirjoittaja = kohdeKuva.getPixelWriter();

        // Alkuperäinen
        
        int yKoordinaatti = 0;
        while (yKoordinaatti < korkeus / 2) {   //Pienentää kuvan 50%, / 2
            int xKoordinaatti = 0;
            while (xKoordinaatti < leveys / 2) {//Pienentää kuvan 50%, / 2
                Color vari = kuvanLukija.getColor(xKoordinaatti*2, yKoordinaatti*2);
                    
                double punainen = 1.0 - vari.getRed();
                double vihrea = 1.0 - vari.getGreen();
                double sininen = 1.0 - vari.getBlue();
                double lapinakyvyys = vari.getOpacity();

                Color uusiVari = new Color(punainen, vihrea, sininen, lapinakyvyys);
                
                kuvanKirjoittaja.setColor(xKoordinaatti, yKoordinaatti, uusiVari);      // Vasen yläkuva
                kuvanKirjoittaja.setColor((leveys/2)+xKoordinaatti, yKoordinaatti, uusiVari);  // Oikea yläkuva
                kuvanKirjoittaja.setColor(xKoordinaatti, (korkeus/2)+yKoordinaatti, uusiVari);  // Vasen alakuva
                kuvanKirjoittaja.setColor((leveys/2)+xKoordinaatti, (korkeus/2)+yKoordinaatti, uusiVari);  // Oikea alakuva
                xKoordinaatti++;
            }       
            yKoordinaatti++;
        }
        /*
        // kollaasi'
        System.out.println("kollaasi alkaa");
        System.out.println("Leveys ennen looppia: "+leveys+" Korkeus ennen looppia: "+korkeus);
        for(int yLeveys = 0; yLeveys < leveys; yLeveys++) {
            for(int xKorkeus = 0; xKorkeus < korkeus; xKorkeus++) {
                System.out.println(" yLeveys: "+yLeveys+" xKorkeus: "+xKorkeus);
                Color vari = kuvanLukija.getColor(yLeveys, xKorkeus);
                
                kuvanKirjoittaja.setColor(100, 10, vari);// Vasen yläkuva
            }
        }
        while (yKoordKoll < korkeus / 2 ) {  // Pienennetään kuvaa / 2
            int xKoordKoll = 0;
            while (xKoordKoll < leveys / 2) { // Pienennetään kuvaa / 2

                Color vari = kuvanLukija.getColor(xKoordKoll, yKoordKoll);
                double punainen = vari.getRed();
                double vihrea = vari.getGreen();
                double sininen = vari.getBlue();
                double lapinakyvyys = vari.getOpacity();

                Color uusiVari = new Color(punainen, vihrea, sininen, lapinakyvyys);
                
                // Vasen yläkuva
                kuvanKirjoittajaKoll.setColor(xKoordKoll, yKoordKoll, uusiVari);
                // Oikea yläkuva
                //kuvanKirjoittaja.setColor((leveys / 2) + xKoordinaatti, yKoordinaattiKoll, uusiVari);
                
                xKoordKoll++;
            }
            yKoordKoll++;
        }*/
        // Kollaasi loppuu
        

        ImageView kuva = new ImageView(kohdeKuva);
        /*ImageView kuva1 = new ImageView(kohdeKuva);
        ImageView kuva2 = new ImageView(kohdeKuva);
        ImageView kuva3 = new ImageView(kohdeKuva);
        ImageView kuva4 = new ImageView(kohdeKuva);
        
        
        // Kuvan skaalautuvuus
        kuva1.setScaleX(0.5);
        kuva1.setScaleY(0.5);
        kuva2.setScaleX(0.5);
        kuva2.setScaleY(0.5);
        kuva3.setScaleX(0.5);
        kuva3.setScaleY(0.5);
        kuva4.setScaleX(0.5);
        kuva4.setScaleY(0.5);
        
        // Kordinaadit
        kuva1.setTranslateX(-128); // Vasen reuna
        kuva1.setTranslateY(-192); // Yläreuna
        kuva2.setTranslateX(129);
        kuva2.setTranslateY(-192);
        kuva3.setTranslateX(-128);
        kuva3.setTranslateY(192);
        kuva4.setTranslateX(129);
        kuva4.setTranslateY(192);*/

        Pane pane = new Pane();
        pane.getChildren().add(kuva);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
