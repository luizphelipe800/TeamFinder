package com.teamfinder.controllers;

import com.teamfinder.beans.PessoaEquipeBean;
import com.teamfinder.beans.PessoaBean;
import com.teamfinder.beans.EquipeBean;
import com.teamfinder.dbs.EventoEquipeDao;
import com.teamfinder.dbs.PessoaEquipeDao;

import java.sql.SQLException;

public class PessoaEquipeController {
    private PessoaEquipeDao pessoaEquipeDao;
    private PessoaController pessoaController;
    private EquipeController equipeController;

    public void inserir(PessoaEquipeBean pessoaEquipe) throws SQLException, ClassNotFoundException{
        pessoaEquipeDao = new PessoaEquipeDao();
        pessoaEquipeDao.inserir(pessoaEquipe);
    }

    public void remover(PessoaEquipeBean pessoaEquipe) throws SQLException, ClassNotFoundException{
        pessoaEquipeDao = new PessoaEquipeDao();
        pessoaEquipeDao.remover(pessoaEquipe);
    }
}