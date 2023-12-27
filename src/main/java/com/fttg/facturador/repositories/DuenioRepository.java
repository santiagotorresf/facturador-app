/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fttg.facturador.repositories;

import com.fttg.facturador.entities.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author storres
 */
@Repository
public interface DuenioRepository extends JpaRepository<Duenio, Integer> {
    /*
    @Query(nativeQuery = true)
    public DuenioDto findDuenioByCedula(String cedula, Integer idCoop, String disco);
     */
    public Duenio findDuenioByCedulaCoopDisco(String cedula, Integer idCooperativa, String disco);
}
