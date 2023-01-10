package com.example.jpaExample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class OrderEntity {


    @Column(name = "order_status")
    private String orderStatus;

    @Id
    @Column(name = "order_id")
    private String orderId;
}
