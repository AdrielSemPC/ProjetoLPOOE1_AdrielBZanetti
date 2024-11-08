/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import javax.persistence.*;

/**
 *
 * @author adrie
 */

@Entity
@Table(name = "tb_Aluno")
public class Aluno extends Pessoa{
    @Column(name = "renach", nullable = false)
    private String renach;
    
    @Column(name = "matricula", nullable = false)
    private String matricula;
    
    @OneToOne(mappedBy = "aluno")
    private Curso curso;

    public String getRenach() {
        return renach;
    }

    public void setRenach(String renach) {
        this.renach= renach;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
        //curso.setAluno(this);
    }
}
