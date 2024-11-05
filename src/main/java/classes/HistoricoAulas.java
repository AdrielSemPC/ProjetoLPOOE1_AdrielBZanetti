/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author adrie
 */

@Entity
@Table(name = "tbHistorico")
public class HistoricoAulas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "dia_frequentado", nullable = false)
    private Date dia_frequentado;
    
    @OneToOne
    @JoinColumn(name = "instrutor_id", nullable = false)
    private Instrutor instrutor;
    
    @OneToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;
    
    @OneToOne
    @JoinColumn(name = "curso_id", nullable = false)
    private Curso curso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDia_frequentado() {
        return dia_frequentado;
    }

    public void setDia_frequentado(Date dia_frequentado) {
        this.dia_frequentado = dia_frequentado;
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
