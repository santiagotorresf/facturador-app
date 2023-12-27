/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fttg.facturador.services;

import com.fttg.facturador.entities.Duenio;
import com.fttg.facturador.entities.DuenioPK;
import com.fttg.facturador.repositories.DuenioRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author storres
 */
@Log4j2
@Service
public class DuenioService {

    @Autowired
    private DuenioRepository repo;

    public Duenio findDuenioByCedulaCoopDisco(String cedula, Integer idCooperativa, String disco) {
        return repo.findDuenioByCedulaCoopDisco(cedula, idCooperativa, disco);
    }

    public Duenio insertDuenio(Duenio duenio, String cedula, Integer idCooperativa, String disco) {
        DuenioPK duenioPK = new DuenioPK(cedula, idCooperativa, disco);
        duenio.setDuenioPK(duenioPK);
        return repo.save(duenio);
    }

    public Duenio updateDuenio(Duenio duenio, String cedula, Integer idCooperativa, String disco) {
        try {
            Duenio duenioToBeUpdate = repo.findDuenioByCedulaCoopDisco(cedula, idCooperativa, disco);
            duenioToBeUpdate.setCorreo(duenio.getCorreo());
            duenioToBeUpdate.setDireccion(duenio.getDireccion());
            duenioToBeUpdate.setDuenio(duenio.getDuenio());
            duenioToBeUpdate.setEstado(duenio.getEstado());
            duenioToBeUpdate.setRuc(duenio.getRuc());
            duenioToBeUpdate.setTelefono(duenio.getTelefono());
            return repo.save(duenioToBeUpdate);
        } catch (Exception e) {
            return null;
        }
    }
    
    public void deleteDuenio() {
        repo.deleteAll();
    }
}
