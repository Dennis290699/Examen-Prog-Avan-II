package com.programacion;

import com.programacion.service.concurrent.CourseTask;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainGestionCursosConcurrentExcuter {
    public static void main(String[] args) {
        SeContainer container = SeContainerInitializer.newInstance().initialize();

        // Crear un ExecutorService con un número fijo de hilos
        ExecutorService executor = Executors.newFixedThreadPool(2); // Ajusta el número según tus necesidades

        // Enviar las tareas al ExecutorService
        executor.submit(new CourseTask("John Doe", container));
        executor.submit(new CourseTask("Sarah Johnson", container));

        // Cerrar el ExecutorService
        executor.shutdown();

        try {
            // Esperar a que todas las tareas terminen
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow(); // Forzar el cierre si tarda demasiado
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("Todas las tareas han terminado.");
        container.close();
    }
}
