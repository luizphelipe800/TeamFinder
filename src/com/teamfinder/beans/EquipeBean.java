package com.teamfinder.beans;

import java.io.Serializable;

public class EquipeBean implements Serializable{

    private int id, pessoaId;
    private String nome;
    private PessoaBean pessoa;
    
    public EquipeBean(int id_eb, String nome_eb, int pessoaId){
        this.id = id_eb;
        this.nome = nome_eb;
        this.pessoaId = pessoaId;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome(){
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPessoaId(int pessoaId){
        this.pessoaId = pessoaId;
    }

    public int getPessoaId(){
        return this.pessoaId;
    }

    public void setPessoa(PessoaBean pessoa){
        this.pessoa = pessoa;
    }

    public PessoaBean getPessoa(){
        return this.pessoa;
    }

    
}