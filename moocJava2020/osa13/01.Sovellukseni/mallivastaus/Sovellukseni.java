package sovellukseni;

import javafx.application.Application;
import javafx.stage.Stage;

public class Sovellukseni extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Sovellukseni");
        stage.show();
    }

    public static void main(String[] args) {
        launch(Sovellukseni.class);
        System.out.println("Hello world!");
    }

}

