package sovellus;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends Application {
    //private String tiedosto;
    //private Map<String, String> vuosiluku;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ShanghaiSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        // luodaan kaaviossa käytettävät x- ja y-akselit
        NumberAxis xAkseli = new NumberAxis(2006, 2018, 2); // Määritellään 
        NumberAxis yAkseli = new NumberAxis();                  // mistä mihin
        
        // asetetaan akseleille nimet
        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Sijoitus");
        
        // luodaan viivakaavio. Viivakaavion arvot annetaan numeroina
        // ja se käyttää aiemmin luotuja x- ja y-akseleita
        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Helsingin yliopisto, Shanghai-ranking");
        viivakaavio.setLegendVisible(false);
        
        // luodaan viivakaavioon lisättävä datajoukko
        XYChart.Series hyoData = new XYChart.Series();
        hyoData.setName("");
        
        // lisätään datajoukkoon yksittäisiä pisteitä
        hyoData.getData().add(new XYChart.Data(2007, 73));
        hyoData.getData().add(new XYChart.Data(2008, 68));
        hyoData.getData().add(new XYChart.Data(2009, 72));
        hyoData.getData().add(new XYChart.Data(2010, 72));
        hyoData.getData().add(new XYChart.Data(2011, 74));
        hyoData.getData().add(new XYChart.Data(2012, 73));
        hyoData.getData().add(new XYChart.Data(2013, 76));
        hyoData.getData().add(new XYChart.Data(2014, 73));
        hyoData.getData().add(new XYChart.Data(2015, 67));
        hyoData.getData().add(new XYChart.Data(2016, 56));
        hyoData.getData().add(new XYChart.Data(2017, 56));
        
        // lisätään datajoukko viivakaavioon
        viivakaavio.getData().add(hyoData); //Ilman tätä ei näy viivoja
        
        // Luodaan näkymä
        Scene nakyma = new Scene(viivakaavio, 400, 400);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }
    
    /*private void lataa() {
        try{
            Scanner tiedostonlukija = new Scanner(Paths.get(this.tiedosto));
            
            while (tiedostonlukija.hasNextLine()) {
                String rivi = tiedostonlukija.nextLine();
                // pilkotaan rivi välilyöntien kohdalta
                String[] osat = rivi.split(" ");
                
                //Lisää listalle
                this.lisaa(osat[0], osat[1]);                
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void lisaa(String vuosi, String luku) {
        this.vuosiluku = new HashMap<>();
        this.vuosiluku.put(vuosi, luku);
    }*/

}
