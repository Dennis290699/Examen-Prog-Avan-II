package com.programacion.service.concurrent;

import com.programacion.db.Course;
import com.programacion.service.interfaces.CourseService;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.persistence.EntityManager;
import java.util.List;
import java.util.concurrent.Callable;

public class CourseTaskCall implements Callable<List<Course>> {

    private String instructorName;
    private SeContainer container;

    public CourseTaskCall(String instructorName, SeContainer container) {
        this.instructorName = instructorName;
        this.container = container;
    }

    @Override
    public List<Course> call() throws Exception {
        synchronized (CourseTask.class) {
            CourseService courseService = container.select(CourseService.class).get();
            EntityManager em = courseService.getEntityManager();
            try {
                return courseService.getCoursesByInstructor(instructorName);
            } finally {
                if (em != null && em.isOpen()) {
                    em.close();
                }
            }
        }
    }

    public String getInstructorName(){
        return instructorName;
    }

    public void printCourses(List<Course> courses) {
        System.out.println(String.format("Cursos de %s:", this.getInstructorName()));
        if (courses.isEmpty()) {
            System.out.println("No se encontraron cursos.");
        } else {
            courses.forEach(course -> System.out.println(String.format("  - %s", course.getTitle())));
        }
    }

    public void printError(String errorMessage) {
        System.err.println(String.format("Error al obtener cursos de %s: %s", this.getInstructorName(), errorMessage));
    }
}