package com.example.jpaExample.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "phone_name")
    private String phoneName;

    @Column(name = "os")
    private String os;
}
