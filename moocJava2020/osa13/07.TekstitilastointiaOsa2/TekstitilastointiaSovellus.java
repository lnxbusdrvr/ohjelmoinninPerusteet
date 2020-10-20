package tekstitilastointia;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TekstitilastointiaSovellus extends Application {


    public static void main(String[] args) {
        System.out.println("Ohjelma alkaa");
        
        launch(TekstitilastointiaSovellus.class);
    }
    
    @Override
    public void start(Stage ikkuna) throws Exception {
        BorderPane asetelma = new BorderPane();
        
        TextArea tekstia = new TextArea();
        
        HBox alarivi = new HBox();
        
        Label txtKirjaimia = new Label("Kirjaimia: ");
        Label txtSanoja = new Label("Sanoja: ");
        Label txtPisin = new Label("Pisin sana on: ");
        
        
        
        
        tekstia.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
          int kirjaimia = uusiArvo.length();
          String[] palat = uusiArvo.split(" ");
          int sanoja = palat.length;
          String pisin = Arrays.stream(palat)
                  .sorted((s1, s2) -> s2.length() - s1.length())
                  //.findAny() // Ei vaikutusta
                  .findFirst()
                  .get();
          
          txtKirjaimia.setText("Kirjaimia: "+kirjaimia);
          txtSanoja.setText("Sanoja: "+sanoja);
          txtPisin.setText("Pisin sana on: "+pisin);                 
          
        });
        
        alarivi.setSpacing(10);
        alarivi.getChildren().add(txtKirjaimia);
        alarivi.getChildren().add(txtSanoja);
        alarivi.getChildren().add(txtPisin);
        
        asetelma.setCenter(tekstia);
        asetelma.setBottom(alarivi);
        
        Scene nakyma = new Scene(asetelma);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }

}
