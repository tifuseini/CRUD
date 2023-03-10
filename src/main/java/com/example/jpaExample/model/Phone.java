package com.example.jpaExample.model;


import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbl_phone")
public class Phone extends RepresentationModel<Phone> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "phone_name")
    private String phoneName;

    @Column(name = "os")
    private String os;
}
