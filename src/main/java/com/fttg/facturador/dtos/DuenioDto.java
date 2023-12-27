/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.facturador.dtos;

/**
 *
 * @author storres
 */
public class DuenioDto {
    
    private String cedula;
    private String ruc;
    private String duenio;
    private String telefono;
    private String direccion;
    private Integer idCooperativa;
    private String disco;
    private String estado;
    private String correo;

    public DuenioDto(String cedula, String ruc, String duenio, String telefono, String direccion, Integer idCooperativa, String disco, String estado, String correo) {
        this.cedula = cedula;
        this.ruc = ruc;
        this.duenio = duenio;
        this.telefono = telefono;
        this.direccion = direccion;
        this.idCooperativa = idCooperativa;
        this.disco = disco;
        this.estado = estado;
        this.correo = correo;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getIdCooperativa() {
        return idCooperativa;
    }

    public void setIdCooperativa(Integer idCooperativa) {
        this.idCooperativa = idCooperativa;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
