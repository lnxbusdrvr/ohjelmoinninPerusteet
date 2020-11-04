package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SaastolaskuriSovellus extends Application {

    public static void main(String[] args) {
        System.out.println("Ohjelma aloitetaan!");
        launch(SaastolaskuriSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        // Luodaan asettelu
        BorderPane asettelu = new BorderPane();
        
        // Luodaan pystysuuntainen boxi
        VBox ylalaita = new VBox();
        
        // Luodaan liukurit
        Slider kkliukuri = new Slider(25, 250, 24);
        Slider vuosiliukuri = new Slider(0, 10, 9);
        
        // Näytä pystyviivat/putkimerkkit
        kkliukuri.setShowTickMarks(true);
        vuosiliukuri.setShowTickMarks(true);
  
        // Näyttää arvot
        kkliukuri.setShowTickLabels(true);
        vuosiliukuri.setShowTickLabels(true);
        
        // Teksti ennen liukuria
        Label kkliukuriTxt = new Label("Kuukausittainen tallennus");
        Label vuosiliukuriTxt = new Label("Vuosittainen korko");
        
        // Teksti liukurin jälkeen
        Label kkliukuriArvo = new Label("0");
        Label vuosilikuriArvo = new Label("25");
        
        // kuukausikorkosiivu
        BorderPane kkpalkki = new BorderPane();
        // Asetetaan komponentin kuukausisiivuun
        kkpalkki.setLeft(kkliukuriTxt);
        kkpalkki.setCenter(kkliukuri);
        kkpalkki.setRight(kkliukuriArvo);
        
        // Vuosikorkosiivu
        BorderPane vuosipalkki = new BorderPane();
        // Asetetaan komponentin kuukausisiivuun
        vuosipalkki.setLeft(vuosiliukuriTxt);
        vuosipalkki.setCenter(vuosiliukuri);
        vuosipalkki.setRight(vuosilikuriArvo);
       
        // Asetetaan liukurin pystysuuntaisen boxin sisään
        ylalaita.getChildren().addAll(kkpalkki, vuosipalkki);
        //ylalaita.setFillWidth(true);
        
        NumberAxis xAkseli = new NumberAxis(0, 30, 1);
        NumberAxis yAkseli = new NumberAxis(0, 110, 10);
        
        LineChart viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Säästölaskuri");
        
        asettelu.setTop(ylalaita);
        asettelu.setCenter(viivakaavio);
        
        // Luodaan näkymä
        Scene nakyma = new Scene(asettelu, 640, 470);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
