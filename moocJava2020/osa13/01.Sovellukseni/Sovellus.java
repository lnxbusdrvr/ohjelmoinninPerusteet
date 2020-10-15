package sovellukseni;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author lnxbusdrvr
 */
public class Sovellus extends Application {

    @Override
    public void start(Stage ikkuna) throws Exception {
        ikkuna.setTitle("Sovellukseni");
        ikkuna.show();
        
    }
    
    public void kaynnista() {
        launch(Sovellus.class);
    }
}
