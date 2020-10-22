package sovellus;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TervehtijaSovellus extends Application {


    public static void main(String[] args) {
        System.out.println("Ohjelma alkaa!");
        launch(TervehtijaSovellus.class);
    }
    
    @Override
    public void start(Stage ikkuna) {
        // Eka
        Label kylttiEka = new Label("Kirjoita nimesi ja aloita.");
        TextField tekstiEka = new TextField();
        Button nappiEka = new Button("Aloita");
        
        GridPane ekaAsetelma = new GridPane();
        
        ekaAsetelma.add(kylttiEka, 0, 0);
        ekaAsetelma.add(tekstiEka, 0, 1);
        ekaAsetelma.add(nappiEka, 0, 2);
        
        // Asetellaan ekaa näkymä
        ekaAsetelma.setPrefSize(300, 180);      //Ekan näkymän suuruus
        ekaAsetelma.setAlignment(Pos.CENTER);   // Laittaa kompot keskelle
        
        // Toka
        Label tervehdysteksti = new Label();
        
        // Asetellaan tokaa näkymä
        StackPane tokaAsetelma = new StackPane();
        
        tokaAsetelma.setPrefSize(300, 180);     // Tokan näkymän koko
        tokaAsetelma.getChildren().add(tervehdysteksti);
        tokaAsetelma.setAlignment(Pos.CENTER);  // Tokakin keskelle        
        
        // Luodaan näkymä
        Scene nakymaYksi = new Scene(ekaAsetelma);
        Scene nakymaToka = new Scene(tokaAsetelma);
        
        // Napin toiminnalisuus
        nappiEka.setOnAction((event) -> {
            ikkuna.setScene(nakymaToka);
            tervehdysteksti.setText("Tervetuloa "+tekstiEka.getText()+"!");
        });
        
        
        // Asetataan ikkunaan
        ikkuna.setScene(nakymaYksi);
        ikkuna.show();
    }
}
