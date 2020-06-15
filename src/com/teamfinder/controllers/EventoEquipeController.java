package com.teamfinder.controllers;

import com.teamfinder.beans.EventoEquipeBean;
import com.teamfinder.beans.EventoBean;
import com.teamfinder.beans.EquipeBean;
import com.teamfinder.dbs.EventoEquipeDao;
import java.sql.SQLException;

public class EventoEquipeController {
    private EventoEquipeDao eventoEquipeDao;
    private EventoController eventoController;
    private EquipeController equipeController;

    public void inserir(EventoEquipeBean eventoEquipe) throws SQLException, ClassNotFoundException{
        eventoEquipeDao = new EventoEquipeDao();
        eventoEquipeDao.inserir(eventoEquipe);
    }

    public void remover(EventoEquipeBean eventoEquipe) throws SQLException, ClassNotFoundException{
        eventoEquipeDao = new EventoEquipeDao();
        eventoEquipeDao.remover(eventoEquipe);
    }
}