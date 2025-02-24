package com.programacion;

import com.programacion.service.DataInserts;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class MainGestionLibrary {
    public static void main(String[] args) {
        // Inicializar el contenedor
        SeContainer container = SeContainerInitializer.newInstance().initialize();

        // Insertar los datos con DataInitializer
        
    }
}
