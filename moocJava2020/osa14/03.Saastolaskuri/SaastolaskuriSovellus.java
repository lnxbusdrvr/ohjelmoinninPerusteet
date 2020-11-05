package sovellus;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
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
        //Slider korkoliukuri = new Slider(0, 10, 0);
        Slider korkoliukuri = new Slider();
        korkoliukuri.setMin(0);
        korkoliukuri.setMax(10);
        korkoliukuri.setMinorTickCount(10);
        
        // Näytä pystyviivat/putkimerkkit
        kkliukuri.setShowTickMarks(true);
        korkoliukuri.setShowTickMarks(true);
  
        // Näyttää arvot
        kkliukuri.setShowTickLabels(true);
        korkoliukuri.setShowTickLabels(true);
        
        // Otetan numerot pystyviivojen/putkimerkkien kohdalta
        kkliukuri.setSnapToTicks(true);
        //korkoliukuri.setSnapToTicks(true);
        
        // Asetetaan maximiarvo, testit toimii nopeammin ja vähemmän virheitä
        kkliukuri.setBlockIncrement(250);
        //korkoliukuri.setBlockIncrement(10);
        
        // Teksti ennen liukuria
        Label kkliukuriTxt = new Label("Kuukausittainen tallennus");
        Label korkoliukuriTxt = new Label("Vuosittainen korko");
        
        // Teksti liukurin jälkeen
        Label kkliukuriArvo = new Label(""+kkliukuri.getValue()); // Otetaan arvoo Sliderista
        Label korkoliukuriArvo = new Label(""+korkoliukuri.getValue()); // Otetaan arvoo Sliderista
        
        // kuukausikorkopalkki
        BorderPane kkpalkki = new BorderPane();
        // Asetetaan komponentin kuukausipalkkiin
        kkpalkki.setLeft(kkliukuriTxt);
        kkpalkki.setCenter(kkliukuri);
        kkpalkki.setRight(kkliukuriArvo);
        kkpalkki.setPadding(new Insets(10));  // Säädöt saa viivan oikeaksi
        
        // Vuosikorkosiivu
        BorderPane korkopalkki = new BorderPane();
        // Asetetaan komponentin kuukausipalkkiin
        korkopalkki.setLeft(korkoliukuriTxt);
        korkopalkki.setCenter(korkoliukuri);
        korkopalkki.setRight(korkoliukuriArvo);
        korkopalkki.setPadding(new Insets(10)); // Säädöt saa viivan oikeaksi
       
        // Asetetaan liukurin pystysuuntaisen boxin sisään
        ylalaita.getChildren().addAll(kkpalkki, korkopalkki);
        ylalaita.setPadding(new Insets(10)); // Säädöt saa viivan oikeaksi
        ylalaita.setSpacing(10); // Säädöt saa viivan oikeaksi
                
        // Muodostetaan akselit
        NumberAxis xAkseli = new NumberAxis(0, 30, 1);
        //NumberAxis yAkseli = new NumberAxis(0, 110, 10);
        NumberAxis yAkseli = new NumberAxis();
        
        // Aloitetaan viivakaavio
        LineChart viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Säästölaskuri");
        viivakaavio.setAnimated(false); // Säädöt saa viivan oikeaksi
        viivakaavio.setLegendVisible(false);
        
        // Luodaan kaavio
        XYChart.Series talletukset = new XYChart.Series<>();
        XYChart.Series korkotall = new XYChart.Series<>();
        
        asettelu.setTop(ylalaita);
        asettelu.setCenter(viivakaavio);
        
        // Likurien toiminta
        kkliukuri.setOnMouseReleased(e -> {
            //                                    yhden desimalin tarkuudella
            //kkliukuriArvo.setText(String.format("%.1f", kkliukuri.getValue()));
            kkliukuriArvo.setText("" +kkliukuri.getValue());
            saastot(kkliukuri.getValue(), korkoliukuri.getValue(), talletukset, korkotall);
        });
        
        // Lisätään data viivastolle
        viivakaavio.getData().add(talletukset);
        
        korkoliukuri.setOnMouseReleased(e -> {
            //                                    kahden desimalin tarkuudella
            //korkoliukuriArvo.setText(String.format("%.2f", korkoliukuri.getValue()));
            //korkoliukuriArvo.setText("" +korkoliukuri.getValue());
            String korkoString = "" + korkoliukuri.getValue();
            if (korkoString.length() > 4) {
                korkoString = korkoString.substring(0, 4);
            }
            korkoliukuriArvo.setText(korkoString);
            saastot(kkliukuri.getValue(), korkoliukuri.getValue(), talletukset, korkotall);
        });
        // Toiminto loppuu
        
        // Lisätään data viivastolle
        viivakaavio.getData().add(korkotall);
        
        // Luodaan näkymä
        Scene nakyma = new Scene(asettelu, 640, 470);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    
    private void saastot(double kksaasto, double korko, XYChart.Series kktalletus, XYChart.Series korkotalletus) 
    {
        // Jotta vanhat arvot poistuisivat, tyhjennetään kaavio
        kktalletus.getData().clear();
        korkotalletus.getData().clear();
        // Luodaan nollakorko
        kktalletus.getData().add(new XYChart.Data(0, 0));
        korkotalletus.getData().add(new XYChart.Data(0, 0));
        
        double edellinen = 0;
        
        for(int i = 1; i <=30; i++) {
            kktalletus.getData().add(new XYChart.Data(i, i * kksaasto * 12));
            edellinen +=kksaasto * 12;
            edellinen *= (1 + korko / 100.0);
            
            korkotalletus.getData().add(new XYChart.Data(i, edellinen));            
        }
    }

}
