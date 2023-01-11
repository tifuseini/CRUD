package com.example.jpaExample.repository;

import com.example.jpaExample.model.MobileSubscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepository extends JpaRepository<MobileSubscriber,Long> {
}
