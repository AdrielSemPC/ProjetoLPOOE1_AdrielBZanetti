package classes;

import classes.Curso;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-05T11:48:24", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(HistoricoAulas.class)
public class HistoricoAulas_ { 

    public static volatile SingularAttribute<HistoricoAulas, Curso> curso;
    public static volatile ListAttribute<HistoricoAulas, Date> diaFrequentado;
    public static volatile SingularAttribute<HistoricoAulas, Integer> id;

}