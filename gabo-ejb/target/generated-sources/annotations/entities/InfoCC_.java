package entities;

import entities.CadenaCustodia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T12:45:53")
@StaticMetamodel(InfoCC.class)
public class InfoCC_ { 

    public static volatile SingularAttribute<InfoCC, Long> id;
    public static volatile SingularAttribute<InfoCC, String> hora;
    public static volatile SingularAttribute<InfoCC, String> motivo;
    public static volatile SingularAttribute<InfoCC, CadenaCustodia> cadenaCustodia;
    public static volatile SingularAttribute<InfoCC, String> recibeRun;
    public static volatile SingularAttribute<InfoCC, String> entregaCargo;
    public static volatile SingularAttribute<InfoCC, String> entregaUnidad;
    public static volatile SingularAttribute<InfoCC, String> entregaNombre;
    public static volatile SingularAttribute<InfoCC, Date> fecha;
    public static volatile SingularAttribute<InfoCC, String> recibeNombre;
    public static volatile SingularAttribute<InfoCC, String> recibeUnidad;
    public static volatile SingularAttribute<InfoCC, String> recibeCargo;
    public static volatile SingularAttribute<InfoCC, String> entregaRun;

}