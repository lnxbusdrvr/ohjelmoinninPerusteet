package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


public class HymioSovellus extends Application {


    public static void main(String[] args) {
        System.out.println("Ohjelma alkaa!");
        launch(HymioSovellus.class);
    }

    @Override
    public void start(Stage ikkune) throws Exception {
        Canvas piirtoalusta = new Canvas(400, 400);
        GraphicsContext piirturi = piirtoalusta.getGraphicsContext2D();
        
        // Taustaväri, ei tee mitään
        //piirturi.setFill(Color.BLACK);
        //piirturi.clearRect(0, 0, 400, 400);
        
        // Piirustusväri
        piirturi.setFill(Color.BLACK);
        
        // 8-bit hymiö
       // aloituskohta/mista1, rivi/mista2, mihin1, mihin2 
        piirturi.fillRect(100, 50, 50, 50); // Vasen silmä
        piirturi.fillRect(250, 50, 50, 50); // Oikea silmä
        piirturi.fillRect(50, 200, 50, 50); // Vasen suupieli
        piirturi.fillRect(100, 250, 200, 50); // Huuli
        piirturi.fillRect(300, 200, 50, 50); // Oikea suupieli
                
        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(piirtoalusta);
                              
        /*piirtoalusta.setOnMouseDragged((tapahtuma) -> {
            double kohtaX = tapahtuma.getX();
            double kohtaY = tapahtuma.getY();
            // Piirtoväri
            piirturi.setFill(Color.BLACK);
            piirturi.fillRect(kohtaX, kohtaY, 50, 50);
        });*/
        
        Scene nakyma = new Scene(asettelu);
        
        ikkune.setScene(nakyma);
        ikkune.show();
    }

}
