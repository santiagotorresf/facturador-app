/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.facturador.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author storres
 */
@Entity
@Table(name = "cooperativa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cooperativa.findAll", query = "SELECT c FROM Cooperativa c"),
    @NamedQuery(name = "Cooperativa.findById", query = "SELECT c FROM Cooperativa c WHERE c.id = :id"),
    @NamedQuery(name = "Cooperativa.findByRazonSocial", query = "SELECT c FROM Cooperativa c WHERE c.razonSocial = :razonSocial"),
    @NamedQuery(name = "Cooperativa.findByRepresentanteLegal", query = "SELECT c FROM Cooperativa c WHERE c.representanteLegal = :representanteLegal"),
    @NamedQuery(name = "Cooperativa.findByIdGremio", query = "SELECT c FROM Cooperativa c WHERE c.idGremio = :idGremio"),
    @NamedQuery(name = "Cooperativa.findByAnden", query = "SELECT c FROM Cooperativa c WHERE c.anden = :anden"),
    @NamedQuery(name = "Cooperativa.findByPisoSalida", query = "SELECT c FROM Cooperativa c WHERE c.pisoSalida = :pisoSalida"),
    @NamedQuery(name = "Cooperativa.findByIdSilo", query = "SELECT c FROM Cooperativa c WHERE c.idSilo = :idSilo"),
    @NamedQuery(name = "Cooperativa.findByIdUsuarioCreador", query = "SELECT c FROM Cooperativa c WHERE c.idUsuarioCreador = :idUsuarioCreador"),
    @NamedQuery(name = "Cooperativa.findByFechaCreacion", query = "SELECT c FROM Cooperativa c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Cooperativa.findByIdUsuarioModificador", query = "SELECT c FROM Cooperativa c WHERE c.idUsuarioModificador = :idUsuarioModificador"),
    @NamedQuery(name = "Cooperativa.findByFechaModificacion", query = "SELECT c FROM Cooperativa c WHERE c.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "Cooperativa.findByMotivoModificacion", query = "SELECT c FROM Cooperativa c WHERE c.motivoModificacion = :motivoModificacion"),
    @NamedQuery(name = "Cooperativa.findByNumVentanilla", query = "SELECT c FROM Cooperativa c WHERE c.numVentanilla = :numVentanilla"),
    @NamedQuery(name = "Cooperativa.findByAsumePrecioTasa", query = "SELECT c FROM Cooperativa c WHERE c.asumePrecioTasa = :asumePrecioTasa"),
    @NamedQuery(name = "Cooperativa.findByRuc", query = "SELECT c FROM Cooperativa c WHERE c.ruc = :ruc"),
    @NamedQuery(name = "Cooperativa.findByTipo", query = "SELECT c FROM Cooperativa c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Cooperativa.findByAnulaboleto", query = "SELECT c FROM Cooperativa c WHERE c.anulaboleto = :anulaboleto"),
    @NamedQuery(name = "Cooperativa.findByTiempolocalidad", query = "SELECT c FROM Cooperativa c WHERE c.tiempolocalidad = :tiempolocalidad")})
public class Cooperativa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "razon_social")
    private String razonSocial;
    @Column(name = "representante_legal")
    private String representanteLegal;
    @Basic(optional = false)
    @Column(name = "id_gremio")
    private int idGremio;
    @Basic(optional = false)
    @Column(name = "anden")
    private String anden;
    @Basic(optional = false)
    @Column(name = "piso_salida")
    private int pisoSalida;
    @Basic(optional = false)
    @Column(name = "id_silo")
    private int idSilo;
    @Basic(optional = false)
    @Column(name = "id_usuario_creador")
    private int idUsuarioCreador;
    @Basic(optional = false)
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "id_usuario_modificador")
    private Integer idUsuarioModificador;
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Column(name = "motivo_modificacion")
    private String motivoModificacion;
    @Basic(optional = false)
    @Column(name = "num_ventanilla")
    private String numVentanilla;
    @Basic(optional = false)
    @Column(name = "asume_precio_tasa")
    private Character asumePrecioTasa;
    @Basic(optional = false)
    @Column(name = "ruc")
    private String ruc;
    @Column(name = "tipo")
    private Integer tipo;
    @Basic(optional = false)
    @Column(name = "anulaboleto")
    private int anulaboleto;
    @Basic(optional = false)
    @Column(name = "tiempolocalidad")
    private int tiempolocalidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCooperativa")
    private List<Bus> busList;

    public Cooperativa() {
    }

    public Cooperativa(Integer id) {
        this.id = id;
    }

    public Cooperativa(Integer id, String razonSocial, int idGremio, String anden, int pisoSalida, int idSilo, int idUsuarioCreador, Date fechaCreacion, String numVentanilla, Character asumePrecioTasa, String ruc, int anulaboleto, int tiempolocalidad) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.idGremio = idGremio;
        this.anden = anden;
        this.pisoSalida = pisoSalida;
        this.idSilo = idSilo;
        this.idUsuarioCreador = idUsuarioCreador;
        this.fechaCreacion = fechaCreacion;
        this.numVentanilla = numVentanilla;
        this.asumePrecioTasa = asumePrecioTasa;
        this.ruc = ruc;
        this.anulaboleto = anulaboleto;
        this.tiempolocalidad = tiempolocalidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public int getIdGremio() {
        return idGremio;
    }

    public void setIdGremio(int idGremio) {
        this.idGremio = idGremio;
    }

    public String getAnden() {
        return anden;
    }

    public void setAnden(String anden) {
        this.anden = anden;
    }

    public int getPisoSalida() {
        return pisoSalida;
    }

    public void setPisoSalida(int pisoSalida) {
        this.pisoSalida = pisoSalida;
    }

    public int getIdSilo() {
        return idSilo;
    }

    public void setIdSilo(int idSilo) {
        this.idSilo = idSilo;
    }

    public int getIdUsuarioCreador() {
        return idUsuarioCreador;
    }

    public void setIdUsuarioCreador(int idUsuarioCreador) {
        this.idUsuarioCreador = idUsuarioCreador;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdUsuarioModificador() {
        return idUsuarioModificador;
    }

    public void setIdUsuarioModificador(Integer idUsuarioModificador) {
        this.idUsuarioModificador = idUsuarioModificador;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getMotivoModificacion() {
        return motivoModificacion;
    }

    public void setMotivoModificacion(String motivoModificacion) {
        this.motivoModificacion = motivoModificacion;
    }

    public String getNumVentanilla() {
        return numVentanilla;
    }

    public void setNumVentanilla(String numVentanilla) {
        this.numVentanilla = numVentanilla;
    }

    public Character getAsumePrecioTasa() {
        return asumePrecioTasa;
    }

    public void setAsumePrecioTasa(Character asumePrecioTasa) {
        this.asumePrecioTasa = asumePrecioTasa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public int getAnulaboleto() {
        return anulaboleto;
    }

    public void setAnulaboleto(int anulaboleto) {
        this.anulaboleto = anulaboleto;
    }

    public int getTiempolocalidad() {
        return tiempolocalidad;
    }

    public void setTiempolocalidad(int tiempolocalidad) {
        this.tiempolocalidad = tiempolocalidad;
    }

    @XmlTransient
    public List<Bus> getBusList() {
        return busList;
    }

    public void setBusList(List<Bus> busList) {
        this.busList = busList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cooperativa)) {
            return false;
        }
        Cooperativa other = (Cooperativa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.facturador.entities.Cooperativa[ id=" + id + " ]";
    }
    
}
