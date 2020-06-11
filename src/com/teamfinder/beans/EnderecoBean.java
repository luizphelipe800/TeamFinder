package com.teamfinder.beans;

import java.io.Serializable;

public class EnderecoBean implements Serializable{

    private int id;
    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;

    public EnderecoBean(int id, String cep, String logradouro, int numero, String complemento){
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getCep(){
        return this.cep;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    public String getLogradouro(){
        return this.logradouro;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public String getComplemento(){
        return this.complemento;
    }
}