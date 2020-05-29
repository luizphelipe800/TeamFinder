package com.teamfinder.BEANS;

import java.io.Serializable;

class EventoBean implements Serializable{

    private int id, enderecoId, equipeId;
    private EnderecoBean endereco;
    private EquipeBean equipe;

    public EventoBean(int id, int enderecoId, int equipeId){
        this.id = id;
        this.enderecoId = enderecoId;
        this.equipeId = enderecoId;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setEnderecoId(int enderecoId){
        this.enderecoId = enderecoId;
    }

    public int getEnderecoId(){
        return this.enderecoId;
    }

    public void setEquipeId(int equipeId){
        this.equipeId = equipeId;
    }

    public int getEquipeId(){
        return this.equipeId;
    }

    public void setEndereco(EnderecoBean endereco){
        this.endereco = endereco;
    }

    public EnderecoBean getEndereco(){
        return this.endereco;
    }

    public void setEquipe(EquipeBean equipe){
        this.equipe = equipe;
    }

    public EquipeBean getEquipe(){
        return this.equipe;
    }
}