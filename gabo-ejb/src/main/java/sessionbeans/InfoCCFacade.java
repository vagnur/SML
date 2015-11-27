/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.InfoCC;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gabriel
 */
@Stateless
public class InfoCCFacade extends AbstractFacade<InfoCC> implements InfoCCFacadeLocal {

    @PersistenceContext(unitName = "pingeso_gabo-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InfoCCFacade() {
        super(InfoCC.class);
    }
    
}
