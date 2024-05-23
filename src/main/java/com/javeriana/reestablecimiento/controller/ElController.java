package com.javeriana.reestablecimiento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.javeriana.reestablecimiento.services.ElServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ElController {

    @Autowired
    private ElServicio servicio;

    @GetMapping("/api/saludar")
    public String hola() {
        return servicio.saludar();
    }

    @GetMapping("/api/reestablecer")
    public boolean reestablecer(@RequestParam String proovedor, @RequestParam String producto) {
        return servicio.peticion_reestablecimiento(proovedor, producto);
    }

}
