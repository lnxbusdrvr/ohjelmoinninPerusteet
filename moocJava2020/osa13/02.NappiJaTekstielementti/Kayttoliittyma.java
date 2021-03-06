package nappijatekstielementti;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author lnxbusdrvr
 */
public class Kayttoliittyma extends Application {

    @Override
    public void start(Stage ikkuna) throws Exception {
        Button nappi = new Button("Nappi");
        Label teksti = new Label();
        
        teksti.setText("Hei Maailma!");
        
        FlowPane komponentit = new FlowPane();
        komponentit.getChildren().add(nappi);
        komponentit.getChildren().add(teksti);
        
        Scene nakyma = new Scene(komponentit);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }
    
    public void aloita() {
        launch(Kayttoliittyma.class);
    }
}
