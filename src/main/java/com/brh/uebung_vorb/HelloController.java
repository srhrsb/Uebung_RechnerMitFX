package com.brh.uebung_vorb;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label resultLabel;
    @FXML
    private TextField value1;
    @FXML
    private TextField value2;

    @FXML
    protected void calc() {
        try {
            //Eingegebene Daten holen
            String valueString1 = value1.getText();
            String valueString2 = value2.getText();

            //optional: um Kommaeingabe möglich zu machen
            valueString1 = valueString1.replace(',', '.');
            valueString2 = valueString2.replace(',', '.');

            //Typen konvertieren
            double number1 = Double.parseDouble(valueString1);
            double number2 = Double.parseDouble(valueString2);

            //ergebnis errechnen
            double result = number1 + number2;

            //zurück in String für Ausgabe konvertieren
            String resaltAsString = Double.toString(result);

            //an Ausgabelabel übergeben
            resultLabel.setText(resaltAsString);
        }
        catch (NumberFormatException exception){
            System.out.println("Fehlerhafte Eingabe");
            throw new RuntimeException(exception);
        }
    }

}