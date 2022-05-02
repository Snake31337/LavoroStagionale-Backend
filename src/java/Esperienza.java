/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonardo
 */
import java.io.Serializable;

public class Esperienza implements Serializable {
    private int id;
    private String tipologia;
    private int numposti;

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
     * @return the numposti
     */
    public int getNumposti() {
        return numposti;
    }

    /**
     * @param numposti the numposti to set
     */
    public void setNumposti(int numposti) {
        this.numposti = numposti;
    }
    
    public Esperienza() {
    
    }
    
    
    
    
    
    
    
}
