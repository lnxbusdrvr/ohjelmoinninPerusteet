package sovellus;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VitsiSovellus extends Application {


    public static void main(String[] args) {
        System.out.println("Aloitetaan!");
        Application.launch(GUI.class);
    }
    
    @Override
    public void start(Stage ikkuna) {
        // Päätason asettelu
        BorderPane asetelma = new BorderPane();
        
        // Päätason valikko
        HBox valikko = new HBox();
        
        // Luodaan napit
        Button vitsiNappi = new Button("Vitsi");
        Button vastausNappi = new Button("Vastaus");
        Button selitysNappi = new Button("Selitys");
        
        // Asetetaan napit valikkoon
        valikko.getChildren().addAll(vitsiNappi, vastausNappi, selitysNappi);
        // Asetetaan valikko ylös
        asetelma.setTop(valikko);
        
        // Luodaan muut alinäkymät/sivut
        StackPane kysymysAsetelma = luoAsetelma("What do you call a bear with no teeth?");
        StackPane vastausAsetelma = luoAsetelma("A gummy bear.");
        StackPane selitysAsetelma = luoAsetelma("Seliseli");
        
        // Asetetaan nappien alle alinäkymät
        vitsiNappi.setOnAction((event) -> asetelma.setCenter(kysymysAsetelma));
        vastausNappi.setOnAction((event) -> asetelma.setCenter(vastausAsetelma));
        selitysNappi.setOnAction((event) -> asetelma.setCenter(selitysAsetelma));
        
        // Asetetaan kysymysAsetelma ensimmäiseksi
        asetelma.setCenter(kysymysAsetelma);
        
        Scene nakyma = new Scene(asetelma);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    
    private StackPane luoAsetelma(String teksti) {
        StackPane asetelma = new StackPane();
        asetelma.setPrefSize(300, 180);
        asetelma.getChildren().add(new Label(teksti));
        asetelma.setAlignment(Pos.CENTER);
        
        return asetelma;
    }
}
