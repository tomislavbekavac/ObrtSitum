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
public class Korisnik extends Entitet implements Serializable{
    
    private String korisnik;
    private String mobitel;
    private String email;
    private String ugovor;
    private String adresa;
    
    
    
    

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
    
    
    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public String getMobitel() {
        return mobitel;
    }

    public void setMobitel(String mobitel) {
        this.mobitel = mobitel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUgovor() {
        return ugovor;
    }

    public void setUgovor(String ugovor) {
        this.ugovor = ugovor;
    }
    
    @Override
    public String toString () {
        return getKorisnik();
    }
    
    
}
