package com.teamfinder.beans;

import java.io.Serializable;

public class EventoBean implements Serializable{

    private int id, enderecoId, equipeId;
    private String nome;
    private EnderecoBean endereco;
    private EquipeBean equipe;

    public EventoBean(int id, String nome, int enderecoId, int equipeId){
        this.id = id;
        this.nome = nome;
        this.enderecoId = enderecoId;
        this.equipeId = enderecoId;
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