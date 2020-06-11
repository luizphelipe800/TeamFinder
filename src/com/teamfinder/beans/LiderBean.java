package com.teamfinder.beans;

import java.io.Serializable;

public class LiderBean  implements Serializable{
    
    private int id, pessoaId, equipeId;
    private PessoaBean pessoa;
    private EquipeBean equipe;

    public LiderBean (int idl, int pessoaId, int equipeId, String nomel){
        this.id = idl;
        this.pessoaId = pessoaId;
        this.equipeId = equipeId;
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