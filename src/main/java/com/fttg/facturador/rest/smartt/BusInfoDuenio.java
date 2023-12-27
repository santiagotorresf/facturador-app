
package com.fttg.facturador.rest.smartt;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class BusInfoDuenio {

    private Integer idCooperativa;
    private Integer idUnidad;
    private String cedula;
    private String ruc;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String cooperativa;
    private Integer externalIdCooperativa;
    private Integer externalIdBus;
    private String placa;
    private String disco;
    private String marca;
    private Integer anio;
    private String capacidad;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Integer getIdCooperativa() {
        return idCooperativa;
    }

    public void setIdCooperativa(Integer idCooperativa) {
        this.idCooperativa = idCooperativa;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public String getCooperativa() {
        return cooperativa;
    }

    public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
    }

    public Integer getExternalIdCooperativa() {
        return externalIdCooperativa;
    }

    public void setExternalIdCooperativa(Integer externalIdCooperativa) {
        this.externalIdCooperativa = externalIdCooperativa;
    }

    public Integer getExternalIdBus() {
        return externalIdBus;
    }

    public void setExternalIdBus(Integer externalIdBus) {
        this.externalIdBus = externalIdBus;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "BusInfoDuenio{" + "idCooperativa=" + idCooperativa + ", idUnidad=" + idUnidad + ", cedula=" + cedula + ", ruc=" + ruc + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + ", cooperativa=" + cooperativa + ", externalIdCooperativa=" + externalIdCooperativa + ", externalIdBus=" + externalIdBus + ", placa=" + placa + ", disco=" + disco + ", marca=" + marca + ", anio=" + anio + ", capacidad=" + capacidad + ", additionalProperties=" + additionalProperties + '}';
    }

}
