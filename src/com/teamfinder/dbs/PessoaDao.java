package com.teamfinder.dbs;

import com.mysql.jdbc.Connection;
import com.teamfinder.beans.PessoaBean;
import com.teamfinder.utils.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PessoaDao {
    private Connection banco;

    public PessoaDao() throws SQLException, ClassNotFoundException {
        this.banco = (Connection) new ConexaoDB().getConnection();
    }

    public PessoaBean buscar(PessoaBean pessoa) throws SQLException {
        String sql = "SELECT * FROM pe_pessoa WHERE pe_id = ?";
        PreparedStatement stmt = banco.prepareStatement(sql);
        
        stmt.setInt(1, pessoa.getId());

        ResultSet result = stmt.executeQuery();

        while(result.next()){
            pessoa.setId(result.getInt(1));
            pessoa.setNome(result.getString(2));
            pessoa.setDt_nascimento(result.getString(3));
            pessoa.setRg(result.getString(4));
            pessoa.setCpf(result.getString(5));
            pessoa.setNum_contato(result.getString(6));
        }

        return pessoa;
    }

    public void inserir(PessoaBean pessoa) throws SQLException {
        String sql = "INSERT INTO pe_pessoa (pe_nome, pe_dt_nascimento, pe_rg, pe_cpf, pe_num_contato) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = banco.prepareStatement(sql, Statement.NO_GENERATED_KEYS);

        stmt.setString(1, pessoa.getNome());
        stmt.setString(2, pessoa.getDt_nascimento());
        stmt.setString(3, pessoa.getRg());
        stmt.setString(4, pessoa.getCpf());
        stmt.setString(5, pessoa.getNum_contato());

        stmt.executeUpdate();
        stmt.close();
    }

    public void alterar(PessoaBean pessoa) throws SQLException {
        String sql = "UPDATE pe_pessoa SET pe_nome = ?, pe_dt_nascimento = ?, pe_rg = ?, pe_cpf = ?, pe_num_contato = ? WHERE pe_id = ?";
        PreparedStatement stmt = banco.prepareStatement(sql, Statement.NO_GENERATED_KEYS);

        stmt.setString(1, pessoa.getNome());
        stmt.setString(2, pessoa.getDt_nascimento());
        stmt.setString(3, pessoa.getRg());
        stmt.setString(4, pessoa.getCpf());
        stmt.setString(5, pessoa.getNum_contato());
        stmt.setInt(6, pessoa.getId());

        stmt.executeUpdate();
        stmt.close();
    }
}