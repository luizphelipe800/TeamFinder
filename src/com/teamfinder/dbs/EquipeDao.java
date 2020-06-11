package com.teamfinder.dbs;

import com.mysql.jdbc.Connection;
import com.teamfinder.beans.EquipeBean;
import com.teamfinder.utils.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EquipeDao {
    private Connection banco;

    public EquipeDao() throws SQLException, ClassNotFoundException {
        this.banco = (Connection) new ConexaoDB().getConnection();
    }

    public List<EquipeBean> listar () throws SQLException {
        List<EquipeBean> equipes = new ArrayList<>();

        String sql = "SELECT * FROM eq_equipe";
        PreparedStatement stmt = banco.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();

        while(result.next()){
            EquipeBean equipe = new EquipeBean(
                result.getInt(1), 
                result.getString(2)
            );

            equipes.add(equipe);
        }

        return equipes;
    }

    public EquipeBean buscar (EquipeBean equipe) throws SQLException {
        String sql = "SELECT * FROM eq_equipe WHERE eq_id = ?";
        PreparedStatement stmt = banco.prepareStatement(sql);
        stmt.setInt(1, equipe.getId());

        ResultSet result = stmt.executeQuery();

        while(result.next()){
            equipe.setId(result.getInt(1));
            equipe.setNome(result.getString(2));
        }

        return equipe;
    }

    public void inserir (EquipeBean equipe) throws SQLException {
        String sql = "INSERT INTO eq_equipe (eq_nome) VALUE (?)";
        PreparedStatement stmt = banco.prepareStatement(sql, Statement.NO_GENERATED_KEYS);

        stmt.setString(1, equipe.getNome());

        stmt.executeUpdate();
        stmt.close();
    }

    public void alterar (EquipeBean equipe) throws SQLException {
        String sql = "UPDATE eq_equipe SET eq_nome = ? WHERE eq_id = ?";
        PreparedStatement stmt = banco.prepareStatement(sql);

        stmt.setString(1, equipe.getNome());
        stmt.setInt(2, equipe.getId());

        stmt.executeUpdate();
        stmt.close();
    }

}