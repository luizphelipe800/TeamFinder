package com.teamfinder.BEANS;

import java.io.Serializable;

public class LiderBean  implements Serializable{
    
    private int id;
    private String nome;

    public LiderBean (int idl, String nomel){

        this.id = idl;
        this.nome = nomel;
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
    public String getNome() {
        return nome;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

}