package com.programacion.repository;

import com.programacion.db.OrderItem;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface OrderItemRepository extends EntityRepository<OrderItem, Integer> {
}
