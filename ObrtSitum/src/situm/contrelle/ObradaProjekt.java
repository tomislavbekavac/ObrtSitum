/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situm.contrelle;

import java.util.List;
import situm.model.Projekt;
import situm.pomocno.HibernateUtil;
import situm.pomocno.ObradaSucelje;
import situm.pomocno.SitumException;

/**
 *
 * @author Tomislav
 */
public class ObradaProjekt extends Obrada<Projekt> implements ObradaSucelje<Projekt>{
    
    public ObradaProjekt() {
        super();
    }

    @Override
    public List<Projekt> getLista() {
         return HibernateUtil.getSession().createQuery("from Projekt").list();
    }

    @Override
    public void kontrola(Projekt p) throws SitumException {
        if(p.getNaziv()==null) {
            throw new SitumException("Naziv je null, obavezan unos");
        }
        if(p.getNaziv().trim().isEmpty()) {
            throw new SitumException("Naziv je prazan, obavezan unos");
        }
    }

    @Override
    public Projekt spremi(Projekt p) throws SitumException {
        kontrola(p);
        return dao.save(p);
    }

    @Override
    public void obrisi(Projekt p) throws SitumException {
         
        dao.delete(p);
    }
    
}
