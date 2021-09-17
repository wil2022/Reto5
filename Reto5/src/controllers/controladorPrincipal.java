/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import model.clienteModel;
import view.vistaPrincipal;
import access.clienteDAO;
import java.util.ArrayList;

/**
 *
 * @author Wilson
 */
public class controladorPrincipal {

    vistaPrincipal vistaPrincipal;

    public controladorPrincipal(vistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
    }

    public void btnCrear() {

        clienteModel cliente = new clienteModel();

        cliente.setCli_tag(vistaPrincipal.getTfTag().getText());
        cliente.setCli_nombre(vistaPrincipal.getTfNombre().getText());
        cliente.setCli_email(vistaPrincipal.getTfEmail().getText());
        cliente.setCli_celular(Long.parseLong(vistaPrincipal.getTfCelular().getText()));
        cliente.setCli_clave(vistaPrincipal.getTfClave().getText());
        cliente.setCli_fecha_nto(vistaPrincipal.getTfFecha().getText());

        clienteDAO cliente1 = new clienteDAO();
        cliente1.insertCliente(cliente);
    }

    //public void btnCrear() {
    //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    public void btnActualizar() {

        clienteModel cliente = new clienteModel();

        cliente.setCli_tag(vistaPrincipal.getTfTag().getText());
        cliente.setCli_nombre(vistaPrincipal.getTfNombre().getText());
        cliente.setCli_email(vistaPrincipal.getTfEmail().getText());
        cliente.setCli_celular(Long.parseLong(vistaPrincipal.getTfCelular().getText()));
        cliente.setCli_clave(vistaPrincipal.getTfClave().getText());
        cliente.setCli_fecha_nto(vistaPrincipal.getTfFecha().getText());

        clienteDAO cliente1 = new clienteDAO();

        cliente1.updateCliente(cliente);
    }

    public void btnBorrar() {

        clienteModel cliente = new clienteModel();

        cliente.setCli_tag(vistaPrincipal.getTfTag().getText());

        clienteDAO cliente1 = new clienteDAO();

        cliente1.deleteCliente(cliente);
    }

    public void btnConsultar() {
        
       

        clienteModel cliente = new clienteModel();

        //cliente.setCli_tag(vistaPrincipal.getTfTag().getText());
        clienteDAO cliente1 = new clienteDAO();

        ArrayList<clienteModel> clientes = null;

        clientes = cliente1.getAllClientes();
        //Object O[] = null;
        
        for (int i = 0; i < clientes.size(); i++) {
            clienteModel getc = (clienteModel) clientes.get(i);
            //vistaPrincipal.getjTable1().addRowSelectionInterval(i, i);
            vistaPrincipal.getjTable1().setValueAt(getc.getCli_tag(), i, 0);
            vistaPrincipal.getjTable1().setValueAt(getc.getCli_nombre(), i, 1);
            vistaPrincipal.getjTable1().setValueAt(getc.getCli_email(), i, 2);
            vistaPrincipal.getjTable1().setValueAt(getc.getCli_celular(), i, 3);
            vistaPrincipal.getjTable1().setValueAt(getc.getCli_clave(), i, 4);
            vistaPrincipal.getjTable1().setValueAt(getc.getCli_fecha_nto(), i, 5);

        }
    }

    public void btnLimpiar() {
         vistaPrincipal.getjTable1().removeAll();
        vistaPrincipal.getTfTag().setText("");
        vistaPrincipal.getTfNombre().setText("");
        vistaPrincipal.getTfEmail().setText("");
        vistaPrincipal.getTfCelular().setText("");
        vistaPrincipal.getTfClave().setText("");
        vistaPrincipal.getTfFecha().setText("");
        
            }

    public void btnBuscar() {
        
        
       clienteModel cliente = new clienteModel();
        
       //cliente = new clienteModel(cliente.getCli_tag(),cliente.getCli_nombre(),cliente.getCli_email(),cliente.getCli_celular(),cliente.getCli_clave(),cliente.getCli_fecha_nto());

        cliente.setCli_tag(vistaPrincipal.getTfTag().getText());
      
        clienteDAO cliente1 = new clienteDAO();        
        
        cliente1.getCliente(cliente);
        
        
      
       // vistaPrincipal.getTfTag().setText(cliente.getCli_tag());
        vistaPrincipal.getTfNombre().setText(cliente.getCli_nombre());
        vistaPrincipal.getTfEmail().setText(cliente.getCli_email());
        vistaPrincipal.getTfCelular().setText(String.valueOf(cliente.getCli_celular()));
        vistaPrincipal.getTfClave().setText(cliente.getCli_clave());
        vistaPrincipal.getTfFecha().setText(cliente.getCli_fecha_nto());
            
      
    }

}
