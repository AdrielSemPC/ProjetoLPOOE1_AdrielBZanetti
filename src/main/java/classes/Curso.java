/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author adrie
 */

@Entity
@Table(name = "tbCurso")
public class Curso {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private int id;
   
   @Column(length = 1, nullable = false)
   private char categoria;
   
   @Column(name = "carga_horaria", nullable = false)
   private int carga_horaria;
   
   @Column(name = "data_inicio", nullable = false)
   private Date data_inicio;
   
   @ManyToOne
   @JoinColumn(name = "instrutor_id", nullable = false)
   private Instrutor instrutor;
   
   @OneToOne
   @JoinColumn(name = "aluno_id", nullable = false)
   private Aluno aluno;
   
   @ManyToOne
   @JoinColumn(name = "funcionario_id", nullable = false)
   private Administrativo funcionario;
   
   @ElementCollection
   @CollectionTable(name = "registro_aulas", joinColumns = @JoinColumn(name = "curso_id"))
   private List<RegistroAulas> aulas;

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public List<RegistroAulas> getAulas() {
        return aulas;
    }

    public void setAulas(List<RegistroAulas> aulas) {
        this.aulas = aulas;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Administrativo getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Administrativo funcionario) {
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
