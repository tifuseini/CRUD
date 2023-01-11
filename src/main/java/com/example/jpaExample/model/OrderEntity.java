package com.example.jpaExample.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
