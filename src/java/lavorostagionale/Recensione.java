package lavorostagionale;


import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author The crafter
 */
public class Recensione implements Serializable{
    
    private int ID_recensione;
    private String testo;
    private int stelle;

    /**
     * @return the ID_recensione
     */
    public int getID_recensione() {
        return ID_recensione;
    }

    /**
     * @param ID_recensione the ID_recensione to set
     */
    public void setID_recensione(int ID_recensione) {
        this.ID_recensione = ID_recensione;
    }

    /**
     * @return the testo
     */
    public String getTesto() {
        return testo;
    }

    /**
     * @param testo the testo to set
     */
    public void setTesto(String testo) {
        this.testo = testo;
    }

    /**
     * @return the stelle
     */
    public int getStelle() {
        return stelle;
    }

    /**
     * @param stelle the stelle to set
     */
    public void setStelle(int stelle) {
        this.stelle = stelle;
    }
    
    
    
}
