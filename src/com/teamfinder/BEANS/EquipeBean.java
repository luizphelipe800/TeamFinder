package com.teamfinder.BEANS;

import java.io.Serializable;

public class EquipeBean implements Serializable{

    private int id;
    
    public EquipeBean(int id_eb){
        this.id = id_eb;
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
    
}