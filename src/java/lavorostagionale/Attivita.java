/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author berna
 */

package lavorostagionale;

import java.io.Serializable;
public class Attivita implements Serializable{

    private int id;
    private String tipologia;
    private int numPosti;
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
        /**
     * @return the tipologia
     */
    public String getTipologia() {
        return tipologia;
    }

    /**
     * @param tipologia the tipologia to set
     */
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    
    /**
     * @return the numPosti
     */
    public int getNumPosti() {
        return numPosti;
    }

    /**
     * @param numPosti the numPosti to set
     */
    public void setNumPosti(int numPosti) {
        this.numPosti = numPosti;
    }


}
