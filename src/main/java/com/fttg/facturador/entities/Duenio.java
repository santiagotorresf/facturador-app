/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.facturador.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author storres
 */
@Entity
@Table(name = "duenio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Duenio.findAll", query = "SELECT d FROM Duenio d"),
    @NamedQuery(name = "Duenio.findByCedula", query = "SELECT d FROM Duenio d WHERE d.duenioPK.cedula = :cedula"),
    @NamedQuery(name = "Duenio.findByRuc", query = "SELECT d FROM Duenio d WHERE d.ruc = :ruc"),
    @NamedQuery(name = "Duenio.findByDuenio", query = "SELECT d FROM Duenio d WHERE d.duenio = :duenio"),
    @NamedQuery(name = "Duenio.findByTelefono", query = "SELECT d FROM Duenio d WHERE d.telefono = :telefono"),
    @NamedQuery(name = "Duenio.findByDireccion", query = "SELECT d FROM Duenio d WHERE d.direccion = :direccion"),
    @NamedQuery(name = "Duenio.findByIdCooperativa", query = "SELECT d FROM Duenio d WHERE d.duenioPK.idCooperativa = :idCooperativa"),
    @NamedQuery(name = "Duenio.findByDisco", query = "SELECT d FROM Duenio d WHERE d.duenioPK.disco = :disco"),
    @NamedQuery(name = "Duenio.findByEstado", query = "SELECT d FROM Duenio d WHERE d.estado = :estado"),
    @NamedQuery(name = "Duenio.findByCorreo", query = "SELECT d FROM Duenio d WHERE d.correo = :correo"),
    @NamedQuery(name = "Duenio.findDuenioByCedulaCoopDisco", query = "SELECT d FROM Duenio d WHERE d.duenioPK.cedula = :cedula AND d.duenioPK.disco = :disco AND d.duenioPK.idCooperativa = :idCooperativa ")})
public class Duenio implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DuenioPK duenioPK;
    @Column(name = "ruc")
    private String ruc;
    @Column(name = "duenio")
    private String duenio;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "estado")
    private Character estado;
    @Column(name = "correo")
    private String correo;

    public Duenio() {
    }

    public Duenio(DuenioPK duenioPK) {
        this.duenioPK = duenioPK;
    }

    public Duenio(String cedula, int idCooperativa, String disco) {
        this.duenioPK = new DuenioPK(cedula, idCooperativa, disco);
    }

    public Duenio(String ruc, String duenio, String telefono, String direccion, Character estado, String correo) {
        this.ruc = ruc;
        this.duenio = duenio;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
        this.correo = correo;
    }

    public DuenioPK getDuenioPK() {
        return duenioPK;
    }

    public void setDuenioPK(DuenioPK duenioPK) {
        this.duenioPK = duenioPK;
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

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (duenioPK != null ? duenioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Duenio)) {
            return false;
        }
        Duenio other = (Duenio) object;
        if ((this.duenioPK == null && other.duenioPK != null) || (this.duenioPK != null && !this.duenioPK.equals(other.duenioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Duenio{" + "duenioPK=" + duenioPK + ", ruc=" + ruc + ", duenio=" + duenio + ", telefono=" + telefono + ", direccion=" + direccion + ", estado=" + estado + ", correo=" + correo + '}';
    }
    
}
