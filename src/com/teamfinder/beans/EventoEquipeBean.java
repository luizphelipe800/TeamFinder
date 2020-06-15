package com.teamfinder.beans;

import java.io.Serializable;

public class EventoEquipeBean  implements Serializable{
    
    private int id, eventoId, equipeId;
    private EventoBean evento;
    private EquipeBean equipe;

    public EventoEquipeBean (int idl, int eventoId, int equipeId){
        this.id = idl;
        this.eventoId = eventoId;
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

    public void setEventoId(int eventoId){
        this.eventoId = eventoId;
    }

    public int getEventoId(){
        return this.eventoId;
    }

    public void setEquipeId(int equipeId){
        this.equipeId = equipeId;
    }

    public int getEquipeId(){
        return this.equipeId;
    }

    public void setEvento(EventoBean evento){
        this.evento = evento;
    }

    public EventoBean getEvento(){
        return this.evento;
    }

    public void setEquipe(EquipeBean equipe){
        this.equipe = equipe;
    }

    public EquipeBean getEquipe(){
        return this.equipe;
    }

}