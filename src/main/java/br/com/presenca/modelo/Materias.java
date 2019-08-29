package br.com.presenca.modelo;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "SEQ_MATERIA",allocationSize = 1)
public class Materias {

    @Id
    @GeneratedValue(generator = "SEQ_MATERIA", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "COD_MATERIA")
    private String codigo;

    @Column(name = "NOME_MATERIA")
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Materias() {
    }

    public Materias(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
}
