package com.teamfinder.dbs;

import com.mysql.jdbc.Connection;
import com.teamfinder.beans.EnderecoBean;
import com.teamfinder.utils.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EnderecoDao {
    private Connection banco;

    public EnderecoDao() throws SQLException, ClassNotFoundException {
        this.banco = (Connection) new ConexaoDB().getConnection();
    }

    public EnderecoBean buscar(EnderecoBean endereco) throws SQLException {
        String sql = "Select * FROM en_endereco WHERE en_id = ?";
        PreparedStatement stmt = banco.prepareStatement(sql);
        stmt.setInt(1, endereco.getId());

        ResultSet result = stmt.executeQuery();

        while(result.next()){
            endereco.setId(result.getInt(1));
            endereco.setCep(result.getString(2));
            endereco.setLogradouro(result.getString(3));
            endereco.setNumero(result.getInt(4));
            endereco.setComplemento(result.getString(5));
        }

        return endereco;
    }

    public void inserir(EnderecoBean endereco) throws SQLException {
        String sql = "INSERT INTO en_endereco (en_cep, en_logradouro, en_numero, en_complemento) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = banco.prepareStatement(sql, Statement.NO_GENERATED_KEYS);

        stmt.setString(1, endereco.getCep());
        stmt.setString(2, endereco.getLogradouro());
        stmt.setInt(3, endereco.getNumero());
        stmt.setString(4, endereco.getComplemento());

        stmt.executeUpdate();
        stmt.close();
    }

    public void alterar(EnderecoBean endereco) throws SQLException {
        String sql = "UPDATE en_endereco SET en_cep = ?, en_Logradouro = ?, en_numero = ?, en_complemento = ? WHERE en_id = ?";
        PreparedStatement stmt = banco.prepareStatement(sql);

        stmt.setString(1, endereco.getCep());
        stmt.setString(2, endereco.getLogradouro());
        stmt.setInt(3, endereco.getNumero());
        stmt.setString(4, endereco.getComplemento());
        stmt.setInt(5, endereco.getId());

        stmt.executeUpdate();
        stmt.close();
    }
}