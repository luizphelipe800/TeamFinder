package com.teamfinder.controllers;

import com.teamfinder.beans.EventoBean;
import com.teamfinder.beans.EnderecoBean;
import com.teamfinder.beans.PessoaBean;
import com.teamfinder.dbs.EventoDao;
import java.sql.SQLException;
import java.util.List;

public class EventoController {
    private EventoDao eventoDao;
    private EnderecoController enderecoController;
    private PessoaController pessoaController;

    public List<EventoBean> listar () throws SQLException, ClassNotFoundException {
        eventoDao = new EventoDao();
        List<EventoBean> eventos = eventoDao.listar();

        enderecoController = new EnderecoController();
        pessoaController = new PessoaController();

        for (EventoBean evento : eventos) {
            EnderecoBean endereco = new EnderecoBean(evento.getEnderecoId(), "", "", 0, "");
            PessoaBean pessoa = new PessoaBean(evento.getPessoaId(), "", "", "", "", "");

            evento.setEndereco(enderecoController.buscar(endereco));
            //evento.setPessoa(pessoaController.buscar(pessoa));
        }

        return eventos;
    }

    public EventoBean buscar (EventoBean evento) throws SQLException, ClassNotFoundException {
        eventoDao = new EventoDao();
        evento = eventoDao.buscar(evento);
        //criando os controllers para executar as funções buscar
        enderecoController = new EnderecoController();
        pessoaController = new PessoaController();
        //criando os models para usar como parametro de busca
        EnderecoBean endereco = new EnderecoBean(evento.getEnderecoId(), "", "", 0, "");
        PessoaBean pessoa = new PessoaBean(evento.getPessoaId(), "", "", "", "", "");

        evento.setEndereco(enderecoController.buscar(endereco));
        //evento.setPessoa(pessoaController.buscar(pessoa));

        return evento;
    }

    public void inserir (EventoBean evento) throws SQLException, ClassNotFoundException {
        eventoDao = new EventoDao();
        eventoDao.inserir(evento);
    }

    public void alterar (EventoBean evento) throws SQLException, ClassNotFoundException { 
        eventoDao = new EventoDao();
        eventoDao.alterar(evento);
    }
}