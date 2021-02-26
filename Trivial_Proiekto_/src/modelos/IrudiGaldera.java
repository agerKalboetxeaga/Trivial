/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import javax.swing.*;

/**
 *
 * @author agerk
 */
public class IrudiGaldera extends Galdera{
    private final String irudia;

    public IrudiGaldera(String helbidea, String kategoria, String galdera, String ezuzena, String eokerra1, String eokerra2) {
        super(kategoria, galdera, ezuzena, eokerra1, eokerra2);
        this.irudia = helbidea;
    }

    public String getIrudia() {
        return irudia;
    }
    
}
