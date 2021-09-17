/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import utils.ConnectionDB;

import model.clienteModel;

/**
 *
 * @author Wilson
 */
public class clienteDAO {

    private Connection conn = null;

    public ArrayList<clienteModel> getAllClientes() {

        ArrayList<clienteModel> clientes = new ArrayList();

        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto FROM cliente;";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                clienteModel cliente = new clienteModel(result.getString(1), result.getString(2), result.getString(3), result.getLong(4), result.getString(5), result.getString(6));
                clientes.add(cliente);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return clientes;

    }

    public clienteModel getCliente(clienteModel cliente) {
        clienteModel client = null;
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "SELECT cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto FROM cliente WHERE cli_tag=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, cliente.getCli_tag());
            ResultSet result = statement.executeQuery();
           // while (result.next()) {
           // client = new clienteModel(result.getString(1), result.getString(2), result.getString(3), result.getLong(4), result.getString(5), result.getString(6));
                
           // }
           result.next();
           //String cli_tag = result.getString(1);
           String cli_nombre = result.getString(2);
           String cli_email = result.getString(3);
           long cli_celular = result.getLong(4);
           String cli_clave = result.getString(5);
           String cli_fecha_nto = result.getString(6);
           
           client = new clienteModel();
           //cliente.setCli_tag(cli_tag);
           cliente.setCli_nombre(cli_nombre);
           cliente.setCli_email(cli_email);
           cliente.setCli_celular(cli_celular);
           cliente.setCli_clave(cli_clave);
           cliente.setCli_fecha_nto(cli_fecha_nto);
           
           
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
        return client;

    }
    
    

    /**
     *
     * @param cliente
     */
    public void insertCliente(clienteModel cliente) {
        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "insert into cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto)"
                    + "values(?,?,?,?,?,?);";

            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, cliente.getCli_tag());
            statement.setString(2, cliente.getCli_nombre());
            statement.setString(3, cliente.getCli_email());
            statement.setLong(4, cliente.getCli_celular());
            statement.setString(5, cliente.getCli_clave());
            statement.setString(6, cliente.getCli_fecha_nto());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue agregado exitosamente !");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }

    }

    /**
     *
     * @param cliente
     */
    
    public void updateCliente(clienteModel cliente) {

        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "update cliente set cli_nombre=?, cli_email=?, cli_celular=?, cli_clave=?, cli_fecha_nto=? where cli_tag = ?;";

            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, cliente.getCli_nombre());
            statement.setString(2, cliente.getCli_email());
            statement.setLong(3, cliente.getCli_celular());
            statement.setString(4, cliente.getCli_clave());
            statement.setString(5, cliente.getCli_fecha_nto());
            statement.setString(6, cliente.getCli_tag());
            
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue actualizado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }

    }
    
    

    public void deleteCliente(clienteModel cliente) {

        try {
            if (conn == null) {
                conn = ConnectionDB.getConnection();
            }

            String sql = "DELETE FROM cliente WHERE cli_tag = ?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, cliente.getCli_tag());
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue borrado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }

    }

}
