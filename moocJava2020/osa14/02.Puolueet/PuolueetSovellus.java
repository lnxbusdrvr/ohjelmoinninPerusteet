package sovellus;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PuolueetSovellus extends Application {
    private XYChart.Series aanidata;
    private LineChart<Number, Number> viivakaavio;

    public static void main(String[] args) {
        System.out.println("Ohjelma alkaa!");
        launch(PuolueetSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) {
        //                                 mista, mihin, moneskoVäli
        NumberAxis xAkseli = new NumberAxis(1968, 2008, 4);
        NumberAxis yAkseli = new NumberAxis();
        
        // Ladataan data
        this.lataa("puoluedata.tsv", xAkseli, yAkseli);
        
        // Luodaan näkymä
        Scene nakyma = new Scene(viivakaavio, 400, 290);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }
    
    private void lataa(String tiedosto, NumberAxis xAkseli, NumberAxis yAkseli) {
        try{
            // Puolue	1968	1972	1976	1980	1984	
                // [0]    [1]   [2]     [3]     [4]     [5]     [6]          
                
                // 1988	1992	1996	2000	2004	2008
                // [7]  [8]     [9]     [10]    [11]    [12]
            Scanner tiedostonlukija = new Scanner(Paths.get(tiedosto));
            
            // Määritellään viivakaavio        
            this.viivakaavio = new LineChart<>(xAkseli, yAkseli);
            this.viivakaavio.setTitle("Puolueiden suhteellinen kannatus");
            
            String ekarivi = tiedostonlukija.nextLine();
            List<String> vuosi = Arrays.asList(ekarivi.split("\t"));
            
            List<String> aanilista;
            
            // Tiedostonkäsittely
            while(tiedostonlukija.hasNextLine()) {
                String rivi = tiedostonlukija.nextLine();
                // Erotellaan palat sarkaimella
                aanilista = Arrays.asList(rivi.split("\t"));
                String puolue = aanilista.get(0);
                
                // Alusetetaan XYChartti
                this.aanidata = new XYChart.Series();
                this.aanidata.setName(puolue);
                
                for(int i = 1; i < aanilista.size();i++) {
                    // Mikäli tyhjä ääni
                    if(aanilista.get(i).equals("-")) {
                        continue;
                    }
                    int apuvuosi = Integer.valueOf(vuosi.get(i));
                    double apuaani = Double.parseDouble(aanilista.get(i));
                    this.aanidata.getData().add(new XYChart.Data(apuvuosi, apuaani));
                }
                // Lisätään datajoukko viivakaavioon
                viivakaavio.getData().add(this.aanidata);
            }
            
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
