/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.util.ArrayList;

/**
 *
 * @author agerk
 */
public class Partida {
    private Jokalaria usr;
    private ArrayList <Galdera> galderak;
    private int rondak;
    private int eZuzenak;
    private int eOkerrak=0 ;

    public Partida(Jokalaria usr, ArrayList<Galdera> galderak, int rondak, int eZuzenak) {
        this.usr = usr;
        this.galderak = galderak;
        this.rondak = rondak;
        this.eZuzenak = eZuzenak;
    }
    public ArrayList<Galdera> getGalderak() {
        return galderak;
    }
    public void setRondak(int rondak) {
        this.rondak = rondak;
    }

    public void seteZuzenak(int eZuzenak) {
        this.eZuzenak = eZuzenak;
    }

    public void seteOkerrak(int eOkerrak) {
        this.eOkerrak = eOkerrak;
    }

    public Jokalaria getUsr() {
        return usr;
    }

    public int getRondak() {
        return rondak;
    }

    public int geteZuzenak() {
        return eZuzenak;
    }

    public int geteOkerrak() {
        return eOkerrak;
    }
}
