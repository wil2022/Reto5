/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Wilson
 */
public class clienteModel {
    
    private String cli_tag;
    private String cli_nombre;
    private String cli_email;
    private long cli_celular;
    private String cli_clave;
    private String cli_fecha_nto;
    
    public clienteModel(){}
    
    public clienteModel(String cli_tag, String cli_nombre, String cli_email, long cli_celular, String cli_clave, String cli_fecha_nto) {
        this.cli_tag = cli_tag;
        this.cli_nombre = cli_nombre;
        this.cli_email = cli_email;
        this.cli_celular = cli_celular;
        this.cli_clave = cli_clave;
        this.cli_fecha_nto = cli_fecha_nto;
    }

    /**
     * @return the cli_tag
     */
    public String getCli_tag() {
        return cli_tag;
    }

    /**
     * @param cli_tag the cli_tag to set
     */
    public void setCli_tag(String cli_tag) {
        this.cli_tag = cli_tag;
    }

    /**
     * @return the cli_nombre
     */
    public String getCli_nombre() {
        return cli_nombre;
    }

    /**
     * @return the cli_email
     */
    public String getCli_email() {
        return cli_email;
    }

    /**
     * @param cli_email the cli_email to set
     */
    public void setCli_email(String cli_email) {
        this.cli_email = cli_email;
    }

    /**
     * @return the cli_celular
     */
    public long getCli_celular() {
        return cli_celular;
    }

    /**
     * @param cli_celular the cli_celular to set
     */
    public void setCli_celular(long cli_celular) {
        this.cli_celular = cli_celular;
    }

    /**
     * @return the cli_clave
     */
    public String getCli_clave() {
        return cli_clave;
    }

    /**
     * @param cli_clave the cli_clave to set
     */
    public void setCli_clave(String cli_clave) {
        this.cli_clave = cli_clave;
    }

    /**
     * @return the cli_fecha_nto
     */
    public String getCli_fecha_nto() {
        return cli_fecha_nto;
    }

    
    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public void setCli_fecha_nto(String cli_fecha_nto) {
        this.cli_fecha_nto = cli_fecha_nto;
    }
    
    
    @Override
    public String toString() {
        return "clienteModel{" + "cli_nombre=" + cli_nombre + '}';
    }
    
    
}
