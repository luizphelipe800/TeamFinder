package com.teamfinder.dbs;

import com.mysql.jdbc.Connection;
import com.teamfinder.beans.PessoaEquipeBean;
import com.teamfinder.utils.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PessoaEquipeDao {
    private Connection banco;

    public PessoaEquipeDao() throws SQLException, ClassNotFoundException{
        this.banco = (Connection) new ConexaoDB().getConnection();
    }

    public void inserir(PessoaEquipeBean pessoaEquipe) throws SQLException{
        String sql = "INSERT INTO pe_eq_pessoa_equipe (pe_eq_pessoa_id, pe_eq_equipe_id) VALUES (?, ?)";
        PreparedStatement stmt = banco.prepareStatement(sql, Statement.NO_GENERATED_KEYS);

        stmt.setInt(1, pessoaEquipe.getPessoaId());
        stmt.setInt(2, pessoaEquipe.getEquipeId());

        stmt.executeUpdate();
        stmt.close();
    }

    public void remover(PessoaEquipeBean pessoaEquipe) throws SQLException {
        String sql = "DELETE FROM pe_eq_pessoa_equipe WHERE pe_eq_id = ?";
        PreparedStatement stmt = banco.prepareStatement(sql);

        stmt.setInt(1, pessoaEquipe.getId());

        stmt.executeUpdate();
        stmt.close();
    }
}