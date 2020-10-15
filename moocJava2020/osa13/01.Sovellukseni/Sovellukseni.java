package sovellukseni;

import javafx.application.Application;
import javafx.stage.Stage;

public class Sovellukseni extends Application {    

    public static void main(String[] args) {
        launch(Sovellukseni.class);
        System.out.println("Hello world!");
    }
    
    @Override
    public void start(Stage ikkuna) throws Exception {
        ikkuna.setTitle("Sovellukseni");
        ikkuna.show();
        
    }

}

