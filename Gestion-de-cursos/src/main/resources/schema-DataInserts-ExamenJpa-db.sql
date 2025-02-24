-- 📁 Instructores
INSERT INTO Instructor (id, name, email, speciality) VALUES (1, 'John Doe', 'john.doe@example.com', 'Mathematics');
INSERT INTO Instructor (id, name, email, speciality) VALUES (2, 'Sarah Johnson', 'sarah.j@example.com', 'Physics');

-- 📁 Cursos
INSERT INTO Course (id, title, description, startDate, endDate, instructor_id) VALUES (1, 'Calculus 101', 'Introductory calculus course', '2024-03-01', '2024-06-30', 1);
INSERT INTO Course (id, title, description, startDate, endDate, instructor_id) VALUES (2, 'Physics 101', 'Fundamentals of physics', '2024-03-05', '2024-07-01', 2);

-- 📁 Estudiantes
INSERT INTO Student (id, name, email, enrollmentDate) VALUES (1, 'Alice Smith', 'alice.smith@example.com', '2024-02-20');
INSERT INTO Student (id, name, email, enrollmentDate) VALUES (2, 'Bob Brown', 'bob.brown@example.com', '2024-02-22');

-- 📁 Inscripciones
INSERT INTO Enrollment (id, enrollmentDate, student_id, course_id) VALUES (1, '2024-02-21', 1, 1);
INSERT INTO Enrollment (id, enrollmentDate, student_id, course_id) VALUES (2, '2024-02-25', 2, 2);

-- 📁 Asignaciones
INSERT INTO Assignment (id, title, dueDate, course_id) VALUES (1, 'Derivatives Homework', '2024-03-15', 1);
INSERT INTO Assignment (id, title, dueDate, course_id) VALUES (2, 'Newton Laws', '2024-03-20', 2);

-- 📁 Entregas
INSERT INTO Submission (id, submissionDate, grade, assignment_id, student_id) VALUES (1, '2024-03-14', 'A', 1, 1);
INSERT INTO Submission (id, submissionDate, grade, assignment_id, student_id) VALUES (2, '2024-03-18', 'B', 2, 2);
