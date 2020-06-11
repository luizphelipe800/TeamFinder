package com.teamfinder.controllers;

import com.teamfinder.beans.EquipeBean;
import com.teamfinder.dbs.EquipeDao;
import java.sql.SQLException;
import java.util.List;

public class EquipeController {
    private EquipeDao equipeDao;

    public List<EquipeBean> listar () throws SQLException, ClassNotFoundException {
        List<EquipeBean> equipes;
        equipeDao = new EquipeDao();
        equipes = equipeDao.listar();
        return equipes;
    }

    public EquipeBean buscar (EquipeBean equipe) throws SQLException, ClassNotFoundException {
        equipeDao = new EquipeDao();
        return equipeDao.buscar(equipe);
    }

    public void inserir(EquipeBean equipe) throws SQLException, ClassNotFoundException {
        equipeDao = new EquipeDao();
        equipeDao.inserir(equipe);
    }

    public void alterar(EquipeBean equipe) throws SQLException, ClassNotFoundException {
        equipeDao = new EquipeDao();
        equipeDao.alterar(equipe);
    }

}