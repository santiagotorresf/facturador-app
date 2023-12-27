/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.facturador.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author storres
 */
@Embeddable
public class DuenioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cedula")
    private String cedula;
    @Basic(optional = false)
    @Column(name = "id_cooperativa")
    private int idCooperativa;
    @Basic(optional = false)
    @Column(name = "disco")
    private String disco;

    public DuenioPK() {
    }

    public DuenioPK(String cedula, int idCooperativa, String disco) {
        this.cedula = cedula;
        this.idCooperativa = idCooperativa;
        this.disco = disco;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getIdCooperativa() {
        return idCooperativa;
    }

    public void setIdCooperativa(int idCooperativa) {
        this.idCooperativa = idCooperativa;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        hash += (int) idCooperativa;
        hash += (disco != null ? disco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DuenioPK)) {
            return false;
        }
        DuenioPK other = (DuenioPK) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        if (this.idCooperativa != other.idCooperativa) {
            return false;
        }
        if ((this.disco == null && other.disco != null) || (this.disco != null && !this.disco.equals(other.disco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.facturador.entities.DuenioPK[ cedula=" + cedula + ", idCooperativa=" + idCooperativa + ", disco=" + disco + " ]";
    }
    
}
