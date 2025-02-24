package com.programacion.service;

import com.programacion.db.Book;
import com.programacion.db.Loan;
import com.programacion.db.LoanStatus;
import com.programacion.db.User;
import com.programacion.repository.BookRepository;
import com.programacion.repository.LoanRepository;
import com.programacion.repository.UserRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class DataInserts {
    // Inyectar los repositorios
    @Inject
    BookRepository bookRepository;

    @Inject
    LoanRepository loanRepository;

    @Inject
    UserRepository userRepository;

    @Transactional
    public void insertData() {

        // Crear un usuario
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        user.setDateRegister("2023-01-01");
        userRepository.save(user);

        // Crear un libro
        Book book = new Book();
        book.setTitle("Cien años de soledad");
        book.setAuthor("Gabriel Garcia Marquez");
        book.setCategory("Ficcion");
        book.setIsAvailable(true);
        bookRepository.save(book);

        // Crear un prestamo
        Loan loan = new Loan();
        loan.setLoanDate("2024-01-01");
        loan.setStatus(String.valueOf(LoanStatus.PRESTADO));
        loan.setBook(book);
        loan.setUser(user);
        loanRepository.save(loan);

        System.out.println("Datos insertados correctamente");
    }
}
