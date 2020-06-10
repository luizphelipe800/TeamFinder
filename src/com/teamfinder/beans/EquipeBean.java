package com.teamfinder.BEANS;

import java.io.Serializable;

public class EquipeBean implements Serializable{

    private int id;
    private String nome;
    
    public EquipeBean(int id_eb, String nome_eb){
        this.id = id_eb;
        this.nome = nome_eb;
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


    
}