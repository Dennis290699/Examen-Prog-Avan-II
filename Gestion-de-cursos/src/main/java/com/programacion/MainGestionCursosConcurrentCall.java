package com.programacion;

import com.programacion.service.concurrent.CourseTask;
import com.programacion.db.Course;
import com.programacion.service.concurrent.CourseTaskCall;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class MainGestionCursosConcurrentCall {
    public static void main(String[] args) {
        SeContainer container = SeContainerInitializer.newInstance().initialize();

        ExecutorService executor = Executors.newFixedThreadPool(2);

        CourseTaskCall task1 = new CourseTaskCall("John Doe", container);
        CourseTaskCall task2 = new CourseTaskCall("Sarah Johnson", container);

        Future<List<Course>> future1 = executor.submit(task1);
        Future<List<Course>> future2 = executor.submit(task2);

        executor.shutdown();

        try {
            List<Course> courses1 = future1.get();
            List<Course> courses2 = future2.get();

            task1.printCourses(courses1);
            task2.printCourses(courses2);

            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (Exception e) {
            task1.printError(e.getMessage());
            task2.printError(e.getMessage());
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("Todas las tareas han terminado.");
        container.close();
    }
}