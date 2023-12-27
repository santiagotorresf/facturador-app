
package com.fttg.facturador.rest.tcontrol;

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
    "idUnidad",
    "idCooperativa",
    "cooperativa",
    "disco"
})
@Generated("jsonschema2pojo")
public class BusTransaccion {

    @JsonProperty("idUnidad")
    private Integer idUnidad;
    @JsonProperty("idCooperativa")
    private Integer idCooperativa;
    @JsonProperty("cooperativa")
    private String cooperativa;
    @JsonProperty("disco")
    private String disco;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("idUnidad")
    public Integer getIdUnidad() {
        return idUnidad;
    }

    @JsonProperty("idUnidad")
    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    @JsonProperty("idCooperativa")
    public Integer getIdCooperativa() {
        return idCooperativa;
    }

    @JsonProperty("idCooperativa")
    public void setIdCooperativa(Integer idCooperativa) {
        this.idCooperativa = idCooperativa;
    }

    @JsonProperty("cooperativa")
    public String getCooperativa() {
        return cooperativa;
    }

    @JsonProperty("cooperativa")
    public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
    }

    @JsonProperty("disco")
    public String getDisco() {
        return disco;
    }

    @JsonProperty("disco")
    public void setDisco(String disco) {
        this.disco = disco;
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
        return "BusTransaccion{" + "idUnidad=" + idUnidad + ", idCooperativa=" + idCooperativa + ", cooperativa=" + cooperativa + ", disco=" + disco + ", additionalProperties=" + additionalProperties + '}';
    }

}
