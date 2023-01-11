package com.example.jpaExample.repository;

import com.example.jpaExample.model.MobileSubscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepository extends JpaRepository<MobileSubscriber,Long> {
}
