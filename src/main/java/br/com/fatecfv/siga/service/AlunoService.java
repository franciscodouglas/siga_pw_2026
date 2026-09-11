package br.com.fatecfv.siga.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.fatecfv.siga.model.Aluno;
import br.com.fatecfv.siga.repository.AlunoRepository;

@Service
public class AlunoService {
    AlunoRepository alunoRepository;
    
    public AlunoService(AlunoRepository alunoRepository){
        //this.alunoRepository = new  AlunoRepository();
        this.alunoRepository = alunoRepository;
    }

    public Aluno cadastrar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public Aluno atualizar(Aluno aluno){
        return alunoRepository.save(aluno);
    }
    public void excluir(Long id){
        alunoRepository.deleteById(id);
    }
    public Optional<Aluno> consultarPorId(Long id){
        return alunoRepository.findById(id);
    }

    public List<Aluno> listar(){
        return alunoRepository.findAll();
    }

}
