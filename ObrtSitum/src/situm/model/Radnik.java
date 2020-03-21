/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situm.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Tomislav
 */
@Entity
@Table
public class Radnik extends Entitet implements Serializable{
    
    private String ime;
    private String prezime;
    private String mobitel;
    private String iban;
    private String osnovicaPoSatu;

    public String getIme() {
        return ime;
    }

    public String getOsnovicaPoSatu() {
        return osnovicaPoSatu;
    }

    public void setOsnovicaPoSatu(String osnovicaPoSatu) {
        this.osnovicaPoSatu = osnovicaPoSatu;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getMobitel() {
        return mobitel;
    }

    public void setMobitel(String mobitel) {
        this.mobitel = mobitel;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Radnik() {
    }
    
      @Override
    public String toString () {
        return getIme() + " " + getPrezime() + " " + getOsnovicaPoSatu();
    }
    
    
}
