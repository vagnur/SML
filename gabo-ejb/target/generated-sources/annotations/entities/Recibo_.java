package entities;

import entities.CadenaCustodia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-28T01:46:27")
@StaticMetamodel(Recibo.class)
public class Recibo_ { 

    public static volatile SingularAttribute<Recibo, Boolean> traslado;
    public static volatile SingularAttribute<Recibo, String> entregaUnidad;
    public static volatile SingularAttribute<Recibo, Date> fecha;
    public static volatile SingularAttribute<Recibo, String> recibeNombre;
    public static volatile SingularAttribute<Recibo, Boolean> custodia;
    public static volatile SingularAttribute<Recibo, Long> id;
    public static volatile SingularAttribute<Recibo, CadenaCustodia> cadenaCustodia;
    public static volatile SingularAttribute<Recibo, String> hora;
    public static volatile SingularAttribute<Recibo, String> observacion;
    public static volatile SingularAttribute<Recibo, String> recibeRun;
    public static volatile SingularAttribute<Recibo, String> entregaCargo;
    public static volatile SingularAttribute<Recibo, String> entregaNombre;
    public static volatile SingularAttribute<Recibo, Boolean> peritaje;
    public static volatile SingularAttribute<Recibo, String> recibeUnidad;
    public static volatile SingularAttribute<Recibo, String> recibeCargo;
    public static volatile SingularAttribute<Recibo, String> entregaRun;

}