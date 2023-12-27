package com.fttg.facturador.rest.smartt;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "idCooperativa",
    "idUnidad",
    "cedula",
    "ruc",
    "nombre",
    "correo",
    "telefono",
    "direccion",
    "cooperativa",
    "externalIdCooperativa",
    "externalIdBus",
    "placa",
    "disco",
    "marca",
    "anio",
    "capacidad"
})
@Generated("jsonschema2pojo")
public class BusInfo {

    @JsonProperty("idCooperativa")
    private Integer idCooperativa;
    @JsonProperty("idUnidad")
    private Integer idUnidad;
    @JsonProperty("cedula")
    private String cedula;
    @JsonProperty("ruc")
    private String ruc;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("correo")
    private String correo;
    @JsonProperty("telefono")
    private String telefono;
    @JsonProperty("direccion")
    private String direccion;
    @JsonProperty("cooperativa")
    private String cooperativa;
    @JsonProperty("externalIdCooperativa")
    private Integer externalIdCooperativa;
    @JsonProperty("externalIdBus")
    private Integer externalIdBus;
    @JsonProperty("placa")
    private String placa;
    @JsonProperty("disco")
    private String disco;
    @JsonProperty("marca")
    private String marca;
    @JsonProperty("anio")
    private Integer anio;
    @JsonProperty("capacidad")
    private String capacidad;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("idCooperativa")
    public Integer getIdCooperativa() {
        return idCooperativa;
    }

    @JsonProperty("idCooperativa")
    public void setIdCooperativa(Integer idCooperativa) {
        this.idCooperativa = idCooperativa;
    }

    @JsonProperty("idUnidad")
    public Integer getIdUnidad() {
        return idUnidad;
    }

    @JsonProperty("idUnidad")
    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    @JsonProperty("cedula")
    public String getCedula() {
        return cedula;
    }

    @JsonProperty("cedula")
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @JsonProperty("ruc")
    public String getRuc() {
        return ruc;
    }

    @JsonProperty("ruc")
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    @JsonProperty("nombre")
    public String getNombre() {
        return nombre;
    }

    @JsonProperty("nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JsonProperty("correo")
    public String getCorreo() {
        return correo;
    }

    @JsonProperty("correo")
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @JsonProperty("telefono")
    public String getTelefono() {
        return telefono;
    }

    @JsonProperty("telefono")
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @JsonProperty("direccion")
    public String getDireccion() {
        return direccion;
    }

    @JsonProperty("direccion")
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @JsonProperty("cooperativa")
    public String getCooperativa() {
        return cooperativa;
    }

    @JsonProperty("cooperativa")
    public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
    }

    @JsonProperty("externalIdCooperativa")
    public Integer getExternalIdCooperativa() {
        return externalIdCooperativa;
    }

    @JsonProperty("externalIdCooperativa")
    public void setExternalIdCooperativa(Integer externalIdCooperativa) {
        this.externalIdCooperativa = externalIdCooperativa;
    }

    @JsonProperty("externalIdBus")
    public Integer getExternalIdBus() {
        return externalIdBus;
    }

    @JsonProperty("externalIdBus")
    public void setExternalIdBus(Integer externalIdBus) {
        this.externalIdBus = externalIdBus;
    }

    @JsonProperty("placa")
    public String getPlaca() {
        return placa;
    }

    @JsonProperty("placa")
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @JsonProperty("disco")
    public String getDisco() {
        return disco;
    }

    @JsonProperty("disco")
    public void setDisco(String disco) {
        this.disco = disco;
    }

    @JsonProperty("marca")
    public String getMarca() {
        return marca;
    }

    @JsonProperty("marca")
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @JsonProperty("anio")
    public Integer getAnio() {
        return anio;
    }

    @JsonProperty("anio")
    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @JsonProperty("capacidad")
    public String getCapacidad() {
        return capacidad;
    }

    @JsonProperty("capacidad")
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "BusInfo{" + "idCooperativa=" + idCooperativa + ", idUnidad=" + idUnidad + ", cedula=" + cedula + ", ruc=" + ruc + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + ", cooperativa=" + cooperativa + ", externalIdCooperativa=" + externalIdCooperativa + ", externalIdBus=" + externalIdBus + ", placa=" + placa + ", disco=" + disco + ", marca=" + marca + ", anio=" + anio + ", capacidad=" + capacidad + ", additionalProperties=" + additionalProperties + '}';
    }
}
