/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package situm.contrelle;

import java.util.List;

import situm.model.Obracun;
import situm.pomocno.HibernateUtil;
import situm.pomocno.ObradaSucelje;
import situm.pomocno.SitumException;

/**
 *
 * @author Tomislav
 */
public class ObradaObracun  extends Obrada<Obracun> implements ObradaSucelje<Obracun>{

   public ObradaObracun() {
       super();
   }
    
    @Override
    public List<Obracun> getLista() {
       return HibernateUtil.getSession().createQuery("from Obracun order by radnik.prezime ").list();
    }

    @Override
    public void kontrola(Obracun ob) throws SitumException {
       
    }

    @Override
    public Obracun spremi(Obracun ob) throws SitumException {
         kontrola(ob);
     
         
         return dao.save(ob);
    }

    @Override
    public void obrisi(Obracun ob) throws SitumException {
      dao.delete(ob);
    }
    
    
    
}
