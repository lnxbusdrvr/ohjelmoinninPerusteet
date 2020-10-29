package ristinolla;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RistinollaSovellus extends Application {


    public static void main(String[] args) {
        System.out.println("Ohjelma alkaa!");
        launch(RistinollaSovellus.class);
    }
    
    @Override
    public void start(Stage ikkuna)  {
        BorderPane asettelu = new BorderPane();
        
        //HBox ylavalikko = new HBox();
        
        Label ylateksti = new Label("Vuoro: ");
        //Label vuoro = new Label("X");
        
        ylateksti.setFont(Font.font("Monospaced", 40));
        
        //ylavalikko.getChildren().addAll(ylateksti, vuoro);
        
                
        GridPane ristikko = new GridPane();
        
        // Asetetaan ristikon napit        
        // Luodaan 3x3 ristikko
        for (int rivi = 1; rivi <= 3; rivi++) {
            for (int sarake = 1; sarake <= 3; sarake++) {
                // Javassa ei ole mahdollista luoda muuttuijia, jonka nimessä
                // oleva numero kasvaa, 
                // nappi11, nappi12, nappi13
                // nappi21, nappi22, nappi23 jne
                ristikko.add(new Button(), rivi, sarake);
            }
        }
        
        ristikko.setHgap(10);
        ristikko.setVgap(10);
        ristikko.setAlignment(Pos.CENTER);
        
        asettelu.setTop(ylateksti);
        asettelu.setCenter(ristikko);
        
        Scene nakyma = new Scene(asettelu, 350, 350);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
