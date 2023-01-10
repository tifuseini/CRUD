package com.example.jpaExample.service;

import com.example.jpaExample.model.Phone;
import com.example.jpaExample.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneService {

    private final PhoneRepository phoneRepository;
    public List<Phone> getAllPhones() {
        return phoneRepository.findAll();
    }
}
