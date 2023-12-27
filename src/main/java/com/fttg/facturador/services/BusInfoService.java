/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.facturador.services;

import com.fttg.facturador.errors.BusNotFoundException;
import com.fttg.facturador.rest.smartt.BusInfo;
import com.fttg.facturador.rest.smartt.BusInfoDuenio;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 *
 * @author storres
 */
@Service
public class BusInfoService {

    private final WebClient webClient;

    public BusInfoService(WebClient.Builder builder) {
        webClient = builder.baseUrl("http://localhost:9090/api/v1/cooperativa/bus").build();
    }

    public BusInfo getBusInfo(Integer externalIdBus) {
        return webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                .path("/id")
                .queryParam("externalId", externalIdBus)
                .build())
                .retrieve()
                .onStatus(HttpStatus::isError, res -> res.bodyToMono(String.class).flatMap(error -> Mono.error(new BusNotFoundException(error))))
                .bodyToMono(BusInfo.class).block();
    }

    public BusInfo getBusInfoInactivo(Integer externalIdBus) {
        return webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                .path("/id2")
                .queryParam("externalId", externalIdBus)
                .build())
                .retrieve()
                .bodyToMono(BusInfo.class).block();
    }

    public BusInfoDuenio getBusInfoDuenio(Integer externalIdCoop, String disco) {
        return webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                .path("/idCoop")
                .queryParam("externalIdCooperativa", externalIdCoop)
                .queryParam("disco", disco)
                .build())
                .retrieve()
                .bodyToMono(BusInfoDuenio.class).block();
    }

    public BusInfo getBusInfoId(Integer idBus) {
        return webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                .path("/idBus")
                .queryParam("idBus", idBus)
                .build())
                .retrieve()
                .bodyToMono(BusInfo.class).block();
    }
}
