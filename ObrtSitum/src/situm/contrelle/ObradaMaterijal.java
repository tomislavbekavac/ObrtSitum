/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situm.contrelle;

import java.util.List;
import org.hibernate.Query;
import situm.model.Materijal;
import situm.pomocno.HibernateUtil;
import situm.pomocno.ObradaSucelje;
import situm.pomocno.SitumException;

/**
 *
 * @author Tomislav
 */
public class ObradaMaterijal extends Obrada<Materijal> implements ObradaSucelje<Materijal>{
    
    public ObradaMaterijal() {
    super();
}
    
    @Override
    public List<Materijal> getLista() {
       return HibernateUtil.getSession().createQuery("from Materijal").list();  
    }

    @Override
    public void kontrola(Materijal m) throws SitumException {
       if(m.getMaterijal()==null) {
            throw new SitumException("Materijal je null, obavezan unos");
        }
      
    }

    @Override
    public Materijal spremi(Materijal m) throws SitumException {
        kontrola(m);
        return dao.save(m); 
    }

    @Override
    public void obrisi(Materijal m) throws SitumException {
        dao.delete(m);  
    }
    public List<Materijal> getLista(String uvjet,boolean isSelected){
         
         Query query = HibernateUtil.getSession().createQuery("from Materijal a "
                 + " where concat(a.materijal) like :uvjet")
                 .setString("uvjet", "%" + uvjet + "%");
         if(isSelected){
             query.setMaxResults(20);
         }
         
         return query.list();
     }
    
   
}
