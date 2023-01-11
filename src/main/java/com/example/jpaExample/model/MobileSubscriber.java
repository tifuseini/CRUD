package com.example.jpaExample.model;

import jakarta.persistence.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "tbl_mobile_subscriber")
public class MobileSubscriber {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "msisdn",nullable = false)
    private String msisdn;

    @Column(name = "customer_id_owner",nullable = false)
    private int customerIdOwner;

    @Column(name = "customer_id_user",nullable = false)
    private int customerIdUser;

    @Column(name = "service_type",nullable = false)
    private String serviceType;

    @Column(name = "service_start_date",nullable = false)
    @CreationTimestamp
    private Date serviceStartDate;

    @Column(name = "service_update_date")
    @UpdateTimestamp
    private Date serviceUpdateDate;

}
