/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situm.contrelle;

import java.util.List;
import org.hibernate.Query;
import situm.model.Korisnik;
import situm.model.Radnik;
import situm.pomocno.HibernateUtil;
import situm.pomocno.ObradaSucelje;
import situm.pomocno.SitumException;

/**
 *
 * @author Tomislav
 */
public class ObradaRadnik extends Obrada<Radnik> implements ObradaSucelje<Radnik>{
    
    public ObradaRadnik() {
        super();
    }

    @Override
    public List<Radnik> getLista() {
 return HibernateUtil.getSession().createQuery("from Radnik").list();    
    }

    @Override
    public void kontrola(Radnik r) throws SitumException {
        if(r.getIme()==null) {
            throw new SitumException("Radnik je null, obavezan unos");
        }
        if(r.getIme().trim().isEmpty()) {
            throw new SitumException("Radnik nije unesen, obavezan unos");
        }
        if(r.getPrezime()==null) {
            throw new SitumException("Prezime je null, obavezan unos");
        }
        if(r.getPrezime().trim().isEmpty()) {
            throw new SitumException("Prezime nije uneseno, obavezan unos");
        }
    }

    @Override
    public Radnik spremi(Radnik r) throws SitumException {
        kontrola(r);
        return dao.save(r); 
    }

    @Override
    public void obrisi(Radnik r) throws SitumException {
        dao.delete(r);    
    
    }
     public List<Radnik> getLista(String uvjet,boolean isSelected){
         
         Query query = HibernateUtil.getSession().createQuery("from Radnik a "
                 + " where concat(a.ime) like :uvjet")
                 .setString("uvjet", "%" + uvjet + "%");
         if(isSelected){
             query.setMaxResults(20);
         }
         
         return query.list();
     }
}
