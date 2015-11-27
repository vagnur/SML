/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.CadenaCustodia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Gabriel
 */
@Local
public interface CadenaCustodiaFacadeLocal {

    void create(CadenaCustodia cadenaCustodia);

    void edit(CadenaCustodia cadenaCustodia);

    void remove(CadenaCustodia cadenaCustodia);

    CadenaCustodia find(Object id);

    List<CadenaCustodia> findAll();

    List<CadenaCustodia> findRange(int[] range);

    int count();
    
}
