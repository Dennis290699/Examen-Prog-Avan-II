package com.programacion.service;

import com.programacion.db.Customer;
import com.programacion.db.OrderItem;
import com.programacion.db.Orders;
import com.programacion.db.Product;
import com.programacion.repository.CustomerRepository;
import com.programacion.repository.OrderItemRepository;
import com.programacion.repository.OrdersRepository;
import com.programacion.repository.ProductRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.math.BigDecimal;

@ApplicationScoped
public class DataInitializer {
    @Inject
    private CustomerRepository customerRepository;

    @Inject
    private OrdersRepository orderRepository;

    @Inject
    private ProductRepository productRepository;

    @Inject
    private OrderItemRepository orderItemRepository;

    @Transactional
    public void insertData() {
        // 1. Crear un cliente
        Customer customer = new Customer();
        customer.setName("John Doe");
        customer.setEmail("john.doe@example.com");
        customerRepository.save(customer);

        // 2. Crear un pedido
        Orders order = new Orders();
        order.setCustomer(customer);
        order.setOrderDate("2024-02-20");
        order.setTotalAmount(new BigDecimal("100.99"));
        orderRepository.save(order);

        // 3. Crear un producto
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(new BigDecimal("99.99"));
        productRepository.save(product);

        // 4. Crear un detalle de pedido
        OrderItem orderItem = new OrderItem();
        orderItem.setOrders(order);
        orderItem.setProduct(product);
        orderItem.setQuantity(2);
        orderItemRepository.save(orderItem);

        System.out.println("Datos insertados correctamente");
    }
}
