/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassen;

import java.text.DecimalFormat;

/**
 *
 * @author Markus
 */
public class Geldbetrag {

    double wert;

    public Geldbetrag(double wert) {
        this.wert = wert;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public void addiere(Geldbetrag x) {
        this.wert += x.getWert();

    }

    public void subtrahiere(Geldbetrag x) {
        this.wert -= x.getWert();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        return  df.format(getWert()) + " EURO";
    }
    
    
}
