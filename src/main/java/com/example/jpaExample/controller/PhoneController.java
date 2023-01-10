package com.example.jpaExample.controller;

import com.example.jpaExample.model.Phone;
import com.example.jpaExample.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/phone")
@RequiredArgsConstructor
public class PhoneController {

    private final PhoneService phoneService;

    @GetMapping("/")
    public List<Phone> getAllPhones() {
        return phoneService.getAllPhones();
    }

    @GetMapping("/{id}")
    public Phone getPhoneById() {
        return null;
    }

    @PostMapping("/")
    public Phone createPhone() {
        return null;
    }

    @PutMapping("/update/{id}")
    public Phone updatePhone() {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void deletePhone() {
    }
}
