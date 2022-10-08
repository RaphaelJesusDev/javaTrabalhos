package com.minha.av1;

import javax.swing.JOptionPane;

public class Cliente {
    
    
   private String nome;
   private String sexo;
   private String dataDeNascimento;
   private String email;
   private String senha;
   private String confirmandoSenha;
   
   
   
   
   Cliente(){
       
       
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public String getConfirmandoSenha() {
        return confirmandoSenha ;
    }

    public void setConfirmandoSenha(String confirmandoSenha) {
        this.confirmandoSenha = confirmandoSenha;
    }
    
    

    
   
    

 }
