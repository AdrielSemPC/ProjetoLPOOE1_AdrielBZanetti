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
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "tb_Pessoa")
public abstract class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String cpf;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_de_nasc;
    private String fone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_de_nasc() {
        return data_de_nasc;
    }

    public void setData_de_nasc(Date data_de_nasc) {
        this.data_de_nasc = data_de_nasc;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
