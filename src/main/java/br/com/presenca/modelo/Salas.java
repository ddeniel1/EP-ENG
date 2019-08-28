package br.com.presenca.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="SALAS")
@SequenceGenerator(name = "ESPACO_SEQ", sequenceName = "SEQ_ESP", allocationSize = 1)
public class Salas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ESP_SEQ")
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    public Salas() {
    }



    public Salas(String nome) {
        this.nome = nome;
    }

    public Salas(Salas salas) {
        this.id = salas.getId();
        this.nome = salas.getNome();
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
