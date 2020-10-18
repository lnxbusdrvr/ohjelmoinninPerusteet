package ilmoitin;
 
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class IlmoitinSovellus extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
        TextField tekstikentta = new TextField();
        Button nappi = new Button("Päivitä");
        Label teksti = new Label();
        
        VBox komponenttiryhma = new VBox();
        komponenttiryhma.getChildren().addAll(tekstikentta, nappi, teksti);
        nappi.setOnAction((event) -> {
            teksti.setText(tekstikentta.getText());
        });
        
        Scene nakyma = new Scene(komponenttiryhma);
 
        stage.setScene(nakyma);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(IlmoitinSovellus.class);
        System.out.println("Hello world!");
    }
 
}
 
