package br.com.fatecfv.siga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fatecfv.siga.model.Aluno;

@Repository 
public interface AlunoRepository extends  JpaRepository<Aluno, Long> {
    
}
