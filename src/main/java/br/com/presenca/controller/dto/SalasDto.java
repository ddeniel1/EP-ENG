package br.com.presenca.controller.dto;

import br.com.presenca.modelo.Salas;

public class SalasDto {

    private Integer id;
    private String nome;

    public SalasDto(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public SalasDto() {
    }

    public SalasDto(Salas salas) {
        this.id = salas.getId();
        this.nome = salas.getNome();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}
