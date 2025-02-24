package com.programacion.service.impl;

import com.programacion.db.Course;
import com.programacion.db.Student;
import com.programacion.service.interfaces.CourseService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class CourseServiceImpl implements CourseService {

    @Inject
    private EntityManager em;

    // Metodo para obtener cursos por nombre del instructor
    @Override
    @Transactional
    public List<Course> getCoursesByInstructor(String instructorName) {
        return em.createQuery(
                        "SELECT c FROM Course c WHERE c.instructor.name = :instructorName", Course.class)
                .setParameter("instructorName", instructorName)
                .getResultList();
    }

    // Metodo para obtener cursos con estudiantes inscritos
    @Override
    @Transactional
    public List<Course> getCoursesWithEnrolledStudents() {
        return em.createQuery(
                        "SELECT DISTINCT c FROM Course c JOIN c.enrollments e", Course.class)
                .getResultList();
    }

    // Metodo para obtener cursos por rango de fechas
    @Override
    @Transactional
    public List<Course> getCoursesByDateRange(String startDate, String endDate) {
        return em.createQuery(
                        "SELECT c FROM Course c WHERE c.startDate >= :startDate AND c.endDate <= :endDate", Course.class)
                .setParameter("startDate", startDate)
                .setParameter("endDate", endDate)
                .getResultList();
    }

    // Metodo para obtener estudiantes por curso
    @Override
    @Transactional
    public List<Student> getStudentsByCourse(String courseTitle) {
        return em.createQuery(
                        "SELECT e.student FROM Enrollment e WHERE e.course.title = :courseTitle", Student.class)
                .setParameter("courseTitle", courseTitle)
                .getResultList();
    }

    // Metodo para obtener el EntityManager
    @Override
    public EntityManager getEntityManager() {
        return em;
    }
}