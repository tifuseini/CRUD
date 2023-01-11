package com.example.jpaExample.service;

import com.example.jpaExample.model.MobileSubscriber;
import com.example.jpaExample.repository.MobileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MobileSubscriberService {

    private final MobileRepository mobileRepository;


    public List<MobileSubscriber> findAllMobileSubscribers() {
        return mobileRepository.findAll();
    }

    public MobileSubscriber findMobileSubscriberById(Long id) {
            return mobileRepository.findById(id).orElse(null);
    }

    public MobileSubscriber createMobileSubscriber(MobileSubscriber mobileSubscriber) {
        mobileSubscriber.setServiceStartDate(ZonedDateTime.now());
        return mobileRepository.save(mobileSubscriber);
    }

    public MobileSubscriber updateMobileSubscriber(MobileSubscriber mobileSubscriber, Long id) {
        var mobileSubscriber1 = mobileRepository.findById(id).orElse(null);
        mobileSubscriber1.setMsisdn(mobileSubscriber.getMsisdn());
        mobileSubscriber1.setCustomerIdOwner(mobileSubscriber.getCustomerIdOwner());
        mobileSubscriber1.setCustomerIdUser(mobileSubscriber.getCustomerIdUser());
        mobileSubscriber1.setServiceType(mobileSubscriber.getServiceType());
        mobileSubscriber1.setServiceUpdateDate(ZonedDateTime.now());
        return mobileRepository.save(mobileSubscriber1);
    }

    public void deleteMobileSubscriber(Long id) {
        mobileRepository.deleteById(id);
    }
}
