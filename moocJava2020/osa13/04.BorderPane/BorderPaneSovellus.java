package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneSovellus extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(BorderPaneSovellus.class);
    }
    
    @Override
    public void start(Stage ikkuna) throws Exception {
        BorderPane asetelma = new BorderPane();
        
        asetelma.setTop(new Label("NORTH"));
        asetelma.setRight(new Label("EAST"));
        asetelma.setBottom(new Label("SOUTH"));
        /*
        FlowPane kompo = new FlowPane();
        kompo.getChildren().add(asetelma);
        
        Scene nakyma = new Scene(kompo);*/
        Scene nakyma = new Scene(asetelma);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}