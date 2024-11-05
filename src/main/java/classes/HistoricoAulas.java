/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author adrie
 */

@Entity
@Table(name = "tb_Historico")
public class HistoricoAulas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @ElementCollection
    @CollectionTable(name = "dias_frequentados")
    private List<Date> diaFrequentado;
    
    @OneToOne(mappedBy = "historico")
    private Curso curso;

    public HistoricoAulas(){
        this.diaFrequentado = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Date> getDia_frequentado() {
        return diaFrequentado;
    }

    public void setDia_frequentado(List<Date> dia_frequentado) {
        this.diaFrequentado = dia_frequentado;
    }
    
    public void addData(Date data_nova) {
        this.diaFrequentado.add(data_nova);
    } 

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
