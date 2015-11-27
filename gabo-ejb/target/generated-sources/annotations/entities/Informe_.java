package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-27T16:53:02")
@StaticMetamodel(Informe.class)
public class Informe_ { 

    public static volatile SingularAttribute<Informe, Long> id;
    public static volatile SingularAttribute<Informe, Date> fecha;
    public static volatile SingularAttribute<Informe, String> numeroinforme;
    public static volatile SingularAttribute<Informe, String> persona;

}