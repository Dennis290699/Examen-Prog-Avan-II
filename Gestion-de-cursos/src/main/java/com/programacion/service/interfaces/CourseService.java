package com.programacion.service.interfaces;

import com.programacion.db.Course;
import com.programacion.db.Student;
import jakarta.persistence.EntityManager;

import java.util.List;

public interface CourseService {
    List<Course> getCoursesByInstructor(String instructorName);
    List<Course> getCoursesWithEnrolledStudents();
    List<Course> getCoursesByDateRange(String startDate, String endDate);
    List<Student> getStudentsByCourse(String courseTitle);
    EntityManager getEntityManager();
}
