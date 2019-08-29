package br.com.presenca.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "AULAS")
@SequenceGenerator(name = "SEQ_AULA",allocationSize = 1)
public class Aulas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_AULA")
    private Integer id;

    @Column(name = "ID_PROFESSOR")
    private Integer idProfessor;

    @Column(name = "ID_MATERIA")
    private Integer idMateria;

    @Column(name = "ID_SALA")
    private Integer idSala;

    @Column(name = "HORARIO")
    private LocalDateTime horario;


    public Aulas(Integer idProfessor, Integer idMateria, Integer idSala, LocalDateTime horario) {
        this.idProfessor = idProfessor;
        this.idMateria = idMateria;
        this.idSala = idSala;
        this.horario = horario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public Aulas() {
    }
}
