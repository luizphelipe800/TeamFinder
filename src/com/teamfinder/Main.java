package com.teamfinder;

import com.teamfinder.beans.PessoaBean;
import com.teamfinder.beans.EquipeBean;
import com.teamfinder.controllers.PessoaController;
import com.teamfinder.controllers.EquipeController;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        PessoaController pessoaController = new PessoaController();
        EquipeController equipeController = new EquipeController();

        PessoaBean pessoa = new PessoaBean(1, "", "", "", "", "");
        EquipeBean equipe = new EquipeBean(0, "Largatixas", 1);

        equipeController.inserir(equipe);
    }
}