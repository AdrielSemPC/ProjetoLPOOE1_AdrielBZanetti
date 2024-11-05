package classes;

import classes.Administrativo;
import classes.Aluno;
import classes.HistoricoAulas;
import classes.Instrutor;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-05T10:15:36", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Integer> carga_horaria;
    public static volatile SingularAttribute<Curso, Date> data_inicio;
    public static volatile SingularAttribute<Curso, Instrutor> instrutor;
    public static volatile SingularAttribute<Curso, Aluno> aluno;
    public static volatile SingularAttribute<Curso, Character> categoria;
    public static volatile SingularAttribute<Curso, HistoricoAulas> historico;
    public static volatile SingularAttribute<Curso, Integer> id;
    public static volatile SingularAttribute<Curso, Administrativo> funcionario;

}