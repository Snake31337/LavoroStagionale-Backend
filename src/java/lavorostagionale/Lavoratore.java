package lavorostagionale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edoardo
 */
public class Lavoratore 
{
    
    private String ID_lavoratore;
    private String nome;
    private String cognome;
    private String tipologia;
    private String username;
    private String password;
    
     public void Lavoratore()
    {
        
    }
     
    /**
     * @return the ID_lavoratore
     */
    public String getID_lavoratore() {
        return ID_lavoratore;
    }

    /**
     * @param ID_lavoratore the ID_lavoratore to set
     */
    public void setID_lavoratore(String ID_lavoratore) 
    {
        this.ID_lavoratore = ID_lavoratore;
    }

    /**
     * @return the nome
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**
     * @return the cognome
     */
    public String getCognome() 
    {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) 
    {
        this.cognome = cognome;
    }

    /**
     * @return the tipologia
     */
    public String getTipologia() 
    {
        return tipologia;
    }

    /**
     * @param tipologia the tipologia to set
     */
    public void setTipologia(String tipologia) 
    {
        this.tipologia = tipologia;
    }

    /**
     * @return the username
     */
    public String getUsername() 
    {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) 
    {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() 
    {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) 
    {
        this.password = password;
    }
}
