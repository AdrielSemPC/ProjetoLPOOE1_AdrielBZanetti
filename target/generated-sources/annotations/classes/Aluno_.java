package classes;

import classes.Curso;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-05T10:15:36", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Aluno.class)
public class Aluno_ extends Pessoa_ {

    public static volatile SingularAttribute<Aluno, String> renach;
    public static volatile SingularAttribute<Aluno, Curso> curso;
    public static volatile SingularAttribute<Aluno, String> matricula;

}