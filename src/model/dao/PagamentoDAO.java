/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

/**
 *
 * @author Matheus Alves
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.vo.Pagamento;

public class PagamentoDAO extends GenericDao {

    public void salvar(Pagamento pagamento) throws SQLException {
        String insert = "INSERT INTO Pagamento(descricao, valor, data, tipo) VALUES(?,?,? ,?)";
        save(insert, pagamento.getDescricao(), pagamento.getValor(), pagamento.getData(), pagamento.getTipo());
    }

    public void alterar(Pagamento pagamento) throws SQLException {
        String update = "UPDATE Pagamento "
                + "SET descricao = ?, valor = ?, data = ? , tipo = ?" + "WHERE id = ?";
        update(update, pagamento.getId(), pagamento.getDescricao(), pagamento.getValor(), pagamento.getData(), pagamento.getTipo(), pagamento.getId());
    }

    public void excluir(long id) throws SQLException {
        String delete = "DELETE FROM Pagamento WHERE id = ?";
        delete(delete, id);
    }

    public List<Pagamento> findPagamentos() throws SQLException {
        List<Pagamento> pagamentos = new ArrayList<Pagamento>();

        String select = "SELECT * FROM Pagamento";

        PreparedStatement stmt = getConnection().prepareStatement(select);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Pagamento pagamento = new Pagamento();
            pagamento.setId(rs.getInt("id"));
            pagamento.setDescricao(rs.getString("descricao"));
            pagamento.setValor(rs.getInt("valor"));
            pagamento.setData(rs.getDate("Data"));
            pagamento.setTipo(rs.getInt("tipo"));
            pagamentos.add(pagamento);
        }

        rs.close();
        stmt.close();

        return pagamentos;
    }

    public Pagamento findById(int id) throws SQLException {
        String select = "SELECT * FROM Pagamento WHERE id = ?";
        Pagamento pagamento = null;
        PreparedStatement stmt = getConnection().prepareStatement(select);

        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            pagamento = new Pagamento();
            pagamento.setId(rs.getInt("id"));
            pagamento.setDescricao(rs.getString("descricao"));
            pagamento.setValor(rs.getInt("valor"));
            pagamento.setData(rs.getDate("Data"));
            pagamento.setTipo(rs.getInt("tipo"));
        }

        rs.close();
        stmt.close();
        return pagamento;
    }

}
