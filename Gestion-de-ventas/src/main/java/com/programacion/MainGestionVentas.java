package com.programacion;

import com.programacion.repository.CustomerRepository;
import com.programacion.repository.OrderItemRepository;
import com.programacion.repository.OrdersRepository;
import com.programacion.repository.ProductRepository;
import com.programacion.service.DataInitializer;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class MainGestionVentas {
    public static void main(String[] args) {
        // Inicializar el contenedor de CDI
        SeContainer container = SeContainerInitializer.newInstance().initialize();

//        // Obtener la instancia de DataInitializer
//        DataInitializer dataInitializer = container.select(DataInitializer.class).get();
//        dataInitializer.insertData();

        // Obtener los repositorios
        CustomerRepository customerRepository = container.select(CustomerRepository.class).get();
        OrderItemRepository orderItemRepository = container.select(OrderItemRepository.class).get();
        OrdersRepository orderRepository = container.select(OrdersRepository.class).get();
        ProductRepository productRepository = container.select(ProductRepository.class).get();

//        // Utilizar los repositorios, por ejemplo, listar todos los clientes
//        customerRepository.findAll().forEach(System.out::println);

        // CustomerBeLike con impresion detallada en consola
        customerRepository.findByNameLike("%John%")
                .forEach(customer -> System.out.println("- " + customer.getName()));

    }
}
