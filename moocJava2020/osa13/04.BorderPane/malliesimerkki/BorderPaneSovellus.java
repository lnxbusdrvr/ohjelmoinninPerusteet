package borderpane;
 
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
 
public class BorderPaneSovellus extends Application {
 
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane komponenttiryhma = new BorderPane();
        komponenttiryhma.setTop(new Label("NORTH"));
        komponenttiryhma.setRight(new Label("EAST"));
        komponenttiryhma.setBottom(new Label("SOUTH"));
        
        Scene nakyma = new Scene(komponenttiryhma);
 
        stage.setScene(nakyma);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(BorderPaneSovellus.class);
        System.out.println("Hello world!");
    }
 
}
 
