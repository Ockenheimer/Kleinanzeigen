/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassen;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Markus
 */
public class Artikel implements Comparable<Artikel>{

    private String name;
    private Geldbetrag preis;
    private int artikelnummer;
    public static int lfdNummer = 0;

    public Geldbetrag getPreis() {
        return preis;
    }

    public Artikel(String name, Geldbetrag preis) throws ArtikelException {
        if (name.isEmpty()) {
            ArtikelException a = new ArtikelException("Bitte geben Sie einen Artikelnamen an.");
        }
        if (preis.getWert() < 0) {
            ArtikelException a = new ArtikelException("Verschenken ist ok, aber bitte kein Geld mit rausgeben.");
        }
        lfdNummer++;
        this.name = name;
        this.preis = preis;
        this.artikelnummer = lfdNummer;
    }

    @Override
    public String toString() {
        return artikelnummer + " - " + name + " - " + preis.toString();
    }
    
    public static void test(){
        
        try {
            Artikel a = new Artikel("Auto", new Geldbetrag(15));
            System.out.println(a);
            Artikel b = new Artikel("Moped", new Geldbetrag(15000000));
            System.out.println(b);
        } catch (ArtikelException ex) {
            Logger.getLogger(Artikel.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }

    @Override
    public int compareTo(Artikel o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           

}
