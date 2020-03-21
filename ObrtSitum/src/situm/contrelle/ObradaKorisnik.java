/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situm.contrelle;

import java.util.List;
import org.hibernate.Query;
import situm.model.Korisnik;
import situm.pomocno.HibernateUtil;
import situm.pomocno.ObradaSucelje;
import situm.pomocno.SitumException;

/**
 *
 * @author Tomislav
 */
public class ObradaKorisnik extends Obrada<Korisnik> implements ObradaSucelje<Korisnik>{
    
    public ObradaKorisnik () {
        super();
    }

    @Override
    public List<Korisnik> getLista() {
                return HibernateUtil.getSession().createQuery("from Korisnik").list();   
    }

    @Override
    public void kontrola(Korisnik k) throws SitumException {
 if(k.getKorisnik()==null) {
            throw new SitumException("Korisnik je null, obavezan unos");
        }
        if(k.getKorisnik().trim().isEmpty()) {
            throw new SitumException("Korisnik nije unesen, obavezan unos");
        }
      
    }

    @Override
    public Korisnik spremi(Korisnik k) throws SitumException {
            kontrola(k);
        return dao.save(k);   
    }

    @Override
    public void obrisi(Korisnik k) throws SitumException {
            dao.delete(k);    
    }
    
    
     public List<Korisnik> getLista(String uvjet,boolean isSelected){
         
         Query query = HibernateUtil.getSession().createQuery("from Korisnik a "
                 + " where concat(a.korisnik) like :uvjet")
                 .setString("uvjet", "%" + uvjet + "%");
         if(isSelected){
             query.setMaxResults(20);
         }
         
         return query.list();
     }
}
