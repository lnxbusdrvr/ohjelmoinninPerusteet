package otsikko;

import javafx.application.Application;
import javafx.stage.Stage;


public class KayttajanOtsikko extends Application {

    @Override
    public void start(Stage ikkuna) {
        Parameters params = getParameters();
        
        String otsikko = params.getNamed().get("ots");
        
        ikkuna.setTitle(otsikko);
        ikkuna.show();
    }


}
