package br.com.presenca.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Professores")
@SequenceGenerator(name = "MODALIDADE_SEQ", sequenceName = "SEQ_MOD", allocationSize = 1)
public class Professores implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MODALIDADE_SEQ")
    private Integer id;

    @Column(name = "NOME")
    private String nome;


    public Professores() {
    }

    public Professores(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
