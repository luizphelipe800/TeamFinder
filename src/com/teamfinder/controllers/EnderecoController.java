package com.teamfinder.controllers;

import com.teamfinder.beans.EnderecoBean;
import com.teamfinder.dbs.EnderecoDao;
import java.sql.SQLException;

public class EnderecoController {
    private EnderecoDao enderecoDao;

    public EnderecoBean buscar(EnderecoBean endereco) throws SQLException, ClassNotFoundException{
        enderecoDao = new EnderecoDao();
        return enderecoDao.buscar(endereco);
    }

    public void inserir(EnderecoBean endereco) throws SQLException, ClassNotFoundException{
        enderecoDao = new EnderecoDao();
        enderecoDao.inserir(endereco);
    }

    public void alterar(EnderecoBean endereco) throws SQLException, ClassNotFoundException{
        enderecoDao = new EnderecoDao();
        enderecoDao.alterar(endereco);
    }
}