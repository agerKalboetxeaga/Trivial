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
public class Jokalaria {
    private String uname;
     private Partida saves; 

    public Partida getSaves() {
        return saves;
    }

    public Jokalaria(String uname) {
        this.uname = uname;
    }

    public String getUname() {
        return uname;
    }

    public void  addSaves(Partida save) {
        this.saves= save;
    }

    public Partida getLastSave() {
        
        
            return saves;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setSaves(Partida saves) {
        this.saves = saves;
    }
    
}
