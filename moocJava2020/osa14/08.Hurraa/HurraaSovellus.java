package hurraa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        Button nappi = new Button("Hurraa!");
        

        // Äänitiedosto
        AudioClip aanitiedosto = new AudioClip("file:front-desk-bells-daniel_simon.wav");
        
        // Napin toiminto
        nappi.setOnMouseClicked(( tapahtuma) -> {
            aanitiedosto.play();    // Ääni toimii ainakin kuulokkeilla
        });
        
        pane.setCenter(nappi);

        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
