package com.fttg.facturador;

import com.fttg.facturador.entities.Bus;
import com.fttg.facturador.entities.Cooperativa;
import com.fttg.facturador.entities.Duenio;
import com.fttg.facturador.entities.DuenioPK;
import com.fttg.facturador.errors.BusNotFoundException;
import com.fttg.facturador.rest.tcontrol.BusTransaccion;
import com.fttg.facturador.rest.smartt.BusInfo;
import com.fttg.facturador.rest.smartt.BusInfoDuenio;
import com.fttg.facturador.services.BusTransaccionService;
import com.fttg.facturador.services.BusInfoService;
import com.fttg.facturador.services.BusService;
import com.fttg.facturador.services.DuenioService;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class FacturadorAppApplication {

    public FacturadorAppApplication(BusTransaccionService busTransaccionService, BusInfoService busInfoService, BusService busService, DuenioService duenioService) {
        log.info("Hola");
        Integer cont1 = 1;
        Integer cont2 = 1;
        Integer cont3 = 1;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        duenioService.deleteDuenio();
        BusTransaccion[] trx = busTransaccionService.getBusTransacciones(LocalDateTime.parse("2023-12-01 00:00:00", format), LocalDateTime.parse("2023-12-25 23:59:59", format));
        //BusTransaccion[] trx = busTransaccionService.getBusTransacciones(LocalDateTime.of(2023, Month.JANUARY, 01, 0, 0, 0), LocalDateTime.of(2023, Month.JANUARY, 31, 23, 59, 59));
        for (BusTransaccion busTransaccion : trx) {
            log.info("\n------------------------------------------ Bus en T.C. " + busTransaccion + "------------------------------------------");
            try {
                String estado = "A";
                BusInfo busInfo = busInfoService.getBusInfo(busTransaccion.getIdUnidad());
                Cooperativa coop = new Cooperativa(busInfo.getExternalIdCooperativa());
                Bus bus = new Bus(busInfo.getIdUnidad(), busInfo.getPlaca(), busInfo.getMarca(), busInfo.getDisco(), Integer.parseInt(busInfo.getCapacidad()), busInfo.getAnio(), busInfo.getNombre(), 2, 3, 100, new Date(), 1, new Date(), "Integración - Insert", estado.charAt(0), new Date(), 0.0, busInfo.getCedula(), coop);
                Duenio duenio = new Duenio(busInfo.getRuc(), busInfo.getNombre(), busInfo.getTelefono(), busInfo.getDireccion(), estado.charAt(0), busInfo.getCorreo());
                Bus actualizaBus = busService.updateBus(bus, busTransaccion.getIdUnidad());
                if (actualizaBus == null) {
                    log.info("No existe bus, se procede a insertar");
                    busService.insertBus(bus);
                } else {
                    log.info("Bus actualizado");
                }
                Duenio actualizaDuenio = duenioService.updateDuenio(duenio, busInfo.getCedula(), busInfo.getExternalIdCooperativa(), busInfo.getDisco());
                if (actualizaDuenio == null) {
                    log.info("No existe duenio, se procede a insertar");
                    duenioService.insertDuenio(duenio, busInfo.getCedula(), busInfo.getExternalIdCooperativa(), busInfo.getDisco());
                } else {
                    log.info("Duenio del Bus en Facturador: " + duenio);
                }
            } catch (Exception e1) {
                log.error("Error " + e1.getMessage() + " Error " + cont1++);
                try {
                    String estado = "A";
                    BusInfo busInfo = busInfoService.getBusInfoInactivo(busTransaccion.getIdUnidad());
                    Cooperativa coop = new Cooperativa(busInfo.getExternalIdCooperativa());
                    Bus bus = new Bus(busInfo.getIdUnidad(), busInfo.getPlaca(), busInfo.getMarca(), busInfo.getDisco(), Integer.parseInt(busInfo.getCapacidad()), busInfo.getAnio(), busInfo.getNombre(), 2, 3, 100, new Date(), 1, new Date(), "Integración - Insert", estado.charAt(0), new Date(), 0.0, busInfo.getCedula(), coop);
                    Duenio duenio = new Duenio(busInfo.getRuc(), busInfo.getNombre(), busInfo.getTelefono(), busInfo.getDireccion(), estado.charAt(0), busInfo.getCorreo());
                    Bus actualizaBus = busService.updateBus(bus, busTransaccion.getIdUnidad());
                    if (actualizaBus == null) {
                        log.info("No existe bus, se procede a insertar");
                        busService.insertBus(bus);
                    } else {
                        log.info("Bus actualizado");
                    }
                    Duenio actualizaDuenio = duenioService.updateDuenio(duenio, busInfo.getCedula(), busInfo.getExternalIdCooperativa(), busInfo.getDisco());
                    if (actualizaDuenio == null) {
                        log.info("No existe duenio, se procede a insertar");
                        duenioService.insertDuenio(duenio, busInfo.getCedula(), busInfo.getExternalIdCooperativa(), busInfo.getDisco());
                    } else {
                        log.info("Duenio del Bus en Facturador: " + duenio);
                    }
                } catch (Exception e2) {
                    log.error("Error New " + e2.getMessage() + " Error New " + cont2++);
                    try {
                        String estado = "A";
                        BusInfo busInfo = busInfoService.getBusInfoId(busTransaccion.getIdUnidad());
                        Cooperativa coop = new Cooperativa(busInfo.getExternalIdCooperativa());
                        Bus bus = new Bus(busInfo.getIdUnidad(), busInfo.getPlaca(), busInfo.getMarca(), busInfo.getDisco(), Integer.parseInt(busInfo.getCapacidad()), busInfo.getAnio(), busInfo.getNombre(), 2, 3, 100, new Date(), 1, new Date(), "Integración - Insert", estado.charAt(0), new Date(), 0.0, busInfo.getCedula(), coop);
                        log.info("Buses por ID se procede a insertar: " + busInfo);
                        busService.insertBus(bus);
                        Duenio duenio = new Duenio(busInfo.getRuc(), busInfo.getNombre(), busInfo.getTelefono(), busInfo.getDireccion(), estado.charAt(0), busInfo.getCorreo());
                        duenioService.insertDuenio(duenio, busInfo.getCedula(), busInfo.getExternalIdCooperativa(), busInfo.getDisco());
                    } catch (Exception e3) {
                        log.error("Error New " + e3.getMessage() + " Error NewNew " + cont3++ + "\n------------------------------------------------------------------------------------------------------------------------------------------------");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(FacturadorAppApplication.class, args);
    }
}
