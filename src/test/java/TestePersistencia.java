
import classes.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lpoo.sistemaautoescola.dao.PersistenciaJPA;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adrie
 */
public class TestePersistencia {
    PersistenciaJPA jpa = new PersistenciaJPA();
    public TestePersistencia() {
    }
    
    @Before
    public void setUp() {
        if(jpa.conexaoAberta()){
            System.out.println("Conexão aberta.");
        }
        else{
            System.out.println("Erro ao abrir conexão.");
        }
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void teste(){
        Administrativo adm = new Administrativo();
        Aluno al = new Aluno();
        Curso c = new Curso(); //quase
        HistoricoAulas ha = new HistoricoAulas();
        Instrutor i = new Instrutor();
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(1999, Calendar.JANUARY, 1);
        Date data = calendar.getTime();
        
        adm.setNome("Carla");
        adm.setCpf("12345678910");
        adm.setData_de_nasc(data);
        adm.setFone("54912345678");
        adm.setCargo("Recepcionista");
        
        calendar.set(1995, Calendar.JULY, 30);
        data = calendar.getTime();
        
        i.setNome("Severino");
        i.setCpf("12345678912");
        i.setData_de_nasc(data);
        i.setFone("55913249876");
        i.setCnh("2222");
        i.addCurso(c);
        
        calendar.set(2006, Calendar.MAY, 5);
        data = calendar.getTime();
        
        al.setNome("Felipe");
        al.setCpf("12345678911");
        al.setData_de_nasc(data);
        al.setRenach("1111");
        al.setMatricula("1234");
        al.setFone("56978945632");
        al.setCurso(null);
        
//        System.out.println(al.getCurso());
        
        calendar.set(2024, Calendar.JULY, 1);
        data = calendar.getTime();
//        ha.addData(data);
//        calendar.set(2024, Calendar.JULY, 2);
//        data = calendar.getTime();
//        ha.addData(data);
//        calendar.set(2024, Calendar.JULY, 3);
//        data = calendar.getTime();
//        ha.addData(data);
//        calendar.set(2024, Calendar.JULY, 4);
//        data = calendar.getTime();
//        ha.addData(data);
//        calendar.set(2024, Calendar.JULY, 5);
//        data = calendar.getTime();
//        ha.addData(data);
//        ha.setCurso(null);
        
        calendar.set(2024, Calendar.MAY, 12);
        data = calendar.getTime();
        c.setCarga_horaria(60);
        c.setCategoria('A');
        c.setData_inicio(data);
        c.setFuncionario(adm);
        c.setInstrutor(i);
        c.setAluno(al);
        c.setHistoricoAulas(ha);
        
        try {
            jpa.persist(adm);
            jpa.persist(i);
            jpa.persist(al);
            jpa.persist(c);
            jpa.persist(ha);
            
        } catch (Exception ex) {
            Logger.getLogger(TestePersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
