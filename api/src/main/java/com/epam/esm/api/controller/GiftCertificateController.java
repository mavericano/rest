package com.epam.esm.api.controller;

import com.epam.esm.core.entity.GiftCertificate;
import com.epam.esm.core.service.GiftCertificateService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/gift-certificates")
public class GiftCertificateController {

    final GiftCertificateService giftCertificateService;

    public GiftCertificateController(GiftCertificateService giftCertificateService) {
        this.giftCertificateService = giftCertificateService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<GiftCertificate> getAllGiftCertificates() {
        System.out.println("eto get zapros");
        return giftCertificateService.getAllGiftCertificates();
    }
}
