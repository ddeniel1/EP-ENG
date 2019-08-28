package br.com.presenca.repository;

import br.com.presenca.modelo.Aulas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AulasRepository extends JpaRepository<Aulas, Long> {
}
