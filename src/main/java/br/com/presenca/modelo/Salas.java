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

    @Column(name = "N_SALA")
    private Integer numero;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Salas() {
    }

    public Salas(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }
}
