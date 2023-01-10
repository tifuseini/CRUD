package com.example.jpaExample.controller;

import com.example.jpaExample.model.Phone;
import com.example.jpaExample.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/api/v1/phone")
@RequiredArgsConstructor
public class PhoneController {

    private final PhoneService phoneService;

    @GetMapping("/")
    public List<Phone> getAllPhones() {
//        Link link = linkTo(methodOn(PhoneController.class).getAllPhones()).withSelfRel();
//        return phoneService.findAllPhones();

        var phone = phoneService.findAllPhones();
        for (Phone p : phone) {
            p.add(linkTo(methodOn(PhoneController.class).getAllPhones()).withSelfRel());
            p.add(linkTo(methodOn(PhoneController.class).getPhoneById(p.getId())).withRel("get phone by id"));
            p.add(linkTo(methodOn(PhoneController.class).createPhone(p)).withRel("create-phone"));
            p.add(linkTo(methodOn(PhoneController.class).updatePhone(p, p.getId())).withRel("update-phone"));
        }
        return phone;

    }

    @GetMapping("/{id}")
    public Phone getPhoneById(@PathVariable Long id) {
        return phoneService.findPhoneById(id);
    }

    @PostMapping("/")
    public Phone createPhone(@RequestBody Phone phone) {
        return phoneService.createPhone(phone);
    }

    @PutMapping("/update/{id}")
    public Phone updatePhone(@RequestBody Phone phone, @PathVariable Long id) {
        return phoneService.updatePhone(phone,id);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePhone(@PathVariable Long id) {
        phoneService.deletePhone(id);
    }
}
