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
    public List<Phone> findAllPhones() {
        return phoneRepository.findAll();
    }

    public Phone findPhoneById(Long id) {

        return phoneRepository.findById(id).orElse(null);
    }

    public Phone createPhone(Phone phone) {
        return phoneRepository.save(phone);
    }

    public Phone updatePhone(Phone phone, Long id) {
        Phone phone1 = phoneRepository.findById(id).orElse(null);
        phone1.setPhoneName(phone.getPhoneName());
        phone1.setOs(phone.getOs());
        return phoneRepository.save(phone1);
    }

    public void deletePhone(Long id) {
        phoneRepository.deleteById(id);
    }
}
