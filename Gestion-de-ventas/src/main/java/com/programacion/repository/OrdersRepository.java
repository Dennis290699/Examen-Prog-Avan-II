package com.programacion.repository;

import com.programacion.db.Orders;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository

public interface OrdersRepository extends EntityRepository <Orders, Integer> {
}
