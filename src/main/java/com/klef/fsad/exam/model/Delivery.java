package com.klef.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * JPA entity representing a delivery record.
 * The {@code deliveryId} is the primary key and must be assigned manually in every request.
 */
@Entity
@Table(name = "delivery")
public class Delivery {

    @Id
    private int deliveryId;

    private String name;
    private String deliveryDate;
    private String status;
    private String destination;

    // ── Constructors ──────────────────────────────────────────────────────────

    public Delivery() {}

    public Delivery(int deliveryId, String name, String deliveryDate,
                    String status, String destination) {
        this.deliveryId   = deliveryId;
        this.name         = name;
        this.deliveryDate = deliveryDate;
        this.status       = status;
        this.destination  = destination;
    }

    // ── Getters & Setters ─────────────────────────────────────────────────────

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
