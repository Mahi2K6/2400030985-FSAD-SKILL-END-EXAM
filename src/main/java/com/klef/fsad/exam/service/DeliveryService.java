package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Delivery;
import com.klef.fsad.exam.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service layer for delivery business logic.
 * Delegates persistence operations to {@link DeliveryRepository}.
 */
@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    /**
     * Persists a new delivery. The {@code deliveryId} must be set manually by the caller.
     *
     * @param d the {@link Delivery} object to save
     * @return the saved {@link Delivery} entity
     */
    public Delivery addDelivery(Delivery d) {
        return deliveryRepository.save(d);
    }

    /**
     * Deletes a delivery by its primary key if it exists.
     *
     * @param id the ID of the delivery to delete
     * @return {@code true} if deleted, {@code false} if no record was found
     */
    public boolean deleteDelivery(int id) {
        if (deliveryRepository.existsById(id)) {
            deliveryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
