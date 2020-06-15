package com.teamfinder.dbs;

import com.mysql.jdbc.Connection;
import com.teamfinder.beans.EventoEquipeBean;
import com.teamfinder.utils.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EventoEquipeDao {
    private Connection banco;

    public EventoEquipeDao() throws SQLException, ClassNotFoundException{
        this.banco = (Connection) new ConexaoDB().getConnection();
    }

    public void inserir(EventoEquipeBean eventoEquipe) throws SQLException{
        String sql = "INSERT INTO ev_eq_evento_equipe (ev_eq_evento_id, ev_eq_equipe_id) VALUES (?, ?)";
        PreparedStatement stmt = banco.prepareStatement(sql, Statement.NO_GENERATED_KEYS);

        stmt.setInt(1, eventoEquipe.getEventoId());
        stmt.setInt(2, eventoEquipe.getEquipeId());

        stmt.executeUpdate();
        stmt.close();
    }

    public void remover(EventoEquipeBean eventoEquipe) throws SQLException {
        String sql = "DELETE FROM ev_eq_evento_equipe WHERE ev_eq_id = ?";
        PreparedStatement stmt = banco.prepareStatement(sql);

        stmt.setInt(1, eventoEquipe.getId());

        stmt.executeUpdate();
        stmt.close();
    }
}