package sovellus;
 
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class VitsiSovellus extends Application {
 
    @Override
    public void start(Stage ikkuna) throws Exception {
 
        BorderPane asettelu = new BorderPane();
 
        HBox valikko = new HBox();
        valikko.setPadding(new Insets(10, 10, 10, 10));
        valikko.setSpacing(10);
 
        Button vitsinappi = new Button("Vitsi");
        Button vastausnappi = new Button("Vastaus");
        Button selitysnappi = new Button("Selitys");
 
        valikko.getChildren().addAll(vitsinappi, vastausnappi, selitysnappi);
 
        asettelu.setTop(valikko);
 
        // 2. Luodaan nappeja vastaavat asettelut
        StackPane vitsi = luoNakyma("What do you call a bear with no teeth?");
        StackPane vastaus = luoNakyma("A gummy bear.");
        StackPane explanation = luoNakyma("...");
 
        asettelu.setCenter(vitsi);
 
        vitsinappi.setOnAction((event) -> asettelu.setCenter(vitsi));
        vastausnappi.setOnAction((event) -> asettelu.setCenter(vastaus));
        selitysnappi.setOnAction((event) -> asettelu.setCenter(explanation));
 
        Scene nakyma = new Scene(asettelu);
 
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
 
    private StackPane luoNakyma(String teksti) {
 
        StackPane asettelu = new StackPane();
        asettelu.setPrefSize(300, 180);
        asettelu.getChildren().add(new Label(teksti));
        asettelu.setAlignment(Pos.CENTER);
 
        return asettelu;
    }
 
    public static void main(String[] args) {
        launch(VitsiSovellus.class);
        System.out.println("Hello world!");
    }
}
 
