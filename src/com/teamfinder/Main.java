package com.teamfinder;

import com.teamfinder.utils.ConexaoDB;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        ConexaoDB conexao = new ConexaoDB();
        Connection conn = conexao.getConnection();

        if(conn != null) {
            System.out.println("Conexão feita com sucesso!");
        }else{
            System.out.println("Falha na Conexão");
        }
        

    }
}