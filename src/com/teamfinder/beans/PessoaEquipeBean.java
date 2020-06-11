package com.teamfinder.beans;

import java.io.Serializable;

public class PessoaEquipeBean implements Serializable{
    private int id, pessoaId, equipeId;
    private PessoaBean pessoa;
    private EquipeBean equipe;

    public PessoaEquipeBean(int id, int pessoaId, int equipeId){
        this.id = id;
        this.pessoaId = pessoaId;
        this.equipeId = equipeId;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setPessoaId(int pessoaId){
        this.pessoaId = pessoaId;
    }

    public int getPessoaId(){
        return this.pessoaId;
    }

    public void setEquipeId(int equipeId){
        this.equipeId = equipeId;
    }

    public int getEquipeId(){
        return this.equipeId;
    }

    public void setPessoa(PessoaBean pessoa){
        this.pessoa = pessoa;
    }

    public PessoaBean getPessoa(){
        return this.pessoa;
    }

    public void setEquipe(EquipeBean equipe){
        this.equipe = equipe;
    }

    public EquipeBean getEquipe(){
        return this.equipe;
    }
}