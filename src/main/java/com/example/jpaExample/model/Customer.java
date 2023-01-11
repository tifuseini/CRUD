package com.example.jpaExample.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {

    @Column(name = "customer_name")
    private String customerName;

    @Id
    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "customer_address")
    private String customerAddress;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id",referencedColumnName = "customer_id")
    private Set<OrderEntity> orders;
}
