package com.programacion.service.concurrent;

import com.programacion.db.Course;
import com.programacion.service.interfaces.CourseService;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.persistence.EntityManager;
import java.util.List;

public class CourseTask implements Runnable {

    // Clase para ejecutar tareas en paralelo
    private String instructorName;
    private SeContainer container;

    // Constructor
    public CourseTask(String instructorName, SeContainer container) {
        this.instructorName = instructorName;
        this.container = container;
    }

    // Metodo para ejecutar la tarea
    @Override
    public void run() {
        synchronized (CourseTask.class) {
            CourseService courseService = container.select(CourseService.class).get();
            EntityManager em = courseService.getEntityManager();
            try {
                List<Course> courses = courseService.getCoursesByInstructor(instructorName);
                printCourses(instructorName, courses);
            } catch (Exception e) {
                printError(instructorName, e.getMessage());
            } finally {
                if (em != null && em.isOpen()) {
                    em.close();
                }
            }
        }
    }

    // Metodo para imprimir los cursos
    private void printCourses(String instructorName, List<Course> courses) {
        System.out.println(String.format("Cursos de %s:", instructorName));
        if (courses.isEmpty()) {
            System.out.println("No se encontraron cursos.");
        } else {
            courses.forEach(course -> System.out.println(String.format("  - %s", course.getTitle())));
        }
    }

    // Metodo para imprimir un error
    private void printError(String instructorName, String errorMessage) {
        System.err.println(String.format("Error al obtener cursos de %s: %s", instructorName, errorMessage));
    }
}