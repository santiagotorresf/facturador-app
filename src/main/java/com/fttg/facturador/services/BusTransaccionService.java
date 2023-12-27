/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.facturador.services;

import com.fttg.facturador.rest.tcontrol.BusTransaccion;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

/**
 *
 * @author Santiago Torres
 */
@Service
public class BusTransaccionService {

    private final WebClient webClient;

    public BusTransaccionService(WebClient.Builder builder) {
        webClient = builder.baseUrl("http://localhost:9091/api/v1/bus").build();
    }

    public BusTransaccion[] getBusTransacciones(LocalDateTime fechaInicial, LocalDateTime fechaFinal) {
        return webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                .path("/transacciones")
                .queryParam("fechaIni", String.valueOf(fechaInicial).replaceAll("T", " "))
                .queryParam("fechaFin", String.valueOf(fechaFinal).replaceAll("T", " "))
                //.queryParam("fechaIni", fechaInicial)
                //.queryParam("fechaFin", fechaFinal)
                .build())
                .retrieve()
                .bodyToMono(BusTransaccion[].class).block();
    }
}
