package tekstitilastointia;
 
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
        BorderPane komponenttiryhma = new BorderPane();
        komponenttiryhma.setCenter(new TextArea());
        
        HBox hbox = new HBox();
        hbox.setSpacing(20);
        hbox.getChildren().add(new Label("Kirjaimia: 0"));
        hbox.getChildren().add(new Label("Sanoja: 0"));
        hbox.getChildren().add(new Label("Pisin sana on: "));
        
        komponenttiryhma.setBottom(hbox);
        
        Scene nakyma = new Scene(komponenttiryhma);
 
        stage.setScene(nakyma);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
        System.out.println("Hello world!");
    }
 
}
 
