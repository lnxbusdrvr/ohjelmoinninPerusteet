package nappijatekstielementti;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class NappiJaTekstielementtiSovellus extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
        Button nappi = new Button("Nappi");
        Label teksti = new Label("Teksti");
 
        FlowPane komponenttiryhma = new FlowPane();
        komponenttiryhma.getChildren().add(nappi);
        komponenttiryhma.getChildren().add(teksti);
 
        Scene nakyma = new Scene(komponenttiryhma);
 
        stage.setScene(nakyma);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(NappiJaTekstielementtiSovellus.class);
        System.out.println("Hello world!");
    }
 
}
 
