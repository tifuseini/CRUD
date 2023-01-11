package com.example.jpaExample.controller;

import com.example.jpaExample.model.MobileSubscriber;
import com.example.jpaExample.service.MobileSubscriberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/mobile")
public class MobileSubscriberController {

    private final MobileSubscriberService mobileSubscriberService;

    @GetMapping("/")
    public List<MobileSubscriber> getAllMobileSubscribers() {
        return null;
    }

    @GetMapping("/{id}")
    public MobileSubscriber getMobileSubscriberById(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/")
    public MobileSubscriber createMobileSubscriber(@RequestBody MobileSubscriber mobileSubscriber) {
        return null;
    }

    @PutMapping("/update/{id}")
    public MobileSubscriber updateMobileSubscriber(@RequestBody MobileSubscriber mobileSubscriber, @PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMobileSubscriber(@PathVariable Long id) {

    }

}
