package com.epam.esm.core.repository;

import com.epam.esm.core.entity.GiftCertificate;

import java.util.List;

public interface GiftCertificateRepository {

    GiftCertificate getGiftCertificateById(long id);

    List<GiftCertificate> getAllGiftCertificates();

    GiftCertificate addGiftCertificate(GiftCertificate giftCertificate);

    void removeGiftCertificateById(long id);
}
