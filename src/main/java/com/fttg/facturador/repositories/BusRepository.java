/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fttg.facturador.repositories;

import com.fttg.facturador.entities.Bus;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author storres
 */
@Repository
public interface BusRepository extends JpaRepository<Bus, Integer> {
    /*
    @Override
    public Optional<Bus> findById(Integer id);
     */
}
