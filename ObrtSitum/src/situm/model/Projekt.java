/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situm.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Tomislav
 */
@Entity
@Table
public class Projekt extends Entitet implements Serializable{
    
    private String naziv;
    @Temporal(TemporalType.DATE)
    private Date datumpocetka;
    @Temporal(TemporalType.DATE)
    private Date datumzavrsetka;
    private BigDecimal cijena;
    private String kometnar;
    
    @ManyToMany 
    private List<Radnik> radnik = new ArrayList<>();
    
    @ManyToMany
    private List<Materijal> materijal = new ArrayList<>();
    
    @ManyToOne
    private Korisnik korisnik;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatumpocetka() {
        return datumpocetka;
    }

    public void setDatumpocetka(Date datumpocetka) {
        this.datumpocetka = datumpocetka;
    }

    public Date getDatumzavrsetka() {
        return datumzavrsetka;
    }

    public void setDatumzavrsetka(Date datumzavrsetka) {
        this.datumzavrsetka = datumzavrsetka;
    }

  
    

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public String getKometnar() {
        return kometnar;
    }

    public void setKometnar(String kometnar) {
        this.kometnar = kometnar;
    }

    public List<Radnik> getRadnik() {
        return radnik;
    }

    public void setRadnik(List<Radnik> radnik) {
        this.radnik = radnik;
    }

    public List<Materijal> getMaterijal() {
        return materijal;
    }

    public void setMaterijal(List<Materijal> materijal) {
        this.materijal = materijal;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }
    
    
    @Override
    public String toString() {
        return getNaziv() + " " + getCijena();
    }
       
            
    
}
