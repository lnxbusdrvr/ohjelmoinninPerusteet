package sovellus;
 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class UseampiNakyma extends Application {
 
    @Override
    public void start(Stage ikkuna) throws Exception {
 
        Button ekaButton = new Button("Ekaan näkymään!");
        Button tokaButton = new Button("Tokaan näkymään!");
        Button kolmasButton = new Button("Kolmanteen näkymään!");
 
        BorderPane ekaLayout = new BorderPane();
        ekaLayout.setTop(new Label("Eka näkymä!"));
        ekaLayout.setCenter(tokaButton);
 
        VBox tokaLayout = new VBox();
        tokaLayout.getChildren().addAll(kolmasButton, new Label("Toka näkymä!"));
 
        GridPane kolmasLayout = new GridPane();
        kolmasLayout.add(new Label("Kolmas näkymä!"), 0, 0);
        kolmasLayout.add(ekaButton, 1, 1);
 
        Scene eka = new Scene(ekaLayout);
        Scene toka = new Scene(tokaLayout);
        Scene kolmas = new Scene(kolmasLayout);
 
        ekaButton.setOnAction((event) -> {
            ikkuna.setScene(eka);
        });
 
        tokaButton.setOnAction((event) -> {
            ikkuna.setScene(toka);
        });
 
        kolmasButton.setOnAction((event) -> {
            ikkuna.setScene(kolmas);
        });
 
        ikkuna.setScene(eka);
        ikkuna.show();
    }
 
    public static void main(String[] args) {
        launch(UseampiNakyma.class);
        System.out.println("Hello world!");
    }
 
}
 
