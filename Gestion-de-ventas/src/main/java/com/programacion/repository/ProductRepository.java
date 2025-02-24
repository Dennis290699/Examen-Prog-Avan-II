package com.programacion.repository;

import com.programacion.db.Product;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface ProductRepository extends EntityRepository<Product, Integer> {
    //query para obtener los productos por nombre
    @Query("SELECT p FROM Product p WHERE p.name = :name")
    Product findByName(String name);
}
