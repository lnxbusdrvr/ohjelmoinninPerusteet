package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author lnxbusdrvr
 */
public class GUI extends Application {

    @Override
    public void start(Stage ikkuna) {
        // ekaNakyma
        BorderPane asetelma = new BorderPane();
        
        asetelma.setTop(new Label("Eka näkymä!"));
        Button tokaan = new Button("Tokaan näkymään!");
        asetelma.setCenter(tokaan);
        
        // tokaNakyma      
        VBox tokaAsetelma = new VBox();
        
        Button kolmanteen = new Button("Kolmanteen näkymään!");
        
        tokaAsetelma.getChildren().add(kolmanteen);
        tokaAsetelma.getChildren().add(new Label("Toka näkymä!"));
        
        // kolmasNakyma
        GridPane kolmasAsetelma = new GridPane();
        
        kolmasAsetelma.add(new Label("Kolmas näkymä!"), 0, 0);
        Button ekaan = new Button("Ekaan näkymään!");
        kolmasAsetelma.add(ekaan, 1, 1);
        
        Scene ekaNakyma = new Scene(asetelma);
        Scene tokaNakyma = new Scene(tokaAsetelma);
        Scene kolmasNakyma = new Scene(kolmasAsetelma);
        
        tokaan.setOnAction((event) -> {
            ikkuna.setScene(tokaNakyma);
        });
        
        kolmanteen.setOnAction((event) -> {
            ikkuna.setScene(kolmasNakyma);
        });
        
        ekaan.setOnAction((event) -> {
            ikkuna.setScene(ekaNakyma);
        });
        
        // Ikkunaan määritellään vain ekaNakyma
        ikkuna.setScene(ekaNakyma);
        ikkuna.show();       
        
    }
    
}
