/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klassen;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Markus
 */
public class Artikelliste extends ArrayList<Artikel>{

    public Artikelliste(){
    }
    
    public Geldbetrag getGesamtwert(){
       
        Geldbetrag gesamtwert = new Geldbetrag(0) ;
        
        for (Artikel a : this) {
            gesamtwert.addiere(a.getPreis());
            
        }
        
        return gesamtwert;
    }

    @Override
    public String toString() {
        String ausgabeString = "";
        for (Artikel a : this) {
            ausgabeString = ausgabeString + a.toString() + "\n";
            
        }
        return ausgabeString;
    }
    
    public static void test(){
        try {
            Artikelliste a = new Artikelliste();
            a.add(new Artikel("Auto", new Geldbetrag(150)));
            a.add(new Artikel("Motorrad", new Geldbetrag(1500000)));
            System.out.println(a);
            System.out.println("Der Gesamtwert beträgt:");
            System.out.println(a.getGesamtwert());
        } catch (ArtikelException ex) {
            Logger.getLogger(Artikelliste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
