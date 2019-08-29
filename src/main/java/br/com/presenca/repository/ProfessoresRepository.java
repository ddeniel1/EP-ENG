package br.com.presenca.repository;

import br.com.presenca.modelo.Professores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessoresRepository extends JpaRepository<Professores, Long> {
}
