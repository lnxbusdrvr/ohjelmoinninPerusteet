package sovellus;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
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
        //                         mistä, mihin, missäKohtaaOletuksena
        Slider kkliukuri = new Slider(25, 250, 25);
        //                           mistä, mihin, missäKohtaaOletuksena
        Slider vuosiliukuri = new Slider(0, 10, 0);
        
        // Näytä pystyviivat/putkimerkkit
        kkliukuri.setShowTickMarks(true);
        vuosiliukuri.setShowTickMarks(true);
  
        // Näyttää arvot
        kkliukuri.setShowTickLabels(true);
        vuosiliukuri.setShowTickLabels(true);
        
        // Otetan numerot pystyviivojen/putkimerkkien kohdalta
        kkliukuri.setSnapToTicks(true);
        vuosiliukuri.setSnapToTicks(true);
        
        // Asetetaan maximiarvo, testit toimii nopeammin ja vähemmän virheitä
        kkliukuri.setBlockIncrement(250);
        vuosiliukuri.setBlockIncrement(10);
        
        // Teksti ennen liukuria
        Label kkliukuriTxt = new Label("Kuukausittainen tallennus");
        Label vuosiliukuriTxt = new Label("Vuosittainen korko");
        
        // Teksti liukurin jälkeen
        Label kkliukuriArvo = new Label(""+kkliukuri.getValue()); // Otetaan arvoo Sliderista
        Label vuosilikuriArvo = new Label(""+vuosiliukuri.getValue()); // Otetaan arvoo Sliderista
        
        // kuukausikorkopalkki
        BorderPane kkpalkki = new BorderPane();
        // Asetetaan komponentin kuukausipalkkiin
        kkpalkki.setLeft(kkliukuriTxt);
        kkpalkki.setCenter(kkliukuri);
        kkpalkki.setRight(kkliukuriArvo);
        
        // Vuosikorkosiivu
        BorderPane vuosipalkki = new BorderPane();
        // Asetetaan komponentin kuukausipalkkiin
        vuosipalkki.setLeft(vuosiliukuriTxt);
        vuosipalkki.setCenter(vuosiliukuri);
        vuosipalkki.setRight(vuosilikuriArvo);
       
        // Asetetaan liukurin pystysuuntaisen boxin sisään
        ylalaita.getChildren().addAll(kkpalkki, vuosipalkki);
                
        // Muodostetaan akselit
        NumberAxis xAkseli = new NumberAxis(0, 30, 1);
        //NumberAxis yAkseli = new NumberAxis(0, 110, 10);
        NumberAxis yAkseli = new NumberAxis();
        
        // Aloitetaan viivakaavio
        LineChart viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Säästölaskuri");
        viivakaavio.setLegendVisible(false);
        
        // Luodaan kaavaa
        XYChart.Series talletukset = new XYChart.Series<>();
                
        
        
        asettelu.setTop(ylalaita);
        asettelu.setCenter(viivakaavio);
        
        // Likurien toiminta
        kkliukuri.setOnMouseReleased(e -> {
            kkliukuriArvo.setText("" + kkliukuri.getValue());
            //saastot(kkliukuri.getValue(), korko.getValue(), talletukset, saastotKoroilla);
            saastot(Double.valueOf(kkliukuriArvo.getText()), talletukset);
        });
        
        vuosiliukuri.setOnMouseReleased(e -> {
            vuosilikuriArvo.setText("" + vuosiliukuri.getValue());
            //saastot(kkliukuri.getValue(), korko.getValue(), talletukset, saastotKoroilla);
            saastot(Double.valueOf(kkliukuriArvo.getText()), talletukset);
        });
        // Toiminto loppuu
        
        // Lisätään data viivastolle
        viivakaavio.getData().add(talletukset);
        
        // Luodaan näkymä
        Scene nakyma = new Scene(asettelu, 640, 470);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    
    public void saastot(double kkarvo, XYChart.Series kktalletus) {
        // Jotta vanhat arvot poistuisivat, tyhjennetään kaavio
        kktalletus.getData().clear();
        // Eka kohta manuaalisti
        //kktalletus.getData().add(new XYChart.Data(0, 0));
        for(int i = 0; i <=30; i++) {
            int saasto = i * (int)kkarvo * 12;
            kktalletus.getData().add(new XYChart.Data(i, saasto));
        }
    }

}
