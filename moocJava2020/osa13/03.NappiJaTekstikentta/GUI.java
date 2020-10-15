package nappijatekstikentta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javax.security.auth.login.AppConfigurationEntry;

/**
 *
 * @author lnxbusdrvr
 */
public class GUI extends Application {

    @Override
    public void start(Stage ikkuna) throws Exception {
        Button nappi = new Button();
        TextField tekstia = new TextField("Kirjoita tänne jotakin");
        
        nappi.setText("Tämä on nappi");
        
        FlowPane komponentit = new FlowPane();
        komponentit.getChildren().add(nappi);
        komponentit.getChildren().add(tekstia);
        
        Scene nakyma = new Scene(komponentit);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    
    public void aloita() {
        launch(GUI.class);
    }
}
