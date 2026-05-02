package com.klef.fsad.exam.repository;

import com.klef.fsad.exam.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for {@link Delivery} entities.
 * Provides CRUD operations via {@link JpaRepository}.
 */
@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
}
