package br.com.fatecfv.siga.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity 
public class Aluno {
    @Id  // Definição da chave primária (PK= NOT NULL  e UNIQUE)
    @GeneratedValue(strategy= GenerationType.IDENTITY) //Definição dos valores sequencias e únicos
    private Long id;
    
    @NotNull 
    private String nome, email;


    public Aluno(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }


    public Aluno() {
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}
