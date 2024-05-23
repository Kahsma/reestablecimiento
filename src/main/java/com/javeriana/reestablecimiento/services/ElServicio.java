package com.javeriana.reestablecimiento.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ElServicio {
    private static final Logger logger = LoggerFactory.getLogger(ElServicio.class);

    public String saludar() {
        logger.info("Saludar method called");
        return "Hola mundo";
    }

    public boolean peticion_reestablecimiento(String proovedor, String producto) {
        logger.info("peticion_reestablecimiento method called with proovedor: {} and producto: {}", proovedor,
                producto);
        return true;
    }
}