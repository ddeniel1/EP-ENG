package br.com.presenca.modelo;

import br.com.presenca.modelo.keys.AulasKey;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "AULAS")
public class Aulas implements Serializable {

    @EmbeddedId
    private AulasKey aulasKey;

    @Column(name = "DATA_RESERVA")
    private LocalDateTime reserva;

    @Column(name = "ENTIDADE")
    private String entidade;

    @Column(name = "DATA_SOLICITACAO")
    private LocalDateTime solicitacao;

    @Column(name = "JUSTIFICATIVA")
    private String justificativa;

    public Aulas() {
    }

    public Aulas(AulasKey aulasKey, LocalDateTime reserva, String entidade, LocalDateTime solicitacao, String justificativa) {
        this.aulasKey = aulasKey;
        this.reserva = reserva;
        this.entidade = entidade;
        this.solicitacao = solicitacao;
        this.justificativa = justificativa;
    }

    public Aulas(Aulas aulas) {

    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public AulasKey getAulasKey() {
        return aulasKey;
    }

    public void setAulasKey(AulasKey aulasKey) {
        this.aulasKey = aulasKey;
    }

    public LocalDateTime getReserva() {
        return reserva;
    }

    public String getEntidade() {
        return entidade;
    }

    public LocalDateTime getSolicitacao() {
        return solicitacao;
    }

    public void setReserva(LocalDateTime reserva) {
        this.reserva = reserva;
    }

    public void setEntidade(String entidade) {
        this.entidade = entidade;
    }

    public void setSolicitacao(LocalDateTime solicitacao) {
        this.solicitacao = solicitacao;
    }
}
