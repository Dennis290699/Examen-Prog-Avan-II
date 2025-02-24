package com.programacion;

import com.programacion.db.Course;
import com.programacion.db.Student;
import com.programacion.repository.*;
import com.programacion.service.DataInitializer;
import com.programacion.service.interfaces.CourseService;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

import java.util.List;

public class MainGestionCursos {
    public static void main(String[] args) {
        // Inicializar el contenedor de CDI
        SeContainer container = SeContainerInitializer.newInstance().initialize();

        // Obtener los repositorios
        AssignmentRepository assignmentRepository = container.select(AssignmentRepository.class).get();
        CourseRepository courseRepository = container.select(CourseRepository.class).get();
        EnrollmentRepository enrollmentRepository = container.select(EnrollmentRepository.class).get();
        InstructorRepository instructorRepository = container.select(InstructorRepository.class).get();
        StudentRepository studentRepository = container.select(StudentRepository.class).get();
        SubmissionRepository submissionRepository = container.select(SubmissionRepository.class).get();

        // Obtener el DataInitializer y cargar los datos iniciales para usar esto comentar si se tiene el archivo schema.sql
//        DataInitializer dataInitializer = container.select(DataInitializer.class).get();
//        dataInitializer.insertData(); // Llamamos al metodo que inserta los datos

        // Utilizar los repositorios, por ejemplo, listar todos los cursos
//        courseRepository.findAll().forEach(System.out::println);

        // Inyectar el servicio CourseService
        CourseService courseService = container.select(CourseService.class).get();

        // ✅ Ejemplo 1: Listar cursos por nombre del instructor
        List<Course> instructorCourses = courseService.getCoursesByInstructor("John Doe");
        System.out.println("📘 Cursos del instructor John Doe:");
        instructorCourses.forEach(c -> System.out.println(" - " + c.getTitle()));

        // ✅ Ejemplo 2: Cursos con estudiantes inscritos
        List<Course> activeCourses = courseService.getCoursesWithEnrolledStudents();
        System.out.println("\n📗 Cursos con estudiantes inscritos:");
        activeCourses.forEach(c -> System.out.println(" - " + c.getTitle()));

        // ✅ Ejemplo 3: Cursos entre dos fechas
        List<Course> rangeCourses = courseService.getCoursesByDateRange("2024-03-01", "2024-06-30");
        System.out.println("\n📙 Cursos entre marzo y junio de 2024:");
        rangeCourses.forEach(c -> System.out.println(" - " + c.getTitle()));

        // ✅ Ejemplo 4: Estudiantes inscritos en un curso específico
        List<Student> studentsInCourse = courseService.getStudentsByCourse("Physics 101");
        System.out.println("\n🎓 Estudiantes en Physics 101:");
        studentsInCourse.forEach(s -> System.out.println(" - " + s.getName()));
    }
}
