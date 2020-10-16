package tekstitilastointia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TekstitilastointiaSovellus extends Application {


    public static void main(String[] args) {
        System.out.println("Aloitetaan!");
        launch(TekstitilastointiaSovellus.class);
    }
    
    @Override
    public void start(Stage ikkuna) throws Exception {
        BorderPane asetelma = new BorderPane();
        
        HBox tekstit = new HBox();
        tekstit.setSpacing(10);
        
        tekstit.getChildren().add(new Label("Kirjaimia: 0"));
        tekstit.getChildren().add(new Label("Sanoja: 0"));
        tekstit.getChildren().add(new Label("Pisin sana on:"));
        
        asetelma.setCenter(new TextArea("Kirjoita jotakin tänne"));
        asetelma.setBottom(tekstit);
        
        Scene nakyma = new Scene(asetelma);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}