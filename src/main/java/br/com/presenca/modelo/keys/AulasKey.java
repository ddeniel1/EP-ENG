package br.com.presenca.modelo.keys;

import br.com.presenca.modelo.Aulas;
import br.com.presenca.modelo.Salas;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@SequenceGenerator(name = "AGENDAMENTO_SEQ", sequenceName = "SEQ_AGE", allocationSize = 1)
public class AulasKey implements Serializable {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AGENDAMENTO_SEQ")
    private Integer id;

    @ManyToOne
    private Salas idSalas;

    @ManyToOne
    private Aulas idAulas;

}
