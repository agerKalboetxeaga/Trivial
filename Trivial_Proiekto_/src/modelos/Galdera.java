/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author agerk
 */
public class Galdera {
    protected final String kategoria;
    protected final String galdera;
    protected final String ezuzena;
    protected final String eokerra1;
    protected final String eokerra2;
    protected  boolean agertu = false;

    public void setAgertu(boolean agertu) {
        this.agertu = agertu;
    }
    

    public Galdera(String kategoria, String galdera, String ezuzena, String eokerra1, String eokerra2) {
        this.kategoria = kategoria;
        this.galdera = galdera;
        this.ezuzena = ezuzena;
        this.eokerra1 = eokerra1;
        this.eokerra2 = eokerra2;
    }

    public boolean isAgertu() {
        return agertu;
    }
    

    public String getKategoria() {
        return kategoria;
    }

    public String getGaldera() {
        return galdera;
    }

    public String getEzuzena() {
        return ezuzena;
    }

    public String getEokerra1() {
        return eokerra1;
    }

    public String getEokerra2() {
        return eokerra2;
    }

    @Override
    public String toString() {
        return "Galdera: \n\tKategoria: " + kategoria + "\n\t Galdera:" + galdera + "\n\t Erantzun zuzena: " + ezuzena + "\n\t Lehen erantzun okerra: " + eokerra1 + "\n\t Bigarren erantzun okerra: " + eokerra2 ;
    }
    
}
