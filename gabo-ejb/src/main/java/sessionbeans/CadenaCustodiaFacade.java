/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.CadenaCustodia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gabriel
 */
@Stateless
public class CadenaCustodiaFacade extends AbstractFacade<CadenaCustodia> implements CadenaCustodiaFacadeLocal {

    @PersistenceContext(unitName = "pingeso_gabo2-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CadenaCustodiaFacade() {
        super(CadenaCustodia.class);
    }
    
}
