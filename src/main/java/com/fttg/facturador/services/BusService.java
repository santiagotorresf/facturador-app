/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.facturador.services;

import com.fttg.facturador.entities.Bus;
import com.fttg.facturador.repositories.BusRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import lombok.extern.log4j.Log4j2;

/**
 *
 * @author storres
 */
@Log4j2
@Service
public class BusService {

    @Autowired
    private BusRepository repo;

    public Bus findById(Integer id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                String.format("Bus %s not found", id)));
    }

    public Bus updateBus(Bus bus, Integer idBus) {
        try {
            Bus busToBeUpdate = repo.findById(idBus).get();
            busToBeUpdate.setAnioFabricacion(bus.getAnioFabricacion());
            busToBeUpdate.setCapacidad(bus.getCapacidad());
            busToBeUpdate.setCedula(bus.getCedula());
            busToBeUpdate.setDisco(bus.getDisco());
            busToBeUpdate.setDuenio(bus.getDuenio());
            busToBeUpdate.setEstado(bus.getEstado());
            busToBeUpdate.setFechaModificacion(bus.getFechaModificacion());
            busToBeUpdate.setIdBusTipo(bus.getIdBusTipo());
            busToBeUpdate.setIdTipoServicio(bus.getIdTipoServicio());
            busToBeUpdate.setIdUsuarioCreador(bus.getIdUsuarioCreador());
            busToBeUpdate.setIdUsuarioModificador(bus.getIdUsuarioModificador());
            busToBeUpdate.setMarca(bus.getMarca());
            busToBeUpdate.setMotivoModificacion("Integración - Update");
            busToBeUpdate.setPlaca(bus.getPlaca());
            busToBeUpdate.setRetorno(bus.getRetorno());
            busToBeUpdate.setSaldo(bus.getSaldo());
            return repo.save(busToBeUpdate);
        } catch (Exception e) {
            return null;
        }
    }

    public Bus insertBus(Bus bus) {
        return repo.save(bus);
    }
    
}
