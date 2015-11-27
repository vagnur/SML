/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.InfoCC;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Gabriel
 */
@Local
public interface InfoCCFacadeLocal {

    void create(InfoCC infoCC);

    void edit(InfoCC infoCC);

    void remove(InfoCC infoCC);

    InfoCC find(Object id);

    List<InfoCC> findAll();

    List<InfoCC> findRange(int[] range);

    int count();
    
}
