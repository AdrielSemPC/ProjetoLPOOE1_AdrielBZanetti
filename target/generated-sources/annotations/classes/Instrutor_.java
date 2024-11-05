package classes;

import classes.Curso;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-05T11:48:24", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Instrutor.class)
public class Instrutor_ extends Pessoa_ {

    public static volatile ListAttribute<Instrutor, Curso> curso;
    public static volatile SingularAttribute<Instrutor, String> cnh;

}