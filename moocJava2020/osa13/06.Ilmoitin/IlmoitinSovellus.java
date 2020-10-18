package ilmoitin;

import javafx.application.Application;
import javafx.event.ActionEvent;
// ei-stream versiolle:
//import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class IlmoitinSovellus extends Application{

    public static void main(String[] args) {
        System.out.println("Ohjelma alkaa");
        launch(IlmoitinSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) throws Exception {
        Button nappi = new Button("Päivitä");
        TextField ylateksti = new TextField();
        Label alateksti = new Label();
        
        /* ei-stream versio
        nappi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent tapahtuma) {
                alateksti.setText(ylateksti.getText());
            }
        });
        */
        
        nappi.setOnAction((ActionEvent tapahtuma) -> {
            alateksti.setText(ylateksti.getText());
        });
        
        VBox asetelma = new VBox();
        asetelma.getChildren().addAll(ylateksti, nappi, alateksti);
        
        Scene nakyma = new Scene(asetelma);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
