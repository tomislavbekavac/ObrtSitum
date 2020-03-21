/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situm.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Tomislav
 */
@Entity
@Table
public class Obracun extends Entitet implements Serializable{
    
    private BigDecimal brojSati;
    private BigDecimal dobitak;
    private BigDecimal kolicinaMaterijala;

  
    
    @ManyToOne
    private Projekt projekt;
    
    @ManyToMany 
    private Radnik radnik;
    
    @ManyToMany
    private Materijal materijal;

    public BigDecimal getBrojSati() {
        return brojSati;
    }

    public void setBrojSati(BigDecimal brojSati) {
        this.brojSati = brojSati;
    }

    public BigDecimal getDobitak() {
        return dobitak;
    }

    public void setDobitak(BigDecimal dobitak) {
        this.dobitak = dobitak;
    }

    public Projekt getProjekt() {
        return projekt;
    }

    public void setProjekt(Projekt projekt) {
        this.projekt = projekt;
    }

     public BigDecimal getKolicinaMaterijala() {
        return kolicinaMaterijala;
    }

    public void setKolicinaMaterijala(BigDecimal kolicinaMaterijala) {
        this.kolicinaMaterijala = kolicinaMaterijala;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public Materijal getMaterijal() {
        return materijal;
    }

    public void setMaterijal(Materijal materijal) {
        this.materijal = materijal;
    }
    

   
    
    
    
}
