package com.programacion;

import com.programacion.service.concurrent.CourseTask;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class MainGestionCursosConcurrent {
    public static void main(String[] args) {
        // Inicializar el contenedor de CDI
        SeContainer container = SeContainerInitializer.newInstance().initialize();

        // Ejecutar las tareas en paralelo usando hilos
        Thread thread1 = new Thread(new CourseTask("John Doe", container));
        Thread thread2 = new Thread(new CourseTask("Sarah Johnson", container));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todas las tareas han terminado.");
        container.close();
    }
}