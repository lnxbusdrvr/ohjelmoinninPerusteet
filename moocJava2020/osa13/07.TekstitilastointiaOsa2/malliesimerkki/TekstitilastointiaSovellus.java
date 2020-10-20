package tekstitilastointia;
 
import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
 
public class TekstitilastointiaSovellus extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
        TextArea tekstikentta = new TextArea();
        Label kirjaimiaLabel = new Label("Kirjaimia: 0");
        Label sanojaLabel = new Label("Sanoja: 0");
        Label pisinsanaLabel = new Label("Pisin sana on: ");
        
        BorderPane komponenttiryhma = new BorderPane();
        komponenttiryhma.setCenter(tekstikentta);
 
        HBox hbox = new HBox();
        hbox.setSpacing(20);
        hbox.getChildren().add(kirjaimiaLabel);
        hbox.getChildren().add(sanojaLabel);
        hbox.getChildren().add(pisinsanaLabel);
 
        komponenttiryhma.setBottom(hbox);
 
        tekstikentta.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanoja = palat.length;
            String pisin = Arrays.stream(palat)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
 
            kirjaimiaLabel.setText("Kirjaimia: " + merkkeja);
            sanojaLabel.setText("Sanoja: " + sanoja);
            pisinsanaLabel.setText("Pisin sana on: " + pisin);
        });
 
        Scene nakyma = new Scene(komponenttiryhma);
 
        stage.setScene(nakyma);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
        System.out.println("Hello world!");
    }
 
}

