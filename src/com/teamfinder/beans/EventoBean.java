package com.teamfinder.beans;

import java.io.Serializable;

public class EventoBean implements Serializable{

    private int id, enderecoId, pessoaId;
    private String nome;
    private EnderecoBean endereco;
    private PessoaBean pessoa;

    public EventoBean(int id, String nome, int enderecoId, int pessoaId){
        this.id = id;
        this.nome = nome;
        this.enderecoId = enderecoId;
        this.pessoaId = pessoaId;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEnderecoId(int enderecoId){
        this.enderecoId = enderecoId;
    }

    public int getEnderecoId(){
        return this.enderecoId;
    }

    public void setPessoaId(int pessoaId){
        this.pessoaId = pessoaId;
    }

    public int getPessoaId(){
        return this.pessoaId;
    }

    public void setEndereco(EnderecoBean endereco){
        this.endereco = endereco;
    }

    public EnderecoBean getEndereco(){
        return this.endereco;
    }

    public void setPessoa(PessoaBean pessoa){
        this.pessoa = pessoa;
    }

    public PessoaBean getPessoa(){
        return this.pessoa;
    }
}