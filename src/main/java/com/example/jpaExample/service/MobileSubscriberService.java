package com.example.jpaExample.service;

import com.example.jpaExample.repository.MobileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MobileSubscriberService {

    private final MobileRepository mobileRepository;


}
