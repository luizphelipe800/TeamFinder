package com.teamfinder.controllers;

import com.teamfinder.beans.PessoaBean;
import com.teamfinder.dbs.PessoaDao;
import java.sql.SQLException;

public class PessoaController {
    private PessoaDao pessoaDao;

    public PessoaBean buscar(PessoaBean pessoa) throws SQLException, ClassNotFoundException{
        pessoaDao = new PessoaDao();
        return pessoaDao.buscar(pessoa);
    }

    public void inserir(PessoaBean pessoa) throws SQLException, ClassNotFoundException{
        pessoaDao = new PessoaDao();
        pessoaDao.inserir(pessoa);
    }

    public void alterar(PessoaBean pessoa) throws SQLException, ClassNotFoundException{
        pessoaDao = new PessoaDao();
        pessoaDao.alterar(pessoa);
    }
}