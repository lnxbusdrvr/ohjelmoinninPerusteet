package ristinolla;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RistinollaSovellus extends Application {


    public static void main(String[] args) {
        System.out.println("Ohjelma alkaa!");
        launch(RistinollaSovellus.class);
    }
    
    @Override
    public void start(Stage ikkuna)  {
        BorderPane asettelu = new BorderPane();
        
        String x = "X";
        String o = "O";
        String xVuoro = "Vuoro: "+x;
        String oVuoro = "Vuoro: "+o;
        Label ylateksti = new Label(xVuoro);
        //Label vuoro = new Label("X");
        
        
        ylateksti.setFont(Font.font("Monospaced", 40));
                     
        GridPane ristikko = new GridPane();
        
        // Asetetaan ristikon napit        
        // Luodaan 3x3 ristikko
        /*for (int rivi = 1; rivi <= 3; rivi++) {
            for (int sarake = 1; sarake <= 3; sarake++) {
                // Javassa ei ole mahdollista luoda muuttuijia, jonka nimessä
                // oleva numero kasvaa, 
                // nappi11, nappi12, nappi13
                // nappi21, nappi22, nappi23 jne
                ristikko.add(new Button(), rivi, sarake);
            }
        }*/
        
        // Napit, rivi 1
        Button nappi11 = new Button(" ");
        Button nappi12 = new Button(" ");
        Button nappi13 = new Button(" ");        
        
        // Napit, rivi 2
        Button nappi21 = new Button(" ");
        Button nappi22 = new Button(" ");
        Button nappi23 = new Button(" ");
        
        // Napit, rivi 3
        Button nappi31 = new Button(" ");
        Button nappi32 = new Button(" ");
        Button nappi33 = new Button(" ");
        
        // Asetetaan fontit, rivi 1
        nappi11.setFont(Font.font("Monospaced", 40));
        nappi21.setFont(Font.font("Monospaced", 40));
        nappi31.setFont(Font.font("Monospaced", 40));
        
        // Asetetaan fontit, rivi 2
        nappi12.setFont(Font.font("Monospaced", 40));
        nappi22.setFont(Font.font("Monospaced", 40));
        nappi32.setFont(Font.font("Monospaced", 40));
        
        // Asetetaan fontit, rivi 3
        nappi13.setFont(Font.font("Monospaced", 40));
        nappi23.setFont(Font.font("Monospaced", 40));
        nappi33.setFont(Font.font("Monospaced", 40));
        
        // Lisätään kaikki napit ristikkoon
        ristikko.add(nappi11, 1, 1);
        ristikko.add(nappi12, 2, 1);
        ristikko.add(nappi13, 3, 1);
        ristikko.add(nappi21, 1, 2);
        ristikko.add(nappi22, 2, 2);
        ristikko.add(nappi23, 3, 2);
        ristikko.add(nappi31, 1, 3);
        ristikko.add(nappi32, 2, 3);
        ristikko.add(nappi33, 3, 3);
        
        ristikko.setHgap(10);
        ristikko.setVgap(10);
        ristikko.setAlignment(Pos.CENTER);
        
        asettelu.setTop(ylateksti);
        asettelu.setCenter(ristikko);
        
        // Ruma koodi alkaa
        // Rivi 1
        nappi11.setOnMouseClicked((event) -> {
            if(ylateksti.getText().equals(xVuoro)) {
                if(nappi11.getText().equals(" ")) {
                    nappi11.setText(x);
                    ylateksti.setText(oVuoro);
                }
            }else {
                if(nappi11.getText().equals(" ")) {
                    nappi11.setText(o);
                    ylateksti.setText(xVuoro);
                }
            }
        });
        
        nappi12.setOnMouseClicked((event) -> {
            if(ylateksti.getText().equals(xVuoro)) {
                if(nappi12.getText().equals(" ")) {
                    nappi12.setText(x);
                    ylateksti.setText(oVuoro);
                }
            }else {
                if(nappi12.getText().equals(" ")) {
                    nappi12.setText(o);
                    ylateksti.setText(xVuoro);
                }
            }
        });
        
        nappi13.setOnMouseClicked((event) -> {
            if(ylateksti.getText().equals(xVuoro)) {
                if(nappi13.getText().equals(" ")) {
                    nappi13.setText(x);
                    ylateksti.setText(oVuoro);
                }
            }else {
                if(nappi13.getText().equals(" ")) {
                    nappi13.setText(o);
                    ylateksti.setText(xVuoro);
                }
            }
        });
        //  Rivi 1 Loppuu
        
        // Rivi 2
        nappi21.setOnMouseClicked((event) -> {
            if(ylateksti.getText().equals(xVuoro)) {
                if(nappi21.getText().equals(" ")) {
                    nappi21.setText(x);
                    ylateksti.setText(oVuoro);
                }
            }else {
                if(nappi21.getText().equals(" ")) {
                    nappi21.setText(o);
                    ylateksti.setText(xVuoro);
                }
            }
        });
        
        nappi22.setOnMouseClicked((event) -> {
            if(ylateksti.getText().equals(xVuoro)) {
                if(nappi22.getText().equals(" ")) {
                    nappi22.setText(x);
                    ylateksti.setText(oVuoro);
                }
            }else {
                if(nappi22.getText().equals(" ")) {
                    nappi22.setText(o);
                    ylateksti.setText(xVuoro);
                }
            }
        });
        
        nappi23.setOnMouseClicked((event) -> {
            if(ylateksti.getText().equals(xVuoro)) {
                if(nappi23.getText().equals(" ")) {
                    nappi23.setText(x);
                    ylateksti.setText(oVuoro);
                }
            }else {
                if(nappi23.getText().equals(" ")) {
                    nappi23.setText(o);
                    ylateksti.setText(xVuoro);
                }
            }
        });
        //  Rivi 2 Loppuu
        
        // Rivi 3
        nappi31.setOnMouseClicked((event) -> {
            if(ylateksti.getText().equals(xVuoro)) {
                if(nappi31.getText().equals(" ")) {
                    nappi31.setText(x);
                    ylateksti.setText(oVuoro);
                }
            }else {
                if(nappi31.getText().equals(" ")) {
                    nappi31.setText(o);
                    ylateksti.setText(xVuoro);
                }
            }
        });        
        nappi32.setOnMouseClicked((event) -> {
            if(ylateksti.getText().equals(xVuoro)) {
                if(nappi32.getText().equals(" ")) {
                    nappi32.setText(x);
                    ylateksti.setText(oVuoro);
                }
            }else {
                if(nappi32.getText().equals(" ")) {
                    nappi32.setText(o);
                    ylateksti.setText(xVuoro);
                }
            }
        });
        nappi33.setOnMouseClicked((event) -> {
            if(ylateksti.getText().equals(xVuoro)) {
                if(nappi33.getText().equals(" ")) {
                    nappi33.setText(x);
                    ylateksti.setText(oVuoro);
                }
            }else {
                if(nappi33.getText().equals(" ")) {
                    nappi33.setText(o);
                    ylateksti.setText(xVuoro);
                }
            }
        });
        //  Rivi 3 Loppuu
        // Ruma koodi loppuu
        
        Scene nakyma = new Scene(asettelu, 300, 330);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
