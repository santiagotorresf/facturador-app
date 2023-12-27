/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.facturador.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author storres
 */
@Entity
@Table(name = "bus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bus.findAll", query = "SELECT b FROM Bus b"),
    @NamedQuery(name = "Bus.findById", query = "SELECT b FROM Bus b WHERE b.id = :id"),
    @NamedQuery(name = "Bus.findByPlaca", query = "SELECT b FROM Bus b WHERE b.placa = :placa"),
    @NamedQuery(name = "Bus.findByMarca", query = "SELECT b FROM Bus b WHERE b.marca = :marca"),
    @NamedQuery(name = "Bus.findByDisco", query = "SELECT b FROM Bus b WHERE b.disco = :disco"),
    @NamedQuery(name = "Bus.findByCapacidad", query = "SELECT b FROM Bus b WHERE b.capacidad = :capacidad"),
    @NamedQuery(name = "Bus.findByAnioFabricacion", query = "SELECT b FROM Bus b WHERE b.anioFabricacion = :anioFabricacion"),
    @NamedQuery(name = "Bus.findByDuenio", query = "SELECT b FROM Bus b WHERE b.duenio = :duenio"),
    @NamedQuery(name = "Bus.findByIdBusTipo", query = "SELECT b FROM Bus b WHERE b.idBusTipo = :idBusTipo"),
    @NamedQuery(name = "Bus.findByIdTipoServicio", query = "SELECT b FROM Bus b WHERE b.idTipoServicio = :idTipoServicio"),
    @NamedQuery(name = "Bus.findByIdUsuarioCreador", query = "SELECT b FROM Bus b WHERE b.idUsuarioCreador = :idUsuarioCreador"),
    @NamedQuery(name = "Bus.findByFechaCreacion", query = "SELECT b FROM Bus b WHERE b.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Bus.findByIdUsuarioModificador", query = "SELECT b FROM Bus b WHERE b.idUsuarioModificador = :idUsuarioModificador"),
    @NamedQuery(name = "Bus.findByFechaModificacion", query = "SELECT b FROM Bus b WHERE b.fechaModificacion = :fechaModificacion"),
    @NamedQuery(name = "Bus.findByMotivoModificacion", query = "SELECT b FROM Bus b WHERE b.motivoModificacion = :motivoModificacion"),
    @NamedQuery(name = "Bus.findByEstado", query = "SELECT b FROM Bus b WHERE b.estado = :estado"),
    @NamedQuery(name = "Bus.findByRetorno", query = "SELECT b FROM Bus b WHERE b.retorno = :retorno"),
    @NamedQuery(name = "Bus.findBySaldo", query = "SELECT b FROM Bus b WHERE b.saldo = :saldo"),
    @NamedQuery(name = "Bus.findByCedula", query = "SELECT b FROM Bus b WHERE b.cedula = :cedula")})
public class Bus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "placa")
    private String placa;
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @Column(name = "disco")
    private String disco;
    @Basic(optional = false)
    @Column(name = "capacidad")
    private int capacidad;
    @Column(name = "anio_fabricacion")
    private Integer anioFabricacion;
    @Column(name = "duenio")
    private String duenio;
    @Basic(optional = false)
    @Column(name = "id_bus_tipo")
    private int idBusTipo;
    @Basic(optional = false)
    @Column(name = "id_tipo_servicio")
    private int idTipoServicio;
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
    @Column(name = "estado")
    private Character estado;
    @Column(name = "retorno")
    @Temporal(TemporalType.TIMESTAMP)
    private Date retorno;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldo")
    private Double saldo;
    @Column(name = "cedula")
    private String cedula;
    @JoinColumn(name = "id_cooperativa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cooperativa idCooperativa;

    public Bus() {
    }

    public Bus(Integer id) {
        this.id = id;
    }

    public Bus(Integer id, String placa, String disco, int capacidad, int idBusTipo, int idTipoServicio, int idUsuarioCreador, Date fechaCreacion) {
        this.id = id;
        this.placa = placa;
        this.disco = disco;
        this.capacidad = capacidad;
        this.idBusTipo = idBusTipo;
        this.idTipoServicio = idTipoServicio;
        this.idUsuarioCreador = idUsuarioCreador;
        this.fechaCreacion = fechaCreacion;
    }

    public Bus(Integer id, String placa, String marca, String disco, int capacidad, Integer anioFabricacion, String duenio, int idBusTipo, int idTipoServicio, int idUsuarioCreador, Date fechaCreacion, Integer idUsuarioModificador, Date fechaModificacion, String motivoModificacion, Character estado, Date retorno, Double saldo, String cedula, Cooperativa idCooperativa) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.disco = disco;
        this.capacidad = capacidad;
        this.anioFabricacion = anioFabricacion;
        this.duenio = duenio;
        this.idBusTipo = idBusTipo;
        this.idTipoServicio = idTipoServicio;
        this.idUsuarioCreador = idUsuarioCreador;
        this.fechaCreacion = fechaCreacion;
        this.idUsuarioModificador = idUsuarioModificador;
        this.fechaModificacion = fechaModificacion;
        this.motivoModificacion = motivoModificacion;
        this.estado = estado;
        this.retorno = retorno;
        this.saldo = saldo;
        this.cedula = cedula;
        this.idCooperativa = idCooperativa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public int getIdBusTipo() {
        return idBusTipo;
    }

    public void setIdBusTipo(int idBusTipo) {
        this.idBusTipo = idBusTipo;
    }

    public int getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(int idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
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

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Date getRetorno() {
        return retorno;
    }

    public void setRetorno(Date retorno) {
        this.retorno = retorno;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Cooperativa getIdCooperativa() {
        return idCooperativa;
    }

    public void setIdCooperativa(Cooperativa idCooperativa) {
        this.idCooperativa = idCooperativa;
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
        if (!(object instanceof Bus)) {
            return false;
        }
        Bus other = (Bus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fttg.facturador.entities.Bus[ id=" + id + " ]";
    }
    
}
