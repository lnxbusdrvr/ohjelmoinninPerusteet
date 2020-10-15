package nappijatekstikentta;
 
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class NappiJaTekstikenttaSovellus extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
        Button nappi = new Button("Nappi");
        TextField tekstikentta = new TextField("Teksti");
 
        FlowPane komponenttiryhma = new FlowPane();
        komponenttiryhma.getChildren().add(nappi);
        komponenttiryhma.getChildren().add(tekstikentta);
 
        Scene nakyma = new Scene(komponenttiryhma);
 
        stage.setScene(nakyma);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(NappiJaTekstikenttaSovellus.class);
        System.out.println("Hello world!");
    }
 
}
