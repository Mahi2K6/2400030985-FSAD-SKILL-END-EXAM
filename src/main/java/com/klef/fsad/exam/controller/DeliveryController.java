package com.klef.fsad.exam.controller;

import com.klef.fsad.exam.model.Delivery;
import com.klef.fsad.exam.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller exposing delivery management endpoints.
 * Base path: {@code /delivery}
 */
@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    /**
     * Adds a new delivery record.
     * The {@code deliveryId} in the request body must be provided manually.
     *
     * @param delivery the delivery data from the request body
     * @return {@code 201 Created} with a confirmation message
     */
    @PostMapping("/add")
    public ResponseEntity<String> addDelivery(@RequestBody Delivery delivery) {
        deliveryService.addDelivery(delivery);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Delivery added successfully with ID: " + delivery.getDeliveryId());
    }

    /**
     * Deletes a delivery by its ID.
     *
     * @param id the primary key of the delivery to remove
     * @return {@code 200 OK} if deleted, {@code 404 Not Found} if the ID does not exist
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDelivery(@PathVariable int id) {
        boolean deleted = deliveryService.deleteDelivery(id);
        if (deleted) {
            return ResponseEntity.ok("Delivery with ID " + id + " deleted successfully.");
        }
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body("Delivery with ID " + id + " not found.");
    }
}
